package ar.edu.unlp.info.oo2.ejercicio1;

public class Tweet implements T_Tweet {
	
	private String text;
	
	public Tweet(String text) {
		super();
		this.text = text;
	}

	@Override
	public String getText() {
		return this.text;
	}
	
	public void deleteTweet() {
		this.text= "El tweet ha sido eliminado";
	}

	
}
