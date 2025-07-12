package ar.edu.unlp.info.oo1.ej4_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends StateTDI {

	public Paused(ToDoItem task) {
		super(task);
	}
	
	@Override
	public void togglePause() {
		ToDoItem task = this.getTask();
		task.setState(new InProgress(task));
	}

	@Override
	public void finish() {
		ToDoItem task = this.getTask();
		task.setState(new Finished(task));
	}

	@Override
	public Duration workedTime() {
		return Duration.between(this.getTask().getStartDate(), LocalDateTime.now());
	}
}
