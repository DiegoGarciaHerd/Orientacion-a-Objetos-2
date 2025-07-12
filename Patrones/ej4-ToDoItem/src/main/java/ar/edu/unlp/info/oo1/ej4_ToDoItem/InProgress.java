package ar.edu.unlp.info.oo1.ej4_ToDoItem;

import java.time.Duration;
import java.time.LocalDate;

public class InProgress extends StateTDI {
		
		public InProgress(ToDoItem task) {
			super(task);
			this.getTask().setStartDate();
		}

		@Override
		public void togglePause() {
			ToDoItem task = this.getTask();
			task.setState(new Paused(task));
		}

		@Override
		public void finish() {
			ToDoItem task = this.getTask();
			task.setState(new Finished(task));
		}
		
		@Override
		public Duration workedTime() {
			return Duration.between(this.getTask().getStartDate(), LocalDate.now());
		}


}
