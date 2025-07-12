package ar.edu.unlp.oo2.Parcial3erFecha2022;

public class enConstruccion extends Etapa {

	@Override
	protected void aprobarEtapa(Proyecto proyecto) {
		if(proyecto.getPrecio() == 0) {
			proyecto.setEtapa(new enEvaluacion());
		}
		else {
			throw new RuntimeException("Este es mi mensaje de error");
		}
	}

	@Override
	protected void modificarMargenGanancia(Proyecto proyecto,double margenNuevo) {
		if(proyecto.getMargenGanancia() > 0.08 && proyecto.getMargenGanancia() < 0.11) {
			proyecto.setMargenGanancia(margenNuevo);
		}
		else {
			throw new RuntimeException("Margen inválido para etapa En Construcción.");
		}
		
	}

}
