package ar.edu.unlp.info.oo2.ej15_ArmadoPCs;

import java.util.List;

public abstract class BuilderPC {
	public Presupuesto presupuesto;
	
	
	public abstract void setProcesador();
	public abstract void setMemoriaRam();
	public abstract void setTarjetaGrafica();
	public abstract void setGabinete();
	public abstract void setDisco();
	
	public Presupuesto getPresupuesto () {
		return this.presupuesto;
	}
	
}
