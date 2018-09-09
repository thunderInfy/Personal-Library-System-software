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
public class ownerloginTest {
    
    public ownerloginTest() {
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
     * Test of getflag method, of class ownerlogin.
     */
    @Test
    public void testGetflag() {
        System.out.println("owner login getflag");
        ownerlogin instance = new ownerlogin();
        int expResult = 1;
        instance.pass = "pswd";
        int result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.pass = "pssd";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.pass = "PSWD";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.pass = "password";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.pass = "owner";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.pass = "iamowner";
        result = instance.getflag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     

    /**
     * Test of main method, of class ownerlogin.
     */
   /* @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ownerlogin.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
