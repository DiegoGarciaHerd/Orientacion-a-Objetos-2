package ar.edu.unlp.info.oo1.ej2_calculoSueldos;

public class Temporario extends Empleado {
	
	public double getSueldoBasico () {
		return 20000 * this.getHorasTrabajadas() * 300; 
	}
	
	public double getAdicional () {
		double sueldo; 
		sueldo = 5000 * this.getCantHijos(); 
		
		if(isCasado()) {
			sueldo +=5000; 
		}
		
		return sueldo; 
	}
	
	public double 
}
