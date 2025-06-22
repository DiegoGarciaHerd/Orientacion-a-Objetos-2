package ar.edu.unlp.info.oo1.ej2_calculoSueldos;

public abstract class Empleado {
	private int horasTrabajadas;
	private String estadoCivil;
	private int cantHijos;
	private int antiguedad;
	
	public Empleado(int horasTrabajadas, String estadoCivil, int cantHijos, int antiguedad) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.estadoCivil = estadoCivil;
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}

	public double sueldo () {
		return this.getSueldoBasico() + this.getAdicional() - this.getDescuento();
	}
	
	public abstract double getSueldoBasico();
	public abstract double getAdicional(); 
	
	public double getDescuento () {
		return this.getSueldoBasico() * 0.13 + this.getAdicional() * 0.05;
	}
	
	public int getCantHijos() {
		return this.cantHijos;
	}

	public int getHorasTrabajadas() {
		return this.horasTrabajadas;
	}
	public boolean estaCasado() {
		if(estadoCivil.equals("Casado")) {
			return true; 
			
		}
		else {
			return false;
		}
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
}
