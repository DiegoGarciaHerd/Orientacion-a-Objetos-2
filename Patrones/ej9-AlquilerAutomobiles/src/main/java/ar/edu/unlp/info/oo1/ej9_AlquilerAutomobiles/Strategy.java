package ar.edu.unlp.info.oo1.ej9_AlquilerAutomobiles;

import java.time.LocalDate;


public abstract class Strategy {

	protected abstract double montoAReembolsar(Double montoTotal,LocalDate fechaReserva,LocalDate fechaCancelacion);
	
}
