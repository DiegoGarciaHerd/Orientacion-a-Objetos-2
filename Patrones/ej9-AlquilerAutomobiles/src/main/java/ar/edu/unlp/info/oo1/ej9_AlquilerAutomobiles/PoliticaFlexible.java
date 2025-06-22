package ar.edu.unlp.info.oo1.ej9_AlquilerAutomobiles;

import java.time.LocalDate;


public class PoliticaFlexible extends Strategy {
	
	/* Si el automóvil tiene política de cancelación flexible, se reembolsará el monto total sin 
	 * importar la fecha de cancelación (que de todas maneras debe ser anterior a la fecha de inicio de la reserva). */
	
	@Override
	protected double montoAReembolsar(Double montoTotal, LocalDate fechaReserva, LocalDate fechaCancelacion) {
	
		return montoTotal;
		
	}

}
