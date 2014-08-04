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
public class ErrorPhoneNumber extends ErrorPersonField
{
    ErrorPhoneNumber( String phoneNumber )
    {
        super( phoneNumber );
        m_message = "Error: incorrect \"Phone Number\" " +
                "field. Text: " + phoneNumber;
    }
}
