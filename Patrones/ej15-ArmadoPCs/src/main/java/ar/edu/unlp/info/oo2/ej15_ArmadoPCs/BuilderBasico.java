package ar.edu.unlp.info.oo2.ej15_ArmadoPCs;

public class BuilderBasico extends BuilderPC {

	@Override
	public void setProcesador() {
	  this.getPresupuesto().setProcesador(Catalogo.getComponente("Procesador Basico"));
	}

	@Override
	public void setMemoriaRam() {
		this.getPresupuesto().setMemoriaRam(Catalogo.getComponente("8GB"));
	}

	@Override
	public void setTarjetaGrafica() {
		this.getPresupuesto().setMemoriaRam(Catalogo.getComponente("Integrada"));
	}

	@Override
	public void setGabinete() {
		this.getPresupuesto().setMemoriaRam(Catalogo.getComponente("Gabinete Estandar"));
	}

	@Override
	public void setDisco() {
		this.getPresupuesto().setMemoriaRam(Catalogo.getComponente("HDD 500GB"));
		
	}

}
