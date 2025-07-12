package ar.edu.unlp.info.oo2.ej22_LineaProduccion;

public class Purge extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(0)
		        && tank.mixerPower(0)
		        && tank.purge();
	}

	

}
