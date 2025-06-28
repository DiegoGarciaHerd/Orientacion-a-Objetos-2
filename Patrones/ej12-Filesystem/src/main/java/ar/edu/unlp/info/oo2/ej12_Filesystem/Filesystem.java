package ar.edu.unlp.info.oo2.ej12_Filesystem;

import java.util.LinkedList;
import java.util.List;

public class Filesystem {
	private Componente raiz;
	
	/**
	   * Retorna el espacio total ocupado, incluyendo todo su contenido.
	   */
	  public int tamanoTotalOcupado() {
		  return raiz.getCantBytes();
	  }

	  /**
	   * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	   * filesystem 
	   */
	  public Archivo archivoMasGrande() {
		  return raiz.archivoMasGrande();
	  }

	  /**
	   * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	   * del filesystem
	   */
	  public Archivo archivoMasNuevo() {
		  return raiz.archivoMasNuevo();  
	  }

	  /**
	   * Retorna el primer elemento con el nombre solicitado contenido en cualquier
	   * nivel del filesystem
	   */
	  public Componente buscar(String nombre) {
		  return raiz.buscar(nombre); 
	  }
	  /**
	   * Retorna la lista con los elementos que coinciden con el nombre solicitado 
	   * contenido en cualquier nivel del filesystem
	   */
	  public List<Componente> buscarTodos(String nombre) {
		  List<Componente> elementos = new LinkedList<Componente>();
		  raiz.buscarTodos(nombre,elementos);
		  return elementos;
	  }

	  /**
	   * Retorna un String con los nombres de los elementos contenidos en todos los 
	   * niveles del filesystem. De cada elemento debe retornar el path completo
	   * (similar al comando pwd de linux) siguiendo el modelo presentado a
	   * continuación
	/Directorio A
	/Directorio A/Directorio A.1
	/Directorio A/Directorio A.1/Directorio A.1.1
	/Directorio A/Directorio A.1/Directorio A.1.2 	
	/Directorio A/Directorio A.2
	/Directorio B
	   */
	  public String listadoDeContenido() {
		  return this.raiz.listadoDeContenido("/");
		  
	  }

}
