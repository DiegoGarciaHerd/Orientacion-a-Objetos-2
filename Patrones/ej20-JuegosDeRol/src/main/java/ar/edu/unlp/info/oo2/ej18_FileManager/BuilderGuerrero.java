package ar.edu.unlp.info.oo2.ej18_FileManager;

public class BuilderGuerrero extends BuilderPersonaje{

	@Override
	public void addArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraAcero());
		
	}

	@Override
	public void addArmas() {
		this.getPersonaje().setArmas(new Espada());
		
	}

	@Override
	public void addHabilidades() {
		this.getPersonaje().getHabilidades().add("Combate Cuerpo a Cuerpo");
		
	}
	
	
}
