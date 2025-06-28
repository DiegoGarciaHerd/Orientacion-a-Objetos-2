package ar.edu.unlp.info.oo2.ej11_Topografias;

public interface Topografia {
	/* Un objeto Topografía representa la distribución de agua y tierra de una celda satelital */
	
	public abstract void add(Topografia componente) ;
	
	public abstract double proporcionDeAgua();
	
	public boolean isEquals(Topografia topografia);
}
