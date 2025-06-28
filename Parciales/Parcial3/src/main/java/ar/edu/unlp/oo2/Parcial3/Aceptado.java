package ar.edu.unlp.oo2.Parcial3;

public class Aceptado extends State{

	@Override
	public void pagarCuota(Prestamo prestamo) {
		prestamo.setCantCuotas(prestamo.getCantCuotas()-1);
		
		if(prestamo.getCantCuotas() == 0) {
			prestamo.setState(new Finalizado());;
		}
	}
	
	@Override
	public double cancelarPrestamo(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return prestamo.calcularGastosCancelacion();
	}

}
