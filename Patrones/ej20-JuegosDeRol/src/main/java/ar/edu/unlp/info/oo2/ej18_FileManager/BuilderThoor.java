package ar.edu.unlp.info.oo2.ej18_FileManager;

public class BuilderThoor extends BuilderPersonaje {

	@Override
	public void addArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraHierro());
		
	}

	@Override
	public void addArmas() {
		this.getPersonaje().setArmas(new Martillo());
		
	}

	@Override
	public void addHabilidades() {
		this.getPersonaje().getHabilidades().add("Lanza rayos");
		this.getPersonaje().getHabilidades().add("Combate a distancia");
		
	}
	
}
