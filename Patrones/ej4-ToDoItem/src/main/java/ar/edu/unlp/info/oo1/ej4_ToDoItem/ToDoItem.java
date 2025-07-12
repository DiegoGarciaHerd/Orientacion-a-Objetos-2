package ar.edu.unlp.info.oo1.ej4_ToDoItem;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.LinkedList;
import java.util.List;

public class ToDoItem {
	private StateTDI state;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<String> comments;
	
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	 public ToDoItem(String name) {
	    this.name = name;
	    this.state = new Pending(this);
	    this.comments = new LinkedList<String>();
	 }
	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	public void start() { 
		state.start();
	}

	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/

	 public void togglePause() {
		 state.togglePause();
	 }

	/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	public void finish() {
		state.finish();
	}


	/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	public Duration workedTime( ) {
		return this.state.workedTime();    	
	}


	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	public void addComment(String comment) {
		this.state.addComment(comment);
	}

	public void setState(StateTDI state) {
		this.state = state;
		
	}

	public void setStartDate() {
		this.startDate = LocalDate.now();
	}
	
	public void setEndDate() {
		this.endDate = LocalDate.now();
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	
	public List<String> getComments() {
		return this.comments;
	}
	
	public StateTDI getState() {
		return this.state;
	}

}
