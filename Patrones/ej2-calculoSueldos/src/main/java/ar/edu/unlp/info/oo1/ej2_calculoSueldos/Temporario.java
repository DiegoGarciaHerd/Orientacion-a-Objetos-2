package ar.edu.unlp.info.oo1.ej2_calculoSueldos;

public class Temporario extends Empleado {
	
	
	public Temporario(int horasTrabajadas, String estadoCivil, int cantHijos, int antiguedad) {
		super(horasTrabajadas, estadoCivil, cantHijos, antiguedad);
		// TODO Auto-generated constructor stub
	}

	public double getSueldoBasico () {
		return 20000 + (this.getHorasTrabajadas() * 300); 
	}
	
	public double getAdicional () {
		double sueldo; 
		sueldo = 2000 * this.getCantHijos(); 
		
		if(estaCasado()) {
			sueldo +=5000; 
		}
		
		return sueldo; 
	}
	
	
	
	
}
