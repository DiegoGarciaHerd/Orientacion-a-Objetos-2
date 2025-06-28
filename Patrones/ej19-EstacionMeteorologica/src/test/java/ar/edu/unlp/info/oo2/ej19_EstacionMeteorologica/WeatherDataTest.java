package ar.edu.unlp.info.oo2.ej19_EstacionMeteorologica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherDataTest {
	WeatherData weather;
	
	@BeforeEach
	void setUp () {
		weather = new HomeWeatherStation(86,1008,200);
		weather.addTemperatura(82.4);
        weather.addTemperatura(86.0);
        weather.addTemperatura(89.6);
	}

	@Test
	void testDisplayData() {
		weather = new TemperaturaDecorator(weather);
		weather = new PromedioDecorator(weather);
		weather = new MinimaDecorator(weather);
		weather = new MaximaDecorator(weather);
		assertEquals("Temperatura C: 30; Presión atmosf: 1008; Radiación solar: 200; Promedio: 30; Mínimo: 27; Máximo: 32;",weather.displayData());
	}
	
}
