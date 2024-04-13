package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.List;

public class Twitter {
	private List<User> users;
	
	public User addUser(String screenName) {
		if(this.users.stream().anyMatch(user -> user.getScreenName().equals(screenName))){
			return null;
		}
		else {
			 User user=new User(screenName);
			 this.users.add(user);
			 return user;
		}
		
	}
	
	public void deleteUser(String screenName) {
		this.users.removeIf(user -> user.getScreenName().equals(screenName));
	}
	
	
}
