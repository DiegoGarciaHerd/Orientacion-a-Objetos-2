package ar.edu.unlp.oo2.Parcial4;

public class PlanIntegral extends PlanMedico {
	private double descuentoCobertura;
	
	public PlanIntegral(double montoFijo, double cargo, double costoCobertura, double seguro) {
		super(montoFijo, cargo, costoCobertura, seguro);
		this.descuentoCobertura = 10000;
	}
	
	@Override
	public double getCargoGrupoFamiliar(Afiliado afiliado) {
		return super.getCargoGrupoFamiliar(afiliado) + 0.01 * afiliado.getSalario();
	}
	
	@Override
	public double getDescuentoCoberturaViajera(Coseguro coseguro) {
		return this.descuentoCobertura * coseguro.getAntiguedad();
	}
}
