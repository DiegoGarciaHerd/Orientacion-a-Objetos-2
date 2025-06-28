package ar.edu.unlp.info.oo2.ej19_EstacionMeteorologica;

public class MinimaDecorator extends WeatherDataDecorator{

	public MinimaDecorator(WeatherData clima) {
		super(clima);
		// TODO Auto-generated constructor stub
	}
	
	public double getMinima() {
		double min = this.getTemperaturas().stream()
                .min((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
		return min;
	}
	
	public String displayData() {
		return super.displayData() + "Minima" + this.getMinima();
	}
	
}
