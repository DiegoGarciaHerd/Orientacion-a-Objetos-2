import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServer {

    public abstract void handleMessage(String message, PrintWriter out);

    public final void startLoop(String[] args) {
        checkArguments(args);

        int portNumber = Integer.parseInt(args[0]);

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            displaySocketInformation(portNumber);
            while (true) {
                Socket clientSocket = acceptAndDisplaySocket(serverSocket);
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            displayAndExit(portNumber);
        }
    }

    protected void displayAndExit(int portNumber) {
        System.err.println("Could not listen on port " + portNumber);
        System.exit(-1);
    }

    protected Socket acceptAndDisplaySocket(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        displaySocketData(clientSocket);
        return clientSocket;
    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
    }

    protected void checkArguments(String[] args) {
        if (args.length != 1) {
            displayUsage();
            System.exit(1);
        }
    }

    protected void displayUsage() {
        System.err.println("Usage: java"+this.getClass().getName() +"<port number>");
    }

    

    private final void handleClient(Socket clientSocket) {
        
    	try (
    	        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
    	        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
    	    ) {
    	        onClientConnected(clientSocket); // HOOK opcional

    	        String inputLine;
    	        while ((inputLine = in.readLine()) != null) {
    	            onMessageReceived(inputLine, clientSocket); // HOOK opcional
    	            	
    	            if (shouldCloseConnection(inputLine)) { // HOOK con valor por defecto
    	                break;
    	            }

    	            handleMessage(inputLine, out); // Método abstracto
    	        }

    	        onClientDisconnected(clientSocket); // HOOK opcional

    	    } catch (IOException e) {
    	        onClientCommunicationError(clientSocket, e); // HOOK opcional
    	    } finally {
    	        try {
    	            clientSocket.close();
    	        } catch (IOException e) {
    	            System.err.println("Error closing socket: " + e.getMessage());
    	        }
    	    }
    }
    
    /**
     * Hook: llamado cuando se conecta un cliente.
     */
    protected void onClientConnected(Socket clientSocket) {
        // Por defecto: no hace nada
    }

    /**
     * Hook: llamado cada vez que se recibe un mensaje.
     */
    protected void onMessageReceived(String message, Socket clientSocket) {
        System.out.println("Received message: " + message + " from "
            + clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());
    }

    /**
     * Hook: permite decidir si se debe cerrar la conexión.
     * Por defecto, cierra si el mensaje está vacío.
     */
    protected boolean shouldCloseConnection(String message) {
        return message.equalsIgnoreCase("");
    }

    /**
     * Hook: llamado cuando se desconecta un cliente.
     */
    protected void onClientDisconnected(Socket clientSocket) {
        System.out.println("Connection closed with " 
            + clientSocket.getInetAddress().getHostAddress() + ":" + clientSocket.getPort());
    }

    /**
     * Hook: manejo de errores de comunicación.
     */
    protected void onClientCommunicationError(Socket clientSocket, IOException e) {
        System.err.println("Problem with communication with client: " + e.getMessage());
    }

}
