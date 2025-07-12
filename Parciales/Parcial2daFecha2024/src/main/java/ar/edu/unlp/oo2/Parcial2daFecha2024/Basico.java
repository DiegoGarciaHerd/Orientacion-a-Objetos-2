package ar.edu.unlp.oo2.Parcial2daFecha2024;

public class Basico implements Builder{
	private Presupuesto presupuesto ;
	
	@Override
	public void setProcesador(Catalogo catalogo) {
		presupuesto.agregarComponente(catalogo.getComponente("Procesador Basico"));
		
	}

	@Override
	public void setMemoriaRam(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("Ram 8GB"));
	}

	@Override
	public void setTarjetaGrafica(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(null);
	}

	@Override
	public void setGabinete(Catalogo catalogo) {
		// TODO Auto-generated method stub
		presupuesto.agregarComponente(catalogo.getComponente("Gabinete Estandar"));
	}

	@Override
	public Presupuesto getResult() {
		// TODO Auto-generated method stub
		return this.presupuesto;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		this.presupuesto = new Presupuesto();
	}
	
}
