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
public class FriendloginTest {
    
    public FriendloginTest() {
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
     * Test of getflag method, of class Friendlogin.
     */
    @Test
    public void testGetflag() {
        System.out.println("friend login getflag");
        Friendlogin instance = new Friendlogin();
        int expResult = 0;
        instance.N = "Not a name 3";
        int result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 1;
        instance.N = "Nikhil Nayan Jha";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 1;
        instance.N = "Omar Eqbal";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.N = "#Nitesh";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.N = "Harvard";
        result = instance.getflag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Friendlogin.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Friendlogin.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
