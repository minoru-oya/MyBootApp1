package jp.te4a.spring.boot.myapp1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
	public void test() {
		HelloController helloController = new HelloController();
		String expected = "Hello, Spring Boot!";
		String actual = helloController.index();
		
		assertEquals(expected,actual);
	}
    
    
}
