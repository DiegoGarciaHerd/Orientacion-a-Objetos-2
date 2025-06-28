package ar.edu.unlp.info.oo2.ej11_Topografias;

import java.util.List;

public class Mixta implements Topografia {
	
	private List<Topografia> topografias;
	
	@Override
	public void add(Topografia componente) {
		if(this.topografias.size() < 4) {
			this.topografias.add(componente);
		}
		
	}

	@Override
	public void remove(Topografia componente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getChild(int i) {
		// TODO Auto-generated method stub
		
	}
	
	/* La proporción de agua de una topografía compuesta está dada por la suma de la proporción de agua de 
	 * sus componentes dividida por 4. En el ejemplo, la proporción de agua es: (1+0+0+1) / 4 = 1/2. 
	 * La proporción siempre es un valor entre 0 y 1. 
	 */
	public double proporcionDeAgua () {
		double  suma=0;
		for(Topografia c : this.children) {
			suma+=c.proporcionDeAgua();
		}
		
		return suma / 4;
	}
	
	
	public boolean isEquals(Mixta mixta) {
		Topografia componente1;
		Topografia componente2;
		for (int i = 0; i < this.getComponentes().size(); i++) {
			componente1 = this.getComponentes().get(i);
			componente2 = mixta.getComponentes().get(i);
			if (!componente1.isEquals(componente2)) {
				return false;
			}
		}
		return true;
	}

	private List<Topografia> getComponentes() {
		// TODO Auto-generated method stub
		return topografias;
	}
	

	
}
