package ar.edu.unlp.info.oo1.ej6_Excursiones;

public abstract class State {
	
	abstract String obtenerInformacion(Excursion excursion);

	abstract void inscribir(Usuario unUsuario,Excursion excursion);
	
}
