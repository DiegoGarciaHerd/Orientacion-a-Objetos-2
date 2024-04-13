package ar.edu.unlp.info.oo2.ejercicio1;

public class Tweet implements T_Tweet {
	
	private String text;
	
	public Tweet(String text) {
		super();
		this.text = text;
	}

	public T_Tweet getParent() {
		return null;
	}

	@Override
	public String getText() {
		
		return this.text;
	}
	
	
}
