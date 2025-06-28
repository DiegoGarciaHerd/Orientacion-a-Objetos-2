package ar.edu.unlp.info.oo2.ej13_SubteWay;

public class BuilderClasico extends SandwichBuilder {
	
	@Override
	public void prepararPan() {
		this.getSandwich().setPan("Brioche");
		this.getSandwich().setPrecioPan(100);
	}

	@Override
	public void prepararAderezo() {
		this.getSandwich().setAderezo("Mayonesa");
		this.getSandwich().setPrecioAderezo(20);
		
	}

	@Override
	public void prepararPrincipal() {
		 this.getSandwich().setPrincipal("Carne de ternera");
	     this.getSandwich().setPrecioPrincipal(300);
		
	}

	@Override
	public void prepararAdicional() {
		this.getSandwich().setAdicional("Tomate");
	    this.getSandwich().setPrecioAdicional(80);
	}
	
}
