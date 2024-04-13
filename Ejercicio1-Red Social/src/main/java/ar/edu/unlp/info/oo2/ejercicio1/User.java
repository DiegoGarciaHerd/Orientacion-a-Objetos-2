package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.List;

public class User {
	private List<T_Tweet> tweets;
	private String screenName;
	
	
	public User(String screenName) {
		super();
		this.screenName = screenName;
	}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	public T_Tweet tweet(String text) {
		if(text.length()<1 || text.length() > 280) {
			return null;
		}
		else {
			T_Tweet newTweet =new Tweet(text);
			this.tweets.add(newTweet);
			return newTweet;
		}
	}

	public List<T_Tweet> getTweets(){
		return this.tweets;
	}
	
	
	public T_Tweet retweet(T_Tweet tweet) {
		Retweet retweet=new Retweet(tweet);
		this.tweets.add(retweet);
		return retweet;
		
	}
}
