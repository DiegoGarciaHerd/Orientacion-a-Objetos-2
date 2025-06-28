package ar.edu.unlp.oo2.Parcial1;

public class FragilDecorator extends PaqueteDecorator {

	public FragilDecorator(IPaquete paquete) {
		super(paquete);
		// TODO Auto-generated constructor stub
	}

	public String getDescripcion() {
		return this.paquete.getDescripcion() + " fragil";
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
		return 0;
	}
}
