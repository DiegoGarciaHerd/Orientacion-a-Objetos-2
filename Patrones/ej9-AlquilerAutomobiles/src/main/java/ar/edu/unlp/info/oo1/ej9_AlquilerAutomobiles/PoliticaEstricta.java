package ar.edu.unlp.info.oo1.ej9_AlquilerAutomobiles;

import java.time.LocalDate;

public class PoliticaEstricta extends Strategy {
	
	/* Si el automóvil tiene política de cancelación estricta, no se reembolsará nada (0, cero) 
	 * sin importar la fecha tentativa de cancelación.  
	 */
	@Override
	protected double montoAReembolsar(Double montoTotal,LocalDate fecha,LocalDate fechaCancelacion) {
		
		return 0;
	}

}
