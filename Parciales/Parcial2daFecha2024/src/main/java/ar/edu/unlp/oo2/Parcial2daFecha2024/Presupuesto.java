package ar.edu.unlp.oo2.Parcial2daFecha2024;

import java.util.List;

public class Presupuesto {
	private List<Componente> componentes;
	private static final double IVA = 0.21;
	
	public void agregarComponente(Componente componente) {
		this.componentes.add(componente);
		
	}

	public double getConsumo() {
		// TODO Auto-generated method stub
		return this.componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
	}
	public double getPrecio() {
		return this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
	}
	public double calcularPrecio() {
		return this.getPrecio() + this.getPrecio() * IVA;
	}
	
}
