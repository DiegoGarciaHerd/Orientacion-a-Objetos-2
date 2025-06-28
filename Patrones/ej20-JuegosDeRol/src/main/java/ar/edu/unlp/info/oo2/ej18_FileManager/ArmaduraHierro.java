package ar.edu.unlp.info.oo2.ej18_FileManager;

public class ArmaduraHierro implements Armadura {

	@Override
	public int combatirArma(Arma arma) {
		return arma.atacarHierro();
	}
	

}
