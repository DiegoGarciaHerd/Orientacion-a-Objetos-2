package ar.edu.unlp.oo2.Parcial3erFecha2022;

public abstract class Etapa {

	protected  void aprobarEtapa(Proyecto proyecto) {
		
	}

	protected void modificarMargenGanancia(Proyecto proyecto, double margenNuevo) {
		// TODO Auto-generated method stub
		
	}
	
	protected void cancelar(Proyecto p) {
		    p.agregarTextoObjetivo(" (Cancelado)");
		    p.setEtapa(new Cancelado());
	}
}
