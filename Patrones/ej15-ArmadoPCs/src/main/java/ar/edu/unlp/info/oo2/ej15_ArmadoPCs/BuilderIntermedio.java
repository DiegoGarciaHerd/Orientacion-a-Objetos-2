package ar.edu.unlp.info.oo2.ej15_ArmadoPCs;

public class BuilderIntermedio extends BuilderPC {
	@Override
	public void setProcesador() {
	  this.getPresupuesto().setProcesador(Catalogo.getComponente("Procesador Intermedio"));
	}

	@Override
	public void setMemoriaRam() {
		this.getPresupuesto().setMemoriaRam(Catalogo.getComponente("16GB"));
	}

	@Override
	public void setTarjetaGrafica() {
		this.getPresupuesto().setTarjetaGrafica(Catalogo.getComponente("GTX 1650"));
	}

	@Override
	public void setGabinete() {
		this.getPresupuesto().setGabinete(Catalogo.getComponente("Gabinete Intermedio"));
		this.getPresupuesto().setGabinete(Catalogo.getComponente("Fuente 800w"));
	}

	@Override
	public void setDisco() {
		this.getPresupuesto().setDisco(Catalogo.getComponente("SSD 500GB"));
	}
}
