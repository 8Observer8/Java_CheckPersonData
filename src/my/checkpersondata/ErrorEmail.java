/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.checkpersondata;

/**
 *
 * @author Ivan
 */
public class ErrorEmail extends ErrorPersonField
{
    ErrorEmail( String email )
    {
        super( email );
        m_message = "Error: incorrect \"Email\" " +
                "field. Text: " + email;
    }
}
