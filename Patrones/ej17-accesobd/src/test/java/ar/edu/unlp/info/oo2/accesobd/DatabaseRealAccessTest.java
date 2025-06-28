package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private DatabaseAccessProxy databaseProxy;
    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.databaseProxy = new DatabaseAccessProxy(database,"realkey");
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    
    @Test 
    void testLogin() {
    	assertDoesNotThrow(() ->databaseProxy.login("realkey"));
    }
    
    @Test
    void testGetSearchResultsWithProxy() {
    	databaseProxy.login("realkey");
        Collection<String> result = databaseProxy.getSearchResults("select * from comics where id=1");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), result);
    }
    
    @Test 
    void testInsertNewRowWithProxy () {
    	databaseProxy.login("realkey");
    	 int id = databaseProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
         assertEquals(3, id);
         Collection<String> result = databaseProxy.getSearchResults("select * from comics where id=3");
         assertEquals(Arrays.asList("Patoruzú", "La flor"), result);
    }
}