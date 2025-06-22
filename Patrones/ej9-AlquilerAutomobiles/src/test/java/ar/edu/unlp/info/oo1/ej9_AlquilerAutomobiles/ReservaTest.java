package ar.edu.unlp.info.oo1.ej9_AlquilerAutomobiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class ReservaTest {
	
	AutoEnAlquiler auto;
	Reserva reserva;
	
	@BeforeEach
	void setUp() throws Exception {
		auto = new AutoEnAlquiler();
		reserva = new Reserva();
		auto.setPreciPorDia(1000);
		reserva.setAuto(auto);
		reserva.setCantidadDias(2);
		reserva.setStrategy(new PoliticaFlexible());
		reserva.setFecha(LocalDate.of(2025, 06, 19));
	}
	
    @Test
    public void testReembolso() {
    	System.out.println(reserva.montoAReembolsar(LocalDate.of(2025, 06, 16)));
    	reserva.setStrategy(new PoliticaModerada());
    	System.out.println(reserva.montoAReembolsar(LocalDate.of(2025, 06, 16)));
    }
}
