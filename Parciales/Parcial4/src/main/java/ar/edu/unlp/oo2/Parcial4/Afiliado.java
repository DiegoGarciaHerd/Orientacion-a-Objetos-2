package ar.edu.unlp.oo2.Parcial4;

import java.time.LocalDate;
import java.util.List;

public class Afiliado {
	private String nombre;
	private int familiaresACargo;
	private double salario;
	private LocalDate fechaNacimiento;
	
	private List<PlanMedico> previos;
	private PlanMedico plan;
	private Coseguro coseguro;
	
	public Afiliado(String nombre,LocalDate fechaNacimiento, int familiaresACargo, int salario, Coseguro coseguro) {
		this.nombre = nombre;
		this.familiaresACargo = familiaresACargo;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.coseguro = coseguro;
	}

	public double calcularMonto() {
		return plan.calcularMonto(this);
	}

	public Coseguro getCoseguro() {
		// TODO Auto-generated method stub
		return coseguro;
	}

	public double getFamiliares() {
		return this.familiaresACargo;
	}

	public double getSalario() {
		// TODO Auto-generated method stub
		return this.salario;
	}

	public void setPlanMedico(PlanMedico plan) {
		this.plan = plan;
		
	}

	public void setCoseguro(CoseguroReal coseguroReal) {
		this.coseguro = coseguroReal;
		
	}
	
}
