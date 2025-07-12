package ar.edu.unlp.oo2.Parcial4;

public class PlanPremium extends PlanMedico {
	private double cargoIntegranteAdicional;
	
	public PlanPremium(double montoFijo, double cargo, double costoCobertura, double seguro,
			double descuentoCobertura) {
		super(montoFijo, cargo, costoCobertura, seguro);
		this.cargoIntegranteAdicional = 2800;
	}
	
	@Override
	public double getMontoFijo(Coseguro coseguro) {
		return super.getMontoFijo(coseguro) - (super.getMontoFijo(coseguro) * coseguro.getDescuento());
	}
	
	@Override
	public double getCargoGrupoFamiliar(Afiliado afiliado) {
		double monto= 0;
		if(afiliado.getFamiliares() > 4) {
			monto += afiliado.getFamiliares() * this.cargoIntegranteAdicional;
		}
		return monto;
	}
	
	
}
