package ar.edu.unlp.oo2.Parcial1erFecha2022;

public class Provisoria extends EstadoExcursion {

	@Override
	protected String getInformacion(Excursion excursion) {
		// TODO Auto-generated method stub
		return super.getInformacion(excursion) + (excursion.getCantInscriptos() + 
				- excursion.getCupoMinimo());
	}

	@Override
	protected void inscribir(Usuario unUsuario, Excursion excursion) {
		// TODO Auto-generated method stub
		excursion.agregarInscripto(unUsuario);
		if(excursion.getCantInscriptos() == excursion.getCupoMinimo()) {
			excursion.setEstado(new Definitiva());
		}
			
	}
	
	

}
