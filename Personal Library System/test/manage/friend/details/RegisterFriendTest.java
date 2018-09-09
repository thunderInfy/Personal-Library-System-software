/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage.friend.details;

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
public class RegisterFriendTest {
    
    public RegisterFriendTest() {
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
     * Test of getflag method, of class RegisterFriend.
     */
    @Test
    public void testGetflag() {
        System.out.println("getflag");
        RegisterFriend instance = new RegisterFriend();
        int expResult = 0;
        instance.n1 = "11";
        instance.n2 = "Pune";
        instance.n3 = "9412145677";
        int result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.n1 = "Rishabh";
        instance.n2 = "";
        instance.n3 = "9412375677";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.n1 = "Haque Farazul";
        instance.n2 = "Haryana";
        instance.n3 = "Not numbers";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 0;
        instance.n1 = "Richard Branson";
        instance.n2 = "Boston";
        instance.n3 = "t45";
        result = instance.getflag();
        assertEquals(expResult, result);
        
        expResult = 1;
        instance.n1 = "Rishabh Sinha";
        instance.n2 = "Patna";
        instance.n3 = "7689012567";
        result = instance.getflag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class RegisterFriend.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        RegisterFriend.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
