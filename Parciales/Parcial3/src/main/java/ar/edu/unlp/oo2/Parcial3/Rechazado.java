package ar.edu.unlp.oo2.Parcial3;

public class Rechazado extends State{

	@Override
	public void pagarCuota(Prestamo prestamo) {
		throw new Error ("error");
		
	}

}
