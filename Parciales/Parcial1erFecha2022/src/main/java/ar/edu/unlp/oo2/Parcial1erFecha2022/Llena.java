package ar.edu.unlp.oo2.Parcial1erFecha2022;

public class Llena extends EstadoExcursion {

	@Override
	protected void inscribir(Usuario unUsuario, Excursion excursion) {
		excursion.agregarInscriptoListaDeEspera(unUsuario);
		
	}

	
}
