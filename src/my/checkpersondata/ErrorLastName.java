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
public class ErrorLastName extends ErrorPersonField
{
    ErrorLastName( String lastName )
    {
        super( lastName );
        m_message = "Error: incorrect \"Last Name\" " +
                "field. Text: " + m_fieldValue;
    }
}
