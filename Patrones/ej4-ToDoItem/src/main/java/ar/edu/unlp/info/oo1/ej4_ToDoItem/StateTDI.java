package ar.edu.unlp.info.oo1.ej4_ToDoItem;

public abstract class StateTDI {

	public abstract void start(ToDoItem item);

	public abstract void togglePause(ToDoItem toDoItem);

	public abstract void finish(ToDoItem toDoItem);
	
	
}
