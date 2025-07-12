package ar.edu.unlp.oo2.Parcial1erFecha2022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private EstadoExcursion estado;
	private List<Usuario> inscriptos;
	private List<Usuario> listaEspera;
	
	
	public Excursion(String nombre, int cupoMin, int cupoMax) {
		this.nombre = nombre;
		this.cupoMinimo = cupoMin;
		this.cupoMaximo = cupoMax;
		this.estado = new Provisoria();
		this.inscriptos = new ArrayList<Usuario>();
		this.listaEspera = new ArrayList<Usuario>();
		
	}

	public String getInformacion() {
		return this.estado.getInformacion(this);
	}

	public void inscribir(Usuario unUsuario) {
		this.estado.inscribir(unUsuario,this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
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

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public EstadoExcursion getEstado() {
		return estado;
	}

	public void setEstado(EstadoExcursion estado) {
		this.estado = estado;
	}


	public int getCantInscriptos() {
		// TODO Auto-generated method stub
		return this.inscriptos.size();
	}

	public List<Usuario> getInscriptos() {
		// TODO Auto-generated method stub
		return this.inscriptos;
	}
	
	public void agregarInscripto(Usuario usuario) {
		this.inscriptos.add(usuario);
	}

	public void agregarInscriptoListaDeEspera(Usuario unUsuario) {
		this.listaEspera.add(unUsuario);
		
	}
	
	
	
	
}
