/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage.own.books;

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
public class RegisterBookTest {
    
    public RegisterBookTest() {
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
     * Test of getflag method, of class RegisterBook.
     */
    @Test
    public void testGetflag() {
        System.out.println("getflag");
        RegisterBook instance = new RegisterBook();
        int expResult = 0;
        instance.n1 = "53";
        instance.n2 = "2010";
        instance.n3 = "24th July, 2015";
        instance.n4 = "135";
        instance.n5 = "Harper Collins";
        int result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.n1 = "Harry Potter";
        instance.n2 = "Not int";
        instance.n3 = "1st July, 2013";
        instance.n4 = "555";
        instance.n5 = "Bloomsbury";
        
        expResult = 0;
        instance.n1 = "The Immortals of Meluha";
        instance.n2 = "2013";
        instance.n3 = "23rd August, 2014";
        instance.n4 = "Not float";
        instance.n5 = "Westland Press";
        
        expResult = 0;
        instance.n1 = "RD Sharma";
        instance.n2 = "2013";
        instance.n3 = "23rd August, 2016";
        instance.n4 = "534.56";
        instance.n5 = "";
        
        expResult = 1;
        instance.n1 = "RD Sharma";
        instance.n2 = "2013";
        instance.n3 = "23rd August, 2016";
        instance.n4 = "534.56";
        instance.n5 = "Dhanpat Rai Publications";
        
        result = instance.getflag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class RegisterBook.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        RegisterBook.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
