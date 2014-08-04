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
public class PersonTest
{

    public PersonTest()
    {
    }

    /**
     * Test of setNickName method, of class Person.
     */
    @Test
    public void testSetNickName()
    {
        Person person = new Person( );
        person.setNickName( "8Observer8" );

        String actual = person.getNickName();
        String expected = "8Observer8";

        assertEquals( expected, actual );
    }

    /**
     * Test of setFirstName method, of class Person.
     */
    @Test
    public void testSetFirstName()
    {
        Person person = new Person( );
        person.setFirstName( "Ivan" );

        String actual = person.getFirstName();
        String expected = "Ivan";

        assertEquals( expected, actual );
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastName()
    {
        Person person = new Person( );
        person.setLastName( "Enzhaev" );

        String actual = person.getLastName();
        String expected = "Enzhaev";

        assertEquals( expected, actual );
    }

    /**
     * Test of setPhoneNumber method, of class Person.
     */
    @Test
    public void testSetPhoneNumber()
    {
        Person person = new Person( );
        person.setPhoneNumber( "+79172122959" );

        String actual = person.getPhoneNumber();
        String expected = "+79172122959";

        assertEquals( expected, actual );
    }

    /**
     * Test of setEmail method, of class Person.
     */
    @Test
    public void testSetEmail()
    {
        Person person = new Person( );
        person.setEmail( "8observer8@gmail.com" );

        String actual = person.getEmail();
        String expected = "8observer8@gmail.com";

        assertEquals( expected, actual );
    }

    @Test
    public void testConstructor()
    {
        String nickName = "8Observer8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        String actualNickName = person.getNickName();
        String expectedNickName = "8Observer8";
        assertEquals( expectedNickName, actualNickName );

        String actualFirstName = person.getFirstName();
        String expectedFirstName = "Ivan";
        assertEquals( expectedFirstName, actualFirstName );

        String actualLastName = person.getLastName();
        String expectedLastName = "Enzhaev";
        assertEquals( expectedLastName, actualLastName );

        String actualPhoneNumber = person.getPhoneNumber();
        String expectedPhoneNumber = "+79172122959";
        assertEquals( expectedPhoneNumber, actualPhoneNumber );

        String actualEmail = person.getEmail();
        String expectedEmail = "8observer8@gmail.com";
        assertEquals( expectedEmail, actualEmail );
    }
}
