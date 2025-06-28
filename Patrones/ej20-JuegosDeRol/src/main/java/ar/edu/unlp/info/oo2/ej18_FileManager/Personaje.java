package ar.edu.unlp.info.oo2.ej18_FileManager;

import java.util.LinkedList;
import java.util.List;

public class Personaje {
	private String nombre;
	private Armadura armadura;
	private Arma armas;
	private List<String> habilidades = new LinkedList<String>();
	private int puntosDeVida;
	
	public Personaje() {
		this.puntosDeVida = 100;
	}
	public void setArmadura (Armadura armadura) {
		this.armadura = armadura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArmas() {
		return armas;
	}

	public void setArmas(Arma armas) {
		this.armas = armas;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	public Armadura getArmadura() {
		return armadura;
	}
	
	public boolean isAlive() {
		return this.puntosDeVida > 0;
	}
	public void combatir(Personaje oponente) {
		if(this.isAlive() && oponente.isAlive()) {
			oponente.recibirDaño(this.armas);
			if(oponente.isAlive()) {
				this.recibirDaño(oponente.getArmas());
			}
		}
		else {
			throw new RuntimeException("Personaje con vida insuficiente para el combate");
		}
	}
	
	public void recibirDaño(Arma arma ) {
		this.puntosDeVida -= this.armadura.combatirArma(arma);
	}
	
	public int getPuntosDeVida() {
		return this.puntosDeVida;
	}
}
