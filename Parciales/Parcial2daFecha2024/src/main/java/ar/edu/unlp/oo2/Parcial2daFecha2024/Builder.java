package ar.edu.unlp.oo2.Parcial2daFecha2024;

public interface Builder {
	
	void setProcesador(Catalogo catalogo);

	void setMemoriaRam(Catalogo catalogo);

	void setTarjetaGrafica(Catalogo catalogo);

	void setGabinete(Catalogo catalogo);

	Presupuesto getResult();

	void reset();

}
