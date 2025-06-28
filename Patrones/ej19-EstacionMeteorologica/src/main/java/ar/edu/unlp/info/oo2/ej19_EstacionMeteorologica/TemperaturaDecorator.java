package ar.edu.unlp.info.oo2.ej19_EstacionMeteorologica;

import java.util.List;
import java.util.stream.Collectors;

public class TemperaturaDecorator extends WeatherDataDecorator {

	public TemperaturaDecorator(WeatherData clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}
	
	public double getTemperatura() {
		return (this.getComponent().getTemperatura()-32) / 1.8;
	}
	
	 @Override
	    public List<Double> getTemperaturas() {
	        return this.getComponent().getTemperaturas().stream()
	                .map(temp -> (temp -32) / 1.8)
	                .collect(Collectors.toList());
	    }
	@Override
	public String displayData() {
		return "Temperatura C: " + this.getTemperatura() + "Presión atmosf: " + this.getPresion() + "Radiacion solar: " + this.getRadiacionSolar();
	}
}
