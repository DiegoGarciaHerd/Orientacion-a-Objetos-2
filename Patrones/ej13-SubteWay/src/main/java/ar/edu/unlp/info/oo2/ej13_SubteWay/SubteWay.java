package ar.edu.unlp.info.oo2.ej13_SubteWay;

public class SubteWay {
	private SandwichBuilder builder;
	
	public SubteWay(SandwichBuilder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(SandwichBuilder builder) {
		this.builder = builder;
	}
	
	public SandwichBuilder getBuilder() {
		return this.builder;
	}
	
	public Sandwich prepararSandwich() {
		builder.empezar();
		builder.prepararPan();
		builder.prepararAderezo();
		builder.prepararPrincipal();
		builder.prepararAdicional();
		return builder.empaquetar();
	}
}
