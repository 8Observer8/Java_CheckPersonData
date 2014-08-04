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
public class Person
{

    Person( String nickName,
            String firstName,
            String lastName,
            String phoneNumber,
            String email )
    {
        m_nickName = nickName;
        m_firstName = firstName;
        m_lastName = lastName;
        m_phoneNumber = phoneNumber;
        m_email = email;
    }

    public Person()
    {
        this( "", "", "", "", "" );
    }

    public void setNickName( String nickName )
    {
        m_nickName = nickName;
    }

    public void setFirstName( String firstName )
    {
        m_firstName = firstName;
    }

    public void setLastName( String lastName )
    {
        m_lastName = lastName;
    }

    public void setPhoneNumber( String phoneNumber )
    {
        m_phoneNumber = phoneNumber;
    }

    public void setEmail( String email )
    {
        m_email = email;
    }

    public String getNickName()
    {
        return m_nickName;
    }

    public String getFirstName()
    {
        return m_firstName;
    }

    public String getLastName()
    {
        return m_lastName;
    }

    public String getPhoneNumber()
    {
        return m_phoneNumber;
    }

    public String getEmail()
    {
        return m_email;
    }

    private String m_nickName;
    private String m_firstName;
    private String m_lastName;
    private String m_phoneNumber;
    private String m_email;
}
