package SingleThreadTCPServer;

import java.io.PrintWriter;

public class PasswordServer extends SingleThreadTCPServer {

	@Override
	public void handleMessage(String message, PrintWriter out) {
		
		
	}
	
	 public static void main(String[] args) {

	        new EchoServer().startLoop(args);

	 }
}
