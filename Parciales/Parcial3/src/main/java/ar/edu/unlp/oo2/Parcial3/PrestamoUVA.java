package ar.edu.unlp.oo2.Parcial3;

public class PrestamoUVA extends Prestamo {

	public PrestamoUVA(int montoSolicitado, int cantCuotas2, Cliente cliente) {
		super(montoSolicitado, cantCuotas2, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double valorCuota() {
		double indiceAcutal = Indec.getInidiceInflacion();
		return indiceActual *(this.getMonto() / this.getCantCuotas());
	}

	

}
