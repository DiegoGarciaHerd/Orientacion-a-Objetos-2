package ar.edu.unlp.oo2.Parcial2daFecha2024;

public class Intermedio implements Builder {
	private Presupuesto presupuesto;
	
	public void reset() {
		this.presupuesto = new Presupuesto();
	}
	@Override
	public void setProcesador(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("Procesador Intermedio"));
	}

	@Override
	public void setMemoriaRam(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("Ram 16GB"));
	}

	@Override
	public void setTarjetaGrafica(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("GTX 1650"));
	}

	@Override
	public void setGabinete(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("Gabinete Intermedio"));
		presupuesto.agregarComponente(catalogo.getComponente("Fuente 800w"));
	}

	@Override
	public Presupuesto getResult() {
		// TODO Auto-generated method stub
		return presupuesto;
	}

}
