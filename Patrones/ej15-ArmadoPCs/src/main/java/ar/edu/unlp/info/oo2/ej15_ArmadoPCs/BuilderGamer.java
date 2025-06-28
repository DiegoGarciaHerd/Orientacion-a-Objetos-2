package ar.edu.unlp.info.oo2.ej15_ArmadoPCs;

public class BuilderGamer extends BuilderPC {
	
	@Override
	public void setProcesador() {
	  this.getPresupuesto().setProcesador(Catalogo.getComponente("Procesador Gamer"));
	}

	@Override
	public void setMemoriaRam() {
		this.getPresupuesto().setMemoriaRam(Catalogo.getComponente("64GB"));
	}

	@Override
	public void setTarjetaGrafica() {
		this.getPresupuesto().setTarjetaGrafica(Catalogo.getComponente("RTX 4090"));
	}

	@Override
	public void setGabinete() {
		this.getPresupuesto().setGabinete(Catalogo.getComponente("Gabinete Gamer"));
	}

	@Override
	public void setDisco() {
		this.getPresupuesto().setDisco(Catalogo.getComponente("SSD 500GB"));
		this.getPresupuesto().setDisco(Catalogo.getComponente("SSD 1TB"));
	}
}
