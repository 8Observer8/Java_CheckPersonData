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
public class ErrorFieldEmpty extends ErrorPersonField
{
    ErrorFieldEmpty( ) {
        super( "" );
        m_message = "Error: empty text field";
    }
}
