package ar.edu.unlp.info.oo2.ej13_SubteWay;

public class Script {

	
	public static void main (String []args ) {
		SandwichBuilder bc = new BuilderClasico();
		SubteWay director = new SubteWay(bc);
		Sandwich clasico = director.prepararSandwich();
		System.out.println("Sandwich Clasico " + clasico.calcularPrecio());
	}
}
