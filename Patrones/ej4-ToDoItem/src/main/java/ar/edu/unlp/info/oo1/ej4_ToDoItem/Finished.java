package ar.edu.unlp.info.oo1.ej4_ToDoItem;

public class Finished extends StateTDI {
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public void start(ToDoItem item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finish(ToDoItem toDoItem) {
		// TODO Auto-generated method stub
		
	}
}
