package ar.edu.unlp.info.oo2.ej21_GenealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero implements IMamifero {
	private String id;
	private String especie;
	private LocalDate fechaNacimiento;
	private IMamifero padre;
	private IMamifero madre;
	
	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdentificador(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEspecie(String especie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDate getFechaNacimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMamifero getPadre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPadre(IMamifero padre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMamifero getMadre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMadre(IMamifero madre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMamifero getAbueloMaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMamifero getAbuelaMaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMamifero getAbuelaPaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean tieneComoAncestroA(IMamifero unMamifero) {
		return ((this.padre == unMamifero) || (this.madre == unMamifero)
				|| this.padre.tieneComoAncestroA(unMamifero)
				|| this.madre.tieneComoAncestroA(unMamifero));
	}

}
