package ar.edu.unlp.info.oo2.ej11_Topografias;

public abstract class Topografia {
	/* Un objeto Topografía representa la distribución de agua y tierra de una celda satelital */
	
	public abstract double proporcionDeAgua();
	
	public Object getTopografia() { // RETORNO OBJETO PARA PODER COMPARAR UNA TOPOGRAFIA ATOMICA CON UNA COMPUESTA
		return this;
	}
	
	public boolean isEquals(Topografia topografia) {
		return (this.proporcionDeAgua() == topografia.proporcionDeAgua());
	}
	
	
	public boolean equals(Object objeto) {
		return this.isEquals((Topografia)objeto); 
	}
}
