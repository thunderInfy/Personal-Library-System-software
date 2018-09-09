/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.library.system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author infinity
 */
public class friendpswdTest {
    
    public friendpswdTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setName method, of class friendpswd.
     */
  

    /**
     * Test of getflag method, of class friendpswd.
     */
    @Test
    public void testGetflag() {
        System.out.println("friend password getflag");
        friendpswd instance = new friendpswd();
        int expResult = 0;
        instance.pass = "####";
        instance.Name = "Nikhil Nayan Jha";
        int result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.pass = "password";
        instance.Name = "Himanshu Mundhra";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.pass = "&#$D";
        instance.Name = "Sarthak Chakraborty";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.pass = "!@#$%^&";
        instance.Name = "Sarthak Chakraborty";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 1;
        instance.pass = "omar";
        instance.Name = "Omar Eqbal";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 1;
        instance.pass = "himanshu";
        instance.Name = "Himanshu Mundhra";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class friendpswd.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        friendpswd.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
