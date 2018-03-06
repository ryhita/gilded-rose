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

   
}
