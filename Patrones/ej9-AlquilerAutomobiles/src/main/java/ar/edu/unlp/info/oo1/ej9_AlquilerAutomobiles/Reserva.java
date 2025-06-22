package ar.edu.unlp.info.oo1.ej9_AlquilerAutomobiles;

import java.time.LocalDate;


public class Reserva {
	private Usuario conductor;
	private int cantidadDias;
	private LocalDate fecha; 
	private AutoEnAlquiler auto;
	private Strategy strategy;
	
	/* El monto a pagar por una reserva se calcula como el precio por día del auto del cual se hizo la reserva,  
	 * multiplicado por la cantidad de días. */
	public double montoAPagar () {
		return auto.getPrecioPorDia() * this.cantidadDias;
	}
	
	
	public double montoAReembolsar (LocalDate fechaCancelacion) {
		return strategy.montoAReembolsar(this.montoAPagar(),this.fecha,fechaCancelacion);
	}


	public Usuario getConductor() {
		return conductor;
	}


	public void setConductor(Usuario conductor) {
		this.conductor = conductor;
	}


	public int getCantidadDias() {
		return cantidadDias;
	}


	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public AutoEnAlquiler getAuto() {
		return auto;
	}


	public void setAuto(AutoEnAlquiler auto) {
		this.auto = auto;
	}


	public Strategy getStrategy() {
		return strategy;
	}


	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
	
}
