package ar.edu.unlp.oo2.Parcial3;

public class Cliente {
	private String nombre;
	private double salarioMensual;
	public Cliente(String nombre, double salario) {
		this.nombre= nombre;
		this.salarioMensual = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	
	
}
