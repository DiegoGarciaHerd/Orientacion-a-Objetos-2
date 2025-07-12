package ar.edu.unlp.oo2.Parcial4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CoseguroReal implements Coseguro {
	private String nombre;
	private double descuento;
	private LocalDate fechaIngreso;
	private double montoCoberturaViajes;
	
	public CoseguroReal(double descuento, LocalDate fechaIngreso, int monto) {
		this.descuento = descuento;
		this.fechaIngreso = fechaIngreso;
		this.montoCoberturaViajes = monto;
	}
	@Override
	public double getDescuento() {
		return this.descuento;
	}
	@Override
	public double getMontoCoberturaViajes() {
		return this.montoCoberturaViajes;
	}
	@Override
	public int getAntiguedad() {
		return (int) ChronoUnit.YEARS.between(fechaIngreso, LocalDate.now());
	}
	
	
}
