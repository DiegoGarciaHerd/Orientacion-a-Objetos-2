package ar.edu.unlp.oo2.Parcial3;

public class Finalizado extends State {

	@Override
	public void pagarCuota(Prestamo prestamo) {
		throw new Error ("error");
		
	}
	
	@Override
	public double cancelarPrestamo(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
