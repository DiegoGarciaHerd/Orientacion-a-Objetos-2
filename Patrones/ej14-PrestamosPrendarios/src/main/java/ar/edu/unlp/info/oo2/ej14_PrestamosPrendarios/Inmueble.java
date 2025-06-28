package ar.edu.unlp.info.oo2.ej14_PrestamosPrendarios;

public class Inmueble extends Prenda {
	private String direccion;
	private double superficie;
	private double costoMetroCuadrado;
	
	@Override
	public double getValor() {
		return this.superficie * this.costoMetroCuadrado;
	}
	@Override
	public double getCoeficienteLiquidez() {
		return 0.2;
	}
	
	
}
