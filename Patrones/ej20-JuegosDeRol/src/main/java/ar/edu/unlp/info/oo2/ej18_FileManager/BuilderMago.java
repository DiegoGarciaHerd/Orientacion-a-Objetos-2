package ar.edu.unlp.info.oo2.ej18_FileManager;

public class BuilderMago extends BuilderPersonaje {

	@Override
	public void addArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraCuero());
	}

	@Override
	public void addArmas() {
		this.getPersonaje().setArmas(new Baston());
		
	}

	@Override
	public void addHabilidades() {
		this.getPersonaje().getHabilidades().add("Magia");
		this.getPersonaje().getHabilidades().add("Combate a distancia");
		
	}
	
	
}
