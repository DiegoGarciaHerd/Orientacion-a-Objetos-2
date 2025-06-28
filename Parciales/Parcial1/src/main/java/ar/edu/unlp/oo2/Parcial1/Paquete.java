package ar.edu.unlp.oo2.Parcial1;

public class Paquete implements IPaquete {
	private String descripcion;
	private String destinatario;
	private String direccionDestino;
	private double valorDeclarado;
	
	public Paquete (String desc, double valor) {
		this.descripcion = desc;
		this.valorDeclarado = valor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getDestinatario () {
		return this.destinatario;
	}
	
	public String getDireccionDestino () {
		return this.direccionDestino;
	}
	
	public double getValorDeclarado() {
		return this.valorDeclarado;
	}
	
	public double getCostoEnvio() {
		return this.getValorDeclarado() * 0.05;
	}
}
