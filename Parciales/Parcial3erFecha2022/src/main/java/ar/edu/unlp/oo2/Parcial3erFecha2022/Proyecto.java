package ar.edu.unlp.oo2.Parcial3erFecha2022;

import java.time.LocalDate;
import java.util.List;

public class Proyecto {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private List<Integrante> integrantes;
	private double margenGanancia;
	private int nroIntegrantes;
	private double montoIntegrante;
	private Etapa etapa;
	
	public Proyecto() {
		
	}
	
	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, double margenGanancia,
			int nroIntegrantes, double montoIntegrante) {
		this.nombre= nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.margenGanancia = margenGanancia;
		this.nroIntegrantes = nroIntegrantes;
		this.montoIntegrante = montoIntegrante;
		etapa = new enConstruccion();
	}

	public Proyecto crearProyecto(LocalDate fechaInicio,LocalDate fechaFin,String nombre,String objetivo,double margenGanancia,int nroIntegrantes,double montoIntegrante) {
		Proyecto proyecto = new Proyecto(nombre,fechaInicio,fechaFin,objetivo,margenGanancia,nroIntegrantes,montoIntegrante);
		return proyecto;
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa(this);
	}

	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.getCosto() * this.margenGanancia;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
		
	}
	
	public double getCosto() {
		return this.nroIntegrantes * montoIntegrante;
	}
	
	public void modificarMargenGanancia() {
		this.etapa.modificarMargenGanancia(this);
	}

	public double getMargenGanancia() {
		// TODO Auto-generated method stub
		return this.margenGanancia;
	}
	public void cancelar() {
		this.etapa.cancelar(this);
	}
	
	public void setMargenGanancia(double margen) { this.margenGanancia = margen; }
	public void agregarTextoObjetivo(String texto) { this.objetivo += texto; }
}
