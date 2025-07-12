package ar.edu.unlp.oo2.Parcial4;

public abstract class PlanMedico {
	private double montoFijo;
	private double cargoPorGrupoFamiliar;
	private double costoCoberturaViajera;
	private double seguroInternacion;
	
	public PlanMedico (double montoFijo, double cargo , double costoCobertura,double seguro) {
		this.montoFijo = montoFijo;
		this.cargoPorGrupoFamiliar = cargo;
		this.costoCoberturaViajera = costoCobertura;
		this.seguroInternacion = seguro;
		
	}
	public double calcularMonto(Afiliado afiliado) {
		return this.getMontoFijo(afiliado.getCoseguro()) 
				+ this.getCargoGrupoFamiliar(afiliado) 
				+ this.getCostoCoberturaViajera(afiliado)
				+ this.getSeguroInternacion(afiliado.getCoseguro());
	}
	
	public double getMontoFijo(Coseguro coseguro) {
		return this.montoFijo;
	}

	public double getCargoGrupoFamiliar(Afiliado afiliado) {
		return this.cargoPorGrupoFamiliar * afiliado.getFamiliares();
	}
	
	public double getCostoCoberturaViajera(Afiliado afiliado) {
		return costoCoberturaViajera * afiliado.getSalario() - this.getDescuentoCoberturaViajera(afiliado.getCoseguro());
				
	}
	
	public double getSeguroInternacion(Coseguro coseguro) {
		return this.seguroInternacion * this.getMontoFijo(coseguro);
	}
	
	public double getDescuentoCoberturaViajera(Coseguro coseguro) {
		return coseguro.getMontoCoberturaViajes();
	}
}
