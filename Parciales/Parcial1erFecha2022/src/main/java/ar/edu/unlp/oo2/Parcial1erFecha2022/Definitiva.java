package ar.edu.unlp.oo2.Parcial1erFecha2022;

import java.util.stream.Collectors;

public class Definitiva extends EstadoExcursion {

	@Override
	protected String getInformacion(Excursion excursion) {
		// TODO Auto-generated method stub
		String info = super.getInformacion(excursion);
		String emails =excursion.getInscriptos().stream().map(i -> i.getEmail())
			.collect(Collectors.joining(", "));
		
		info += "\nInscriptos: " + emails;
		info += "\nCant faltante para cupo maximo: " +(excursion.getCupoMaximo() - excursion.getCantInscriptos());
		return info;
	}

	@Override
	protected void inscribir(Usuario unUsuario, Excursion excursion) {
		// TODO Auto-generated method stub
		excursion.agregarInscripto(unUsuario);
		if(excursion.getCantInscriptos() == excursion.getCupoMaximo()) {
			excursion.setEstado(new Llena());
		}
			
	}
	
	
}
