/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.checkpersondata;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Ivan
 */
public class FreeFunctionsTest
{

    public FreeFunctionsTest()
    {
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testNormalTest() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";

        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        try {
            instance.checkPersonFields( person );
        } catch ( Exception e ) {
            fail( "Should not have thrown any exception. But it throw: " +
                    e.toString() );
        }
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testEmptyNickName() throws Exception
    {
        String nickName = "";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorFieldEmpty.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testEmptyFirstName() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorFieldEmpty.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testEmptyLastName() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorFieldEmpty.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testEmptyPhoneNumber() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorFieldEmpty.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testEmptyEmail() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorFieldEmpty.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorNickName() throws Exception
    {
        String nickName = "8Oberv$er8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorNickName.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorFirstName01() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Iva8n";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorFirstName.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorFirstName02() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Iva_n";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorFirstName.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorFirstName03() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Iva$n";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorFirstName.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorLastName01() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzh8aev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorLastName.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorLastName02() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzh_aev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorLastName.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorLastName03() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzh$aev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorLastName.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorPhoneNumber01() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "-79172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorPhoneNumber.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorPhoneNumber02() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+791721229_9";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorPhoneNumber.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorPhoneNumber03() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+791721229W9";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorPhoneNumber.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorPhoneNumber04() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+791721229591";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorPhoneNumber.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorPhoneNumber05() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+89172122959";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorPhoneNumber.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorPhoneNumber06() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+791721229$9";
        String email = "8observer8@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorPhoneNumber.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorEmail01() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorEmail.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorEmail02() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "8observer8@gmailcom";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorEmail.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorEmail03() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "@gmail.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        exception.expect( ErrorEmail.class );
        instance.checkPersonFields( person );
    }

    /**
     * Test of checkPersonFields method, of class FreeFunctions.
     */
    @Test
    public void testErrorEmail04() throws Exception
    {
        String nickName = "8Oberver8";
        String firstName = "Ivan";
        String lastName = "Enzhaev";
        String phoneNumber = "+79172122959";
        String email = "ivan01.prog1987@gmail.en.com";
        Person person = new Person( nickName, firstName, lastName,
                phoneNumber, email );

        FreeFunctions instance = new FreeFunctions();

        try {
            instance.checkPersonFields( person );
        } catch ( Exception e ) {
            fail( "Should not have trown any exceptions. But it throw: " +
                    e.toString() );
        }
    }
}
