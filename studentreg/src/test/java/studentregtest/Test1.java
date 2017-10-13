//Liam Phillips
//13390871
//4BP

package studentregtest;

import studentreg.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 {
    
    
    @Test
    public void getUsername_check(){
        Student s = new Student("Liam Phillips","22/11/1995",21,"4BP");
        String expected = "Liam_Phillips_21";
        assertEquals(expected, s.getUsername());
    }
    
    public Test1() {
    	
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


}