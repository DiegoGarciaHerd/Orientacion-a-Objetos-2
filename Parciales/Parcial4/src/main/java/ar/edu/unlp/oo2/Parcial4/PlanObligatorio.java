package ar.edu.unlp.oo2.Parcial4;

public class PlanObligatorio extends PlanMedico {
	

	public PlanObligatorio(double montoFijo, double cargo, double costoCobertura, double seguro) {
		super(montoFijo, cargo, costoCobertura, seguro);
		// TODO Auto-generated constructor stub
	}

	public double getCargoGrupoFamiliar(Afiliado afiliado) {
		return super.getCargoGrupoFamiliar(afiliado) - afiliado.getCoseguro().getDescuento() * afiliado.getFamiliares(); 
	}
	

	
	
}
