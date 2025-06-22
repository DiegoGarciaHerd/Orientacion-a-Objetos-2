package ar.edu.unlp.info.oo1.ej2_calculoSueldos;

public class Planta extends Empleado {

	
	public Planta(int horasTrabajadas, String estadoCivil, int cantHijos, int antiguedad) {
		super(horasTrabajadas, estadoCivil, cantHijos, antiguedad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSueldoBasico() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public double getAdicional() {
		double sueldo =0;
		if(this.estaCasado()) {
			sueldo+=5000;
		}
		
		sueldo = sueldo + 2000 * this.getCantHijos();
		sueldo = sueldo + 2000 *this.getAntiguedad();
	
		return sueldo;
	}
}
