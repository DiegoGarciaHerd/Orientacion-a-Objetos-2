package ar.edu.unlp.info.oo2.ej13_SubteWay;

public class BuilderVegano extends SandwichBuilder {

	 @Override
	 public void prepararPan() {
	      this.getSandwich().setPan("Pan integral");
	      this.getSandwich().setPrecioPan(100);
	  }

	    @Override
	    public void prepararAderezo() {
	        this.getSandwich().setAderezo("Salsa criolla");
	        this.getSandwich().setPrecioAderezo(20);
	    }

	    @Override
	    public void prepararPrincipal() {
	        this.getSandwich().setPrincipal("Milanesa de girgolas");
	        this.getSandwich().setPrecioPrincipal(500);
	    }

	    @Override
	    public void prepararAdicional() {
	        this.getSandwich().setAdicional("Sin adicional");
	        this.getSandwich().setPrecioAdicional(0);
	    }
}
