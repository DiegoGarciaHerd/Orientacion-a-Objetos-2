package ar.edu.unlp.info.oo2.ejercicio1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestUser {
	User user1;
	
	@BeforeEach 
	void setUp() {
		user1 = new User("Jeff");
		
	}
	@Test
	public void testDeleteTweets() {
		Tweet original = new Tweet("Buenas tardes");
		user1.tweet("Me gustan las flores");
		user1.tweet("Me gustan las tardes");
		user1.retweet(original);
		user1.removeTweets();
		assertEquals(0, user1.getTweets().size());
	}
}
