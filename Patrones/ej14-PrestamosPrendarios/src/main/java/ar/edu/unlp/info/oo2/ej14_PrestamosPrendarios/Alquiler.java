package ar.edu.unlp.info.oo2.ej14_PrestamosPrendarios;

import java.time.LocalDate;

public class Alquiler extends Prenda {
	private LocalDate comienzoContrato;
	private LocalDate finContrato; 
	private double costoMensual;
	
	@Override
	public double getValor() {
		/* Meses que faltan del contrato * costo mensua */
		return LocalDate.now().until(finContrato).toTotalMonths() * this.getCostoMensual();
	}
	@Override
	public double getCoeficienteLiquidez() {
		// TODO Auto-generated method stub
		return 0.9;
	}
	
	public LocalDate getComienzoContrato() {
		return comienzoContrato;
	}
	public void setComienzoContrato(LocalDate comienzoContrato) {
		this.comienzoContrato = comienzoContrato;
	}
	public LocalDate getFinContrato() {
		return finContrato;
	}
	public void setFinContrato(LocalDate finContrato) {
		this.finContrato = finContrato;
	}
	public double getCostoMensual() {
		return costoMensual;
	}
	public void setCostoMensual(double costoMensual) {
		this.costoMensual = costoMensual;
	}
	
	
}
