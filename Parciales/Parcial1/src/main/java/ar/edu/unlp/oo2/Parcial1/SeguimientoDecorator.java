package ar.edu.unlp.oo2.Parcial1;

public class SeguimientoDecorator extends PaqueteDecorator {

	public SeguimientoDecorator(IPaquete paquete) {
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
		// TODO Auto-generated method stub
		return paquete.getCostoEnvio() + 2000;
	}

}
