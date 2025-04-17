package ar.edu.unlp.info.oo1.ej4_ToDoItem;

public class Pending extends StateTDI {
	
	public void start (ToDoItem item) {
		item.setState(new InProgress()); 
	}
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	
}
