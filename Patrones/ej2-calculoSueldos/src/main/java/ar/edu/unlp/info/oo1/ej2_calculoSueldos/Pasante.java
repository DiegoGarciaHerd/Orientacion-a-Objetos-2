package ar.edu.unlp.info.oo1.ej2_calculoSueldos;

public class Pasante extends Empleado {
	private int examenesRendidos;
	@Override
	public double getSueldoBasico() {
		return 20000;
	}

	@Override
	public double getAdicional() {
		return 2000*examenesRendidos;
	}

	public Pasante(int horasTrabajadas, String estadoCivil, int cantHijos, int antiguedad, int examenesRendidos) {
		super(horasTrabajadas, estadoCivil, cantHijos, antiguedad);
		this.examenesRendidos = examenesRendidos;
	}

	
	
	
}
