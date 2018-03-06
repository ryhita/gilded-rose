package fr.esiea;


import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SpringWebApplicationTest {
    SpringWebApplication app;

    @Before
    public void setUp() throws Exception {
        app = new SpringWebApplication();
    }

    @After
    public void cleanHashmap()throws Exception{
        app.db.clear();
    }

      @Test
    public void list_items(){
        String str = app.listItems().toString();
        assertEquals("[]", str);
    }
    
    @Test
    public void buy_wrong_item(){
        String str = app.buyItem("Test", 10);
        assertEquals("Erreur, cet item n'existe pas", str);
    }
   
}
