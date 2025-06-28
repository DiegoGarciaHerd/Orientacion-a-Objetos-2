package ar.edu.unlp.info.oo2.ej18_FileManager;

public class Juego {
	
	public static void main (String [] args ) {
		Director director =new Director();
		Personaje mago ;
		Personaje guerrero;
		Personaje arquero;
		
		mago = director.buildPersonaje(new BuilderMago());
		guerrero = director.buildPersonaje(new BuilderGuerrero());
		arquero = director.buildPersonaje(new BuilderArquero());
		
		mago.combatir(arquero);
		guerrero.combatir(arquero);
		arquero.combatir(mago);
		guerrero.combatir(mago);
		System.out.println(mago.getPuntosDeVida());
		System.out.println(arquero.getPuntosDeVida());
		System.out.println(guerrero.getPuntosDeVida());
	}
}
