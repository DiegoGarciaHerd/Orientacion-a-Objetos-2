package ar.edu.unlp.info.oo2.ej14_PrestamosPrendarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automovil extends Prenda {
	private LocalDate modelo;
	private int kms;
	private int costo0km;
	
	@Override
	public double getValor() {
		return this.costo0km * (0.1 * this.getAntiguedad());
	}

	@Override
	public double getCoeficienteLiquidez() {
		// TODO Auto-generated method stub
		return 0.7;
	}
	
	public int getAntiguedad() {
		return (int) ChronoUnit.YEARS.between(modelo, LocalDate.now());
	}
	
}
