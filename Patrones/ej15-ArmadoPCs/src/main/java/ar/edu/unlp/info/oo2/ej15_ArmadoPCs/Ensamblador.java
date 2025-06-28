package ar.edu.unlp.info.oo2.ej15_ArmadoPCs;

public class Ensamblador {
	private BuilderPC builder;
	
	public Presupuesto crearPresupuesto() {
		builder.setProcesador();
		builder.setMemoriaRam();
		builder.setTarjetaGrafica();
		builder.setGabinete();
		builder.setDisco();
		return builder.getPresupuesto();
	}
}
