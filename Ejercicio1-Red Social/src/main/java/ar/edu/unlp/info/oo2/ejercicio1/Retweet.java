package ar.edu.unlp.info.oo2.ejercicio1;

public class Retweet implements T_Tweet{
	private T_Tweet parent;
	
	public Retweet(T_Tweet parent) {
		this.parent=parent;
	}
	
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public T_Tweet getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}
	
}
