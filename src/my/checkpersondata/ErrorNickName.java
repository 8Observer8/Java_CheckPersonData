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
public class ErrorNickName extends ErrorPersonField
{
    ErrorNickName( String nickName )
    {
        super( nickName );
        m_message = "Error: incorrect \"Nick Name\" " +
                "field. Text: " + m_fieldValue;
    }
}
