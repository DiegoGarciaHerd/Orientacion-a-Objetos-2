package ar.edu.unlp.info.oo2.ej18_FileManager;

public class Director {
	
	public Personaje buildPersonaje (BuilderPersonaje builder) {
		builder.reset();
		builder.addArmadura();
		builder.addArmas();
		builder.addHabilidades();
		return builder.getPersonaje();
	}
	
}
