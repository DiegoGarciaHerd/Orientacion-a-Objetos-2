package ar.edu.unlp.info.oo1.ej9_AlquilerAutomobiles;

import java.time.LocalDate;


public class PoliticaModerada extends Strategy {
	
	
	
	/* Si el automóvil tiene política de cancelación moderada,
	se reembolsará el monto total si la cancelación se hace hasta una semana antes y 50% si se hace hasta 2 días antes. */ 
	 
	@Override
	protected double montoAReembolsar(Double montoTotal, LocalDate fechaReserva, LocalDate fechaCancelacion) {
		if (fechaCancelacion.isBefore(fechaReserva.minusWeeks(1)) || fechaCancelacion.isEqual(fechaReserva.minusWeeks(1))) {
			return montoTotal;
		}
		else if(fechaCancelacion.isBefore(fechaReserva.minusDays(2)) || fechaCancelacion.isEqual(fechaReserva.minusDays(2))) {
			return montoTotal * 0.50;
		}
		else {
			return 0;
		}
	}
	
}
