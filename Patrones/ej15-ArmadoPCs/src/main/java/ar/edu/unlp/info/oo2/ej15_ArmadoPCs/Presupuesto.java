package ar.edu.unlp.info.oo2.ej15_ArmadoPCs;

import java.time.LocalDate;
import java.util.List;

public class Presupuesto {
	private String cliente;
	private LocalDate fecha;
	private List<Componente> componentes;
	
	public void setProcesador(Componente c) {
		componentes.add(c);
	}
	
	public void setMemoriaRam(Componente c) {
		componentes.add(c);
	}
	
	public void setTarjetaGrafica(Componente c) {
		componentes.add(c);
	}
	
	public void setGabinete(Componente c) {
		componentes.add(c);
	}

	public void setDisco(Componente c) {
		componentes.add(c);
		
	}
	
	
}
