package ar.edu.unlp.oo2.Parcial3erFecha2023;

public class ListaDesplegableAdapter extends Componente {
	private ListaDesplegable lista;
	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.lista.setStyle(estilo.getEstiloEtiqueta());
		
	}
	@Override
	public String imprimir() {
		return this.lista.print();
	}
	
}
