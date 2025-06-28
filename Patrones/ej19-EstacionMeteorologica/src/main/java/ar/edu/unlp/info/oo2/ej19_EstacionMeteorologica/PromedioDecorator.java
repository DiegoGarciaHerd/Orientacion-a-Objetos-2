package ar.edu.unlp.info.oo2.ej19_EstacionMeteorologica;

public class PromedioDecorator extends WeatherDataDecorator {

	public PromedioDecorator(WeatherData clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}
	
	public double getPromedio() {
		return 
				this.getComponent().getTemperaturas().stream()
				.mapToDouble(Double::doubleValue)
				.average()
				.orElse(0.0);
				
				
	}
	
	public String displayData() {
		return this.getComponent().displayData() + "Promedio" + this.getPromedio();
	}
}
