package ar.edu.unlp.oo2.Parcial4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanMedicoTest {
	Afiliado pedro;
	
	@BeforeEach 
	void setUp() {
		pedro = new Afiliado("Pedro",LocalDate.of(1998, 1, 1),2,100000,new CoseguroNull());
		pedro.setPlanMedico(new PlanObligatorio(15000,3500,0.01,0));
	}

	@Test
	void testExamen() {
		assertEquals(pedro.calcularMonto(),23000);
		pedro.setPlanMedico(new PlanIntegral(22000,3000,0.03,0.05));
		assertEquals(pedro.calcularMonto(), 33100);
		pedro.setCoseguro(new CoseguroReal(0.1,LocalDate.of(2024, 07, 8),1000));
		assertEquals(pedro.calcularMonto(), 23100);
	}
}
