package ar.edu.unlp.oo2.Parcial3;

import java.util.List;

public class Banco {
	private double tasaInteres;
	private List<Prestamo> prestamos;
	
	public Cliente registrarCliente(String nombre,double salario) {
		
		return new Cliente(nombre,salario);
	}
	
	public Prestamo solicitarPrestamoSimple(int montoSolicitado,int cantCuotas,Cliente cliente) {
		
		Prestamo prestamo = new PrestamoSimple(montoSolicitado,cantCuotas,cliente,tasaInteres);
		if(prestamo.valorCuota() > cliente.getSalarioMensual() * 0.30) {
			prestamo.setEstado(new Rechazado());
		}
		else {
			prestamo.setEstado(new Aceptado());
		}
		return prestamo;
		
	}
	
	public Prestamo solicitarPrestamoUVA(int montoSolicitado,int cantCuotas,Cliente cliente) {
		Prestamo prestamo = new PrestamoUVA(montoSolicitado,cantCuotas,cliente);
		return prestamo;
	}
}
