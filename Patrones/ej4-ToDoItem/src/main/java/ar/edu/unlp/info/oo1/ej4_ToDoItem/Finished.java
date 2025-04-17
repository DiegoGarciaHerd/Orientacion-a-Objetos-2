package ar.edu.unlp.info.oo1.ej4_ToDoItem;

public class Finished extends StateTDI {
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
}
