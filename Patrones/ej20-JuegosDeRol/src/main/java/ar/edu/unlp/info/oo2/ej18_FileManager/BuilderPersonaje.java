package ar.edu.unlp.info.oo2.ej18_FileManager;

public abstract class BuilderPersonaje {
	private Personaje personaje;
	
	public abstract void addArmadura();
	public abstract void addArmas();
	public abstract void addHabilidades();
	
	public Personaje getPersonaje() {
		return this.personaje;
	}
	
	public void reset() {
		personaje = new Personaje();
	}
}
