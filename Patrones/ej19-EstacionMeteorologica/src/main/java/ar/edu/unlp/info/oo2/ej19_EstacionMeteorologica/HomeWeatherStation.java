package ar.edu.unlp.info.oo2.ej19_EstacionMeteorologica;

import java.util.LinkedList;
import java.util.List;

public class HomeWeatherStation implements WeatherData {
	private double temparatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temparaturas;
	
	
	
	public HomeWeatherStation(double temparatura, double presion, double radiacionSolar) {
		super();
		this.temparatura = temparatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temparaturas = new LinkedList<Double>();
	}

	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperatura() {
		return this.temparatura;
	}
		
	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return this.presion;
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturas(){
		return this.temparaturas;
	}

	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData(){
	return "Temperatura F: " + this.getTemperatura() + "Presión atmosf: " + this.getPresion() +
		   	  "Radiación solar: " + this.getRadiacionSolar();
	}

	@Override
	public void addTemperatura(double d) {
		this.getTemperaturas().add(d);
		
	}
}
