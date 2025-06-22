package ar.edu.unlp.info.oo1.ej6_Excursiones;

public class Provisoria extends State {

	/*Si la excursión no alcanza el cupo mínimo, la información es la siguiente: 
	nombre, costo, fechas, punto de encuentro, cantidad de usuarios faltantes para alcanzar el cupo mínimo */
	@Override
	String obtenerInformacion(Excursion excursion) {
		return excursion.getNombre() + excursion.getCosto() + excursion.getPuntoEncuentro() + (excursion.getCupoMaximo() -
				excursion.getEspera().size());
	}

	@Override
	void inscribir(Usuario unUsuario, Excursion excursion) {
		excursion.getInscriptos().add(unUsuario);
		if(excursion.cumpleMinimoCuposInscriptos()) {
			excursion.changeState(new Definitiva());
		}
	}

}
