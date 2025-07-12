package ar.edu.unlp.oo2.Parcial1erFecha2022;

public abstract class EstadoExcursion {

	protected String getInformacion(Excursion excursion) {
		return excursion.getNombre() + excursion.getCosto() +
				excursion.getFechaInicio() + excursion.getFechaFin()
				+ excursion.getPuntoEncuentro();
	}

	protected abstract void inscribir(Usuario unUsuario, Excursion excursion);

}
