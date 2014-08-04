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
public class ErrorPhoneNumberTest
{
    
    public ErrorPhoneNumberTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        String phoneNumber = "+79172122959";
        ErrorPhoneNumber error = new ErrorPhoneNumber( phoneNumber );
        
        String actual = error.toString();
        String expected = "Error: incorrect \"Phone Number\" " +
                "field. Text: " + phoneNumber;
        assertEquals( expected, actual );
    }
    
}
