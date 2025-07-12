package ar.edu.unlp.oo2.Parcial3erFecha2023;

public class Boton extends Componente {
	private String estilo;
	private String texto;
	private String accion; 
	
	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.estilo = estilo.getEstiloBoton();
		
	}

	@Override
	public String imprimir() {
		return "<boton estilo=\"" + this.estilo + "\" texto=\"" + texto + "\" accion=\"" + this.accion + "\"/>";
	}
	


}
