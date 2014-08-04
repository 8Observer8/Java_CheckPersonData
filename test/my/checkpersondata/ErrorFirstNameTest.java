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
public class ErrorFirstNameTest
{
    
    public ErrorFirstNameTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        String firstName = "Ivan";
        ErrorFirstName error = new ErrorFirstName( firstName );
        
        String actual = error.toString();
        String expected = "Error: incorrect \"First Name\" " +
                "field. Text: " + firstName;
        assertEquals( expected, actual );
    }
    
}
