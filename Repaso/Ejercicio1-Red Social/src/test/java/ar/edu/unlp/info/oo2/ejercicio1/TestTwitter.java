package ar.edu.unlp.info.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTwitter {
	
	Twitter twitter;
	@BeforeEach
	void setUp () {
		twitter = new Twitter();
	
	}

	@Test
	void testAddUser() {
		twitter.addUser("Franco");
		twitter.addUser("Marquez");
		twitter.addUser("Franco");
		twitter.addUser("Franco");
		assertEquals(2, twitter.getUsers().size());
	}


}
