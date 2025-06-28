package ar.edu.unlp.oo2.Parcial2;

public class ConcreteItem extends Item {
	
	public ConcreteItem (int tamaño) {
		super(tamaño);
		
	}
	public Bolsa buscarBolsa(int espacio) {
		return null;
	}
	
	 public Item buscarPorNombre(String nombre) {
	        return this.getNombre().equals(nombre) ? this : null;
	    }
	 
	public int capacidadMaxima() {
		return 0;
	}

	@Override
	public int getEspacioMaximoDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}
}
