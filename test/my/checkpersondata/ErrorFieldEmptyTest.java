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
public class ErrorFieldEmptyTest
{
    
    public ErrorFieldEmptyTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        ErrorFieldEmpty error = new ErrorFieldEmpty();
        
        String actual = error.toString();
        String expected = "Error: empty text field";
        
        assertEquals( expected, actual );
    }
    
}
