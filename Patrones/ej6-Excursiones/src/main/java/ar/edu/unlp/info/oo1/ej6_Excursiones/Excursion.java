package ar.edu.unlp.info.oo1.ej6_Excursiones;

import java.sql.Date;
import java.util.List;

public class Excursion {
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private String puntoEncuentro;
	private double costo; 
	private int cupoMaximo;
	private int cupoMinimo;
	private List<Usuario> inscriptos;
	private List<Usuario> espera;
	private State estado;
	
	
	public void inscribir (Usuario unUsuario) {
		
		estado.inscribir(unUsuario,this);
	}
	
	public String obtenerInformacion() {
		return estado.obtenerInformacion(this);
	}
	
	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public List<Usuario> getEspera() {
		return espera;
	}

	public void setEspera(List<Usuario> espera) {
		this.espera = espera;
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}
	
	public int getCupoMinimo() {
		return this.cupoMinimo;
	}

	public boolean cumpleMinimoCuposInscriptos() {
		if(this.getInscriptos().size() >= this.getCupoMinimo()) {
			return true;
		}
		else {
			return false;
		}
	}

	public void changeState(State state) {
		this.estado = state;
		
	}

	public boolean cumpleMaximoCuposInscriptos() {
		if(this.getCupoMaximo() == this.getInscriptos().size()) {
			return true;
		} 
		else {
			return false;
		}
	}
	
}
