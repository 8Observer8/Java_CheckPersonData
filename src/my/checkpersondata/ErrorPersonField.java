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
public class ErrorPersonField extends Exception
{
    ErrorPersonField( String fieldValue )
    {
        m_fieldValue = fieldValue;
    }
    
    @Override
    public String toString()
    {
        return m_message;
    }
    
    protected String m_fieldValue;
    protected String m_message;
}
