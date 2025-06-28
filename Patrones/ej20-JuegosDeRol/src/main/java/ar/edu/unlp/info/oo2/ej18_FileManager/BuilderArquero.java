package ar.edu.unlp.info.oo2.ej18_FileManager;

public class BuilderArquero extends BuilderPersonaje {

	@Override
	public void addArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraCuero());
		
	}

	@Override
	public void addArmas() {
		this.getPersonaje().setArmas(new Arco());
		
	}

	@Override
	public void addHabilidades() {
		this.getPersonaje().getHabilidades().add("Disparo de flechas");
	}
	
}
