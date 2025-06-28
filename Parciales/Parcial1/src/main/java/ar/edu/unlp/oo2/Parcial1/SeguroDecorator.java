package ar.edu.unlp.oo2.Parcial1;

public class SeguroDecorator extends PaqueteDecorator {

	public SeguroDecorator(IPaquete paquete) {
		super(paquete);
		// TODO Auto-generated constructor stub
	}
	
	public double getCostoEnvio () {
		return paquete.getValorDeclarado() * 0.20 + this.paquete.getCostoEnvio();
	}
	
	public String getDescripcion () {
		return super.getDescripcion() + " con seguro";
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
}
