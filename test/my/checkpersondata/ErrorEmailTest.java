/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.checkpersondata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class ErrorEmailTest
{
    
    public ErrorEmailTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        String email = "8observer8@gmail.com";
        ErrorEmail error = new ErrorEmail( email );
        
        String actual = error.toString();
        String expected = "Error: incorrect \"Email\" " +
                "field. Text: " + email;
        assertEquals( expected, actual );
    }
    
}
