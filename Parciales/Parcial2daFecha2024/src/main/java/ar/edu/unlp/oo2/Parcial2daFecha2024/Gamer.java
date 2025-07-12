package ar.edu.unlp.oo2.Parcial2daFecha2024;

public class Gamer implements Builder {
	private Presupuesto presupuesto;
	@Override
	public void setProcesador(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("Procesador Gamer"));
		presupuesto.agregarComponente(catalogo.getComponente("Pad termico"));
		presupuesto.agregarComponente(catalogo.getComponente("Cooler"));
	}

	@Override
	public void setMemoriaRam(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("Ram 32GB"));
		presupuesto.agregarComponente(catalogo.getComponente("Ram 32GB"));
	}

	@Override
	public void setTarjetaGrafica(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("RTX 4090"));
	}

	@Override
	public void setGabinete(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("Gabinete Gamer"));
		double consumo = presupuesto.getConsumo() + 0.50 * presupuesto.getConsumo();
		String str = "fuente " + consumo + " w";
		presupuesto.agregarComponente(catalogo.getComponente(str));
	}

	@Override
	public Presupuesto getResult() {
		// TODO Auto-generated method stub
		return presupuesto;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.presupuesto = new Presupuesto();
	}
	
	
}
