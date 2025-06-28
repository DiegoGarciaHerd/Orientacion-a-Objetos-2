package ar.edu.unlp.oo2.Parcial1;

public abstract class PaqueteDecorator implements IPaquete {
	protected IPaquete paquete;
	
	public PaqueteDecorator (IPaquete paquete) {
		this.paquete = paquete;
	}
	
	public  double getCostoEnvio() {
		return paquete.getCostoEnvio();
	}
	
	public String getDescripcion() {
		return paquete.getDescripcion();
	}
}
