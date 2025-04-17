package ar.edu.unlp.info.oo1.ej2_calculoSueldos;

public abstract class Empleado {

	public double sueldo () {
		this.getSueldoBasico() + this.getAdicional + this. getDescuento();
	}
	
	public abstract double getSueldoBasico();
	public abstract double getAdicional(); 
	
	public double getDescuento () {
		return this.getSueldoBasico() * 0.13 + this.getAdicional() * 0.05;
	}
}
