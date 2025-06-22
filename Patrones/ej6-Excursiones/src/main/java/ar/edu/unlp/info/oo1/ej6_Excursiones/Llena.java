package ar.edu.unlp.info.oo1.ej6_Excursiones;

public class Llena extends State {

	@Override
	String obtenerInformacion(Excursion excursion) {
		return excursion.getNombre() + excursion.getCosto() + excursion.getFechaInicio() + excursion.getFechaFin() + excursion.getPuntoEncuentro();
	}
	
	void inscribir (Usuario unUsuario,Excursion excursion) {
		excursion.getEspera().add(unUsuario);
	}

}
