package ar.edu.unlp.info.oo1.ej4_ToDoItem;

public class InProgress extends StateTDI {
	
	public void togglePause(ToDoItem item) {
		item.setState(new Paused());
	}
}
