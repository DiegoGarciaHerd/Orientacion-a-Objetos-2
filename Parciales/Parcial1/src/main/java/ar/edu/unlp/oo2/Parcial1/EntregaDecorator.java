package ar.edu.unlp.oo2.Parcial1;

public class EntregaDecorator extends PaqueteDecorator {

	public EntregaDecorator(IPaquete paquete) {
		super(paquete);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDestinatario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDireccionDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getValorDeclarado() {
		// TODO Auto-generated method stub
		return paquete.getValorDeclarado();
	}

	@Override
	public double getCostoEnvio() {
		return super.paquete.getCostoEnvio() + (super.paquete.getValorDeclarado()* 0.5);
	}
	
	public String getDescripcion () {
		return paquete.getDescripcion() + " entrega express";
	}

}
