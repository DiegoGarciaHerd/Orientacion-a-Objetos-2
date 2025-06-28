package ar.edu.unlp.info.oo2.ej19_EstacionMeteorologica;

import java.util.List;

public interface WeatherData {
	
	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperatura();

	//retorna la presión atmosférica en hPa
	public double getPresion();

	//retorna la radiación solar
	public double getRadiacionSolar();

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturas();
	
	public String displayData();

	public void addTemperatura(double d);
}
