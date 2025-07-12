package ar.edu.unlp.info.oo2.ej11_Topografias;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {
	
	private List<Topografia> topografias;
	
	public Mixta() {
		topografias = new ArrayList<Topografia>();
	}
	public Mixta(Topografia topografia1,Topografia topografia2, Topografia topografia3,Topografia topografia4) {
		topografias = new ArrayList<Topografia>();
		topografias.add(topografia1);
		topografias.add(topografia2);
		topografias.add(topografia3);
		topografias.add(topografia4);
	}
	public void add(Topografia componente) {
		if(this.topografias.size() < 4) {
			this.topografias.add(componente);
		}
	}
	
	/* La proporción de agua de una topografía compuesta está dada por la suma de la proporción de agua de 
	 * sus componentes dividida por 4. En el ejemplo, la proporción de agua es: (1+0+0+1) / 4 = 1/2. 
	 * La proporción siempre es un valor entre 0 y 1. 
	 */
	@Override
	public double proporcionDeAgua() {
		return (this.topografias.stream().mapToDouble(componente -> componente.proporcionDeAgua()).sum())/this.topografias.size();
	}

	@Override
	public boolean isEquals(Topografia topografia) {
		return this.topografias.equals(topografia.getTopografia());
	}
	
	@Override
	public List<Topografia> getTopografia (){
		return this.topografias;
	}
}
