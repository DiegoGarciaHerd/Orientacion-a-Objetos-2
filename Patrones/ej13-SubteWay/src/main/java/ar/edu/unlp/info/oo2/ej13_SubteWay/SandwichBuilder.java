package ar.edu.unlp.info.oo2.ej13_SubteWay;

public abstract class SandwichBuilder {
	private Sandwich sandwich;
	
	public Sandwich getSandwich() {
		return sandwich;
	}

	public void setSandwich(Sandwich sandwich) {
		this.sandwich = sandwich;
	}

	public Sandwich empaquetar() {
		return this.sandwich;
	}
	
	public void empezar() {
		this.sandwich = new Sandwich();
	}
	public abstract void prepararPan();
	
	public abstract void prepararAderezo();
	
	public abstract void prepararPrincipal();
	
	public abstract void prepararAdicional();
}
