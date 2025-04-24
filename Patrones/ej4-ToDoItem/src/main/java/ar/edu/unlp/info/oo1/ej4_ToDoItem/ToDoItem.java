package ar.edu.unlp.info.oo1.ej4_ToDoItem;

public class ToDoItem {
		private StateTDI state;
		private String name;
		/**
		* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
		*/
		  public ToDoItem(String name) {
			  state = new Pending(); 
			  this.name =name;
		  }

		   	/**
		* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
		* pending. Si se encuentra en otro estado, no hace nada.
		*/
		  public void start() { 
			  state.start(this);
		  }

			/**
		* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
		* estado es paused. Caso contrario (pending o finished) genera un error
		* informando la causa específica del mismo.
		*/

	        public void togglePause() {
	        	state.togglePause(this);
	        }


		/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	        public void finish() {
	        	state.finish(this);
	        }


		/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	        public Duration workedTime( ) {
	        	Duration.
	        }


	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	        public void addComment(String comment) {
	        	
	}

	public void setState(StateTDI state) {
		this.state = state;
		
	}
}
