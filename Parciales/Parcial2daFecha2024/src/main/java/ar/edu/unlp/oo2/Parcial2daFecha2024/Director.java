package ar.edu.unlp.oo2.Parcial2daFecha2024;

public class Director {
	private Catalogo catalogo;
	
	public void armarPresupuesto(Builder builder) {
		builder.reset();
		builder.setProcesador(catalogo);
		builder.setMemoriaRam(catalogo);
		builder.setTarjetaGrafica(catalogo);
		builder.setGabinete(catalogo);
	}
	
}
