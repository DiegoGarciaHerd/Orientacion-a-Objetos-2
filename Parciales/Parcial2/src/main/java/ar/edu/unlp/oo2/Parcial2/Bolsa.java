package ar.edu.unlp.oo2.Parcial2;

import java.util.LinkedList;
import java.util.List;

public class Bolsa extends Item {
	private List<Item> items;
	private int capacidad; 
	
	public Bolsa ( int capacidad,int tamaño) {
		super(capacidad);
		this.capacidad = capacidad;
		this.items= new LinkedList<Item>();
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	public Bolsa buscarBolsa(int espacio) {
		if(this.capacidad > espacio) {
			return this;
		}
		// Si no, busca recursivamente en los ítems que sean bolsas
		for (Item item : items) {
			Bolsa encontrada = item.buscarBolsa(espacio);
			if (encontrada != null) {
				return encontrada;
			}
		}

		// No encontró ninguna bolsa con espacio suficiente
		return null;
	}
	
	public void addItem(Item item) {
		if(this.capacidad > item.getEspacio()) {
			this.items.add(item);
		}
		
		
	}
	
	public Item buscarPorNombre(String nombre) {
		if(this.getNombre().equals(nombre)) {
			return this;
		}
		
		for (Item item : items) {
			Item encontrado = item.buscarPorNombre(nombre);
			if (encontrado != null) {
				return encontrado;
			}
		}
		
		return null;
	}
	
	public int getEspacioDisponible () {
		return this.capacidad - this.items.stream().mapToInt(c -> c.getEspacio()).sum();
	}
	
	 public int getEspacioMaximoDisponible() {
	        int maximo = this.getEspacioDisponible();
	        
	        for (Item item : items) {
	            if (item instanceof Bolsa) {
	                int espacioSubBolsa = ((Bolsa) item).getEspacioMaximoDisponible();
	                if (espacioSubBolsa > maximo) {
	                    maximo = espacioSubBolsa;
	                }
	            }
	        }
	        
	        return maximo;
	    }
	 
	 public int capacidadMaxima() {
		 return this.getCapacidad() + this.items.stream().mapToInt(i -> i.capacidadMaxima()).sum();
	 }
}
