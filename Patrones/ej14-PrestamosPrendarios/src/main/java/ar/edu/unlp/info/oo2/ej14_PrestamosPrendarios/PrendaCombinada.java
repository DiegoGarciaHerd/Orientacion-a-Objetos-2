package ar.edu.unlp.info.oo2.ej14_PrestamosPrendarios;

import java.util.List;

public class PrendaCombinada extends Prenda {
	private List<Prenda> prendas;
	
	public void agregarPrenda(Prenda p) {
		this.prendas.add(p);
	}

	@Override
	public double getValor() {
		return this.prendas.stream().mapToDouble(p->p.getValor()).sum();
	}

	@Override
	public double getCoeficienteLiquidez() {
		// TODO Auto-generated method stub
		return 0.5;
	}
	
	
	
}
