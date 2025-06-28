package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {
	private DatabaseAccess database;
	private boolean loggedIn;
	private String psswd;
	
	public DatabaseAccessProxy (DatabaseAccess database2 , String psswd) {
		loggedIn = false;
		database = database2;
		this.psswd = psswd;
	}
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.loggedIn) {
			return database.getSearchResults(queryString);
		} 
		else {
			throw new IllegalArgumentException("El usuario no se encuentra registrado");
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.loggedIn) {
			return database.insertNewRow(rowData);
		}
		else {
			throw new IllegalArgumentException("El usuario no se encuentra registrado");
		}
	}
	
	public void login ( String psswd) {
		if(!this.loggedIn) {
			if(this.psswd.equals(psswd)) {
				this.loggedIn = true;
			} else {
				throw new RuntimeException("Contraseña inválida");
			}
		} else {
			throw new RuntimeException("Sesión ya iniciada");
		}
	}
	
	public void logOut() {
		this.loggedIn = false;
	}
}
