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
public class ErrorLastNameTest
{
    
    public ErrorLastNameTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        String lastName = "Enzhaev";
        ErrorLastName error = new ErrorLastName( lastName );
        
        String actual = error.toString();
        String expected = "Error: incorrect \"Last Name\" " +
                "field. Text: " + lastName;
        assertEquals( expected, actual );
    }
    
}
