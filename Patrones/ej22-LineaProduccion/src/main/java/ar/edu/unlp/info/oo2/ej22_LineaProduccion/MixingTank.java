package ar.edu.unlp.info.oo2.ej22_LineaProduccion;

public abstract class MixingTank {

	public abstract boolean heatPower(int percentage);
	public abstract boolean mixerPower(int percentage);
	public abstract boolean purge();
	public abstract double upTo();
	public abstract double temperature();
}
