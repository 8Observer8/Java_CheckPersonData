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
public class ErrorNickNameTest
{
    
    public ErrorNickNameTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        String nickName = "8Observer8";
        ErrorNickName error = new ErrorNickName( nickName );
        
        String actual = error.toString();
        String expected = "Error: incorrect \"Nick Name\" " +
                "field. Text: " + nickName;
        
        assertEquals( expected, actual );
    }
    
}
