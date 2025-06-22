package ar.edu.unlp.info.oo1.ej6_Excursiones;

public class Definitiva extends State  {

	/* Si la excursión alcanzó el cupo mínimo pero aún no el máximo, la información es la siguiente: 
	 * nombre, costo, fechas, punto de encuentro, los mails de los usuarios inscriptos y cantidad de usuarios 
	 * faltantes para alcanzar el cupo máximo
	 */
	@Override
	String obtenerInformacion(Excursion excursion) {
		String str = excursion.getNombre() + excursion.getCosto() + excursion.getFechaInicio() + excursion.getFechaFin() + excursion.getPuntoEncuentro()
		+ (excursion.getCupoMaximo() - excursion.getInscriptos().size());
		
		excursion.getInscriptos().forEach(User-> str+= User.getEmail());
		
		return str;
	}

	@Override
	void inscribir(Usuario unUsuario, Excursion excursion) {
		excursion.getInscriptos().add(unUsuario);
		if(excursion.cumpleMaximoCuposInscriptos()) {
			excursion.changeState(new Llena());
		}
	}

}
