package ar.edu.unlp.info.oo2.ej19_EstacionMeteorologica;

import java.util.List;

public class WeatherDataDecorator implements WeatherData {
	private WeatherData component;

	public WeatherDataDecorator (WeatherData clima) {
		this.component = clima;
	}
	
	public WeatherData getComponent() {
		return this.component;
	}
	public double getTemperatura() {
		return this.component.getTemperatura();
	}
	public double getPresion() {
		return this.component.getPresion();
	}
	public double getRadiacionSolar() {
		return this.component.getRadiacionSolar();
	}
	public List<Double> getTemperaturas() {
		return this.component.getTemperaturas();
	}
	public String displayData() {
		return this.component.displayData();
	}

	@Override
	public void addTemperatura(double d) {
		// TODO Auto-generated method stub
		
	}
}
