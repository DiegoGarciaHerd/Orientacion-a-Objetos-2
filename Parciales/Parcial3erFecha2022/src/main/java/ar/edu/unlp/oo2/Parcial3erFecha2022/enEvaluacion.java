package ar.edu.unlp.oo2.Parcial3erFecha2022;

public class enEvaluacion extends Etapa {

	@Override
	protected void aprobarEtapa(Proyecto proyecto) {
		proyecto.setEtapa(new Confirmado());
		
	}

}
