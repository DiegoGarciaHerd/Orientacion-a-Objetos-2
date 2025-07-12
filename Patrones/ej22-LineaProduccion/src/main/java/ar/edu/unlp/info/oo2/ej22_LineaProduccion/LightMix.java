package ar.edu.unlp.info.oo2.ej22_LineaProduccion;

public class LightMix extends ProcessStep{

	@Override
	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(20)
		        && tank.mixerPower(5);
	}

}
