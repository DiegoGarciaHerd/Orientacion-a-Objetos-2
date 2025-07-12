package ar.edu.unlp.info.oo2.ej21_GenealogiaSalvaje;

import java.time.LocalDate;

public class MamiferoNull implements IMamifero {

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return "Desconocido";
	}

	@Override
	public void setIdentificador(String id) {
		
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return "Desconocido";
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
		return this;
	}

	@Override
	public void setPadre(IMamifero padre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMamifero getMadre() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void setMadre(IMamifero madre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMamifero getAbueloMaterno() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IMamifero getAbuelaMaterna() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IMamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IMamifero getAbuelaPaterna() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public boolean tieneComoAncestroA(IMamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

}
