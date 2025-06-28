package ar.edu.unlp.oo2.Parcial3;

public abstract class Prestamo {
	private double montoSolicitado;
	private int cantCuotas;
	private State estado;
	private Cliente cliente;
	private double montoRestante;
	
	public Prestamo(int montoSolicitado, int cantCuotas2,Cliente cliente) {
		this.montoSolicitado = montoSolicitado;
		this.montoRestante = 0;
		this.cantCuotas = cantCuotas2;
		this.cliente = cliente;
	}
	public void setState(State estado) {
		this.estado = estado;
	}
	
	public abstract double valorCuota();
	
	public void pagarCuota() {
		this.estado.pagarCuota(this);
	}
	
	public double getMontoPagado() {
		return this.getMontoSolicitado() - this.getMontoRestante();
	}
	
	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(double monto) {
		this.montoSolicitado = monto;
	}

	public double getMontoRestante() {
		return montoRestante;
	}
	public void setMontoRestante(double montoRestante) {
		this.montoRestante = montoRestante;
	}
	public int getCantCuotas() {
		return cantCuotas;
	}

	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double calcularGastosCancelacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
