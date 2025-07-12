package ar.edu.unlp.oo2.Parcial3erFecha2023;

public class Etiqueta extends Componente {
	private String texto;
	private String estilo;
	
	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.estilo = estilo.getEstiloEtiqueta();
	}

	@Override
	public String imprimir() {
		return "<etiqueta estilo=\"" + this.estilo + "\"> " + texto + " </etiqueta>";
	}

	


	
	
}
