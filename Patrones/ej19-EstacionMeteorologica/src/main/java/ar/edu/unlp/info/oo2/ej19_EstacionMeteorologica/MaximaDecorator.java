package ar.edu.unlp.info.oo2.ej19_EstacionMeteorologica;

public class MaximaDecorator extends WeatherDataDecorator {

	public MaximaDecorator(WeatherData clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}
	
	public double getMaxima() {
		double max = this.getTemperaturas().stream()
                .max((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
		return max;
	}
	
	public String displayData() {
		return super.displayData() + "Maxima " + this.getMaxima();
	}

}
