package ar.edu.unlp.oo2.Parcial3;

public class PrestamoSimple extends Prestamo {
	private double tasaInteres;
	
	public PrestamoSimple(int montoSolicitado, int cantCuotas, Cliente cliente, double tasaInteres) {
		super(montoSolicitado,cantCuotas,cliente);
		this.tasaInteres = tasaInteres;
	}

	@Override
	public double valorCuota() {
		return this.tasaInteres * (this.getMonto() / this.getCantCuotas());
	}

	
	
	
	
}
