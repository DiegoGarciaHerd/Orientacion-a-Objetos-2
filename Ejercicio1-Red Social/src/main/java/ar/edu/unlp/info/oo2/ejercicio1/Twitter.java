package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<User> users;
	

	public Twitter() {
		this.users = new ArrayList<User>();
	}
	public User addUser(String screenName) {
		if(userExists(screenName)){
			return null;
		}
		else {
			 User user=new User(screenName);
			 this.users.add(user);
			 return user;
		}
		
	}
	
	public boolean userExists(String screenName) {
		return this.users.stream().anyMatch(user -> user.getScreenName().equals(screenName));
	}
	public void deleteUser(User user) {
		if (user!= null && userExists(user.getScreenName())) {
			user.removeTweets();
			this.users.remove(user);
		}


	}
	
	public List<User> getUsers() {
		return this.users;
	}
}
