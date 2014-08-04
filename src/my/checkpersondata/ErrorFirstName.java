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
public class ErrorFirstName extends ErrorPersonField
{
    ErrorFirstName( String firstName )
    {
        super( firstName );
        m_message = "Error: incorrect \"First Name\" " +
                "field. Text: " + m_fieldValue;
    }
}
