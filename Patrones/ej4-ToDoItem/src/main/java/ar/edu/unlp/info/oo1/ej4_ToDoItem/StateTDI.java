package ar.edu.unlp.info.oo1.ej4_ToDoItem;

import java.time.Duration;

public abstract class StateTDI {
	private ToDoItem task;
	
	public StateTDI (ToDoItem task) {
		this.task = task;
	}
	
	public ToDoItem getTask() {
		return this.task;
	}
	public void start() {};

	public abstract void togglePause();

	public void finish() {};

	protected abstract Duration workedTime();
	
	public void addComment(String comment) {
		this.task.getComments().add(comment);
	}
	

	
}
