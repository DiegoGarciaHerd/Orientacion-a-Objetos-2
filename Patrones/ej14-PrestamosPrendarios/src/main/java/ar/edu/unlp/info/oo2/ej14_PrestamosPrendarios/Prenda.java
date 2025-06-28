package ar.edu.unlp.info.oo2.ej14_PrestamosPrendarios;

import java.util.List;

public abstract class Prenda {
	
	public double calcularValor() {
		return this.getValor() * this.getCoeficienteLiquidez();
	}
	
	public abstract double getValor();
	
	public abstract double getCoeficienteLiquidez();
	
}
