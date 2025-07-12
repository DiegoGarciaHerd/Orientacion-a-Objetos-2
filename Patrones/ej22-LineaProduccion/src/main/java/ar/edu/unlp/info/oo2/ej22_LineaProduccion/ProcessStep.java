package ar.edu.unlp.info.oo2.ej22_LineaProduccion;

public abstract class ProcessStep {
	private boolean result;
	
	public void execute(MixingTank tank) {
		if(this.basicExecute(tank)) {
			this.setSuccess();
		}
		else {
			this.setFailure();
		}
	}
	
	protected abstract boolean basicExecute(MixingTank tank);
	
	public boolean isDone() {
		
	}
	
	private void setSuccess() {
		
	}
	
	private void setFailure() {
		
	}
	
}
