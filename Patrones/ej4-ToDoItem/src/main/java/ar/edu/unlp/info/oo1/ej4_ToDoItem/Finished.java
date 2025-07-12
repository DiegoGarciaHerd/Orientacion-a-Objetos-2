package ar.edu.unlp.info.oo1.ej4_ToDoItem;

import java.time.Duration;

public class Finished extends StateTDI {
	
	public Finished(ToDoItem task) {
		super(task);
	}

	@Override
	public void togglePause()  {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	@Override
	public Duration workedTime() {
		return Duration.between(this.getTask().getStartDate(), this.getTask().getEndDate());
	}

	@Override
	public void addComment(String comment) {}
}
