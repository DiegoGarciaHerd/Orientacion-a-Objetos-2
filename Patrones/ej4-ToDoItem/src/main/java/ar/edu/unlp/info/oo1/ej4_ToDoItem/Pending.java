package ar.edu.unlp.info.oo1.ej4_ToDoItem;

import java.time.Duration;

public class Pending extends StateTDI {
	
	public Pending(ToDoItem task) {
		super(task);
	}
	
	@Override
	public void start() {
		ToDoItem task = this.getTask();
		task.setState(new InProgress(task));
	}

	@Override
	public void togglePause() throws RuntimeException {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public Duration workedTime() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause, in-progress o finished");
	}
	
}
