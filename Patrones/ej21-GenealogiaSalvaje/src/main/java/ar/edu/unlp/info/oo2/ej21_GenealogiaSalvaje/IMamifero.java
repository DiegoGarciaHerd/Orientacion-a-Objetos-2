package ar.edu.unlp.info.oo2.ej21_GenealogiaSalvaje;

import java.time.LocalDate;

public interface IMamifero {
	
	String getIdentificador();
	void setIdentificador(String id);
	String getEspecie();
	void setEspecie(String especie);
	LocalDate getFechaNacimiento();
	void setFechaNacimiento(LocalDate fecha);
	IMamifero getPadre();
	void setPadre(IMamifero padre);
	IMamifero getMadre();
	void setMadre(IMamifero madre);
	IMamifero getAbueloMaterno();
	IMamifero getAbuelaMaterna();
	IMamifero getAbueloPaterno();
	IMamifero getAbuelaPaterna();
	boolean tieneComoAncestroA(IMamifero unMamifero);
}
