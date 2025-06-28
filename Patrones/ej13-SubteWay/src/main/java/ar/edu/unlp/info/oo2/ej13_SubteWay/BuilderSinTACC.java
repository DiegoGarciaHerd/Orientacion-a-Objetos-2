package ar.edu.unlp.info.oo2.ej13_SubteWay;

public class BuilderSinTACC extends SandwichBuilder {

	 @Override
	    public void prepararPan() {
	        this.getSandwich().setPan("Pan de chipá");
	        this.getSandwich().setPrecioPan(150);
	    }

	    @Override
	    public void prepararAderezo() {
	        this.getSandwich().setAderezo("Salsa tártara");
	        this.getSandwich().setPrecioAderezo(18);
	    }

	    @Override
	    public void prepararPrincipal() {
	        this.getSandwich().setPrincipal("Carne de pollo");
	        this.getSandwich().setPrecioPrincipal(250);
	    }

	    @Override
	    public void prepararAdicional() {
	        this.getSandwich().setAdicional("Verduras grilladas");
	        this.getSandwich().setPrecioAdicional(200);
	    }

}
