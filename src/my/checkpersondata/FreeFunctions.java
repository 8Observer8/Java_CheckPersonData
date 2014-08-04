/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.checkpersondata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ivan
 */
public class FreeFunctions
{

    public void checkPersonFields( Person person )
            throws ErrorNickName, ErrorFirstName, ErrorLastName,
            ErrorPhoneNumber, ErrorEmail, ErrorFieldEmpty
    {
        String nickName = person.getNickName();
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String phoneNumber = person.getPhoneNumber();
        String email = person.getEmail();

        // Check argument on empty
        if ( nickName.isEmpty()
                || firstName.isEmpty()
                || lastName.isEmpty()
                || phoneNumber.isEmpty()
                || email.isEmpty() ) {
            throw new ErrorFieldEmpty();
        }

        // Check the nick name
        String strPatternForNickName = "\\W";
        Pattern objPatternForNickName
                = Pattern.compile( strPatternForNickName );
        Matcher matcherForNickName
                = objPatternForNickName.matcher( nickName );
        if ( matcherForNickName.find() ) {
            throw new ErrorNickName( nickName );
        }

        // Check the first name
        String strPatternForFirstName = "[\\W\\d_]";
        Pattern objPatternForFirstName
                = Pattern.compile( strPatternForFirstName );
        Matcher matcherForFirstName
                = objPatternForFirstName.matcher( firstName );
        if ( matcherForFirstName.find() ) {
            throw new ErrorFirstName( firstName );
        }

        // Check the last name
        String strPatternForLastName = "[\\W\\d_]";
        Pattern objPatternForLastName
                = Pattern.compile( strPatternForLastName );
        Matcher matcherForLastName
                = objPatternForLastName.matcher( lastName );
        if ( matcherForLastName.find() ) {
            throw new ErrorLastName( lastName );
        }
        
        // Check the phone number
        String strPatternForPhoneNumber = "\\+7[\\d]{10}\\b";
        Pattern objPatternForPhoneNumber
                = Pattern.compile( strPatternForPhoneNumber );
        Matcher matcherForPhoneNumber
                = objPatternForPhoneNumber.matcher( phoneNumber );
        if ( !matcherForPhoneNumber.find() ) {
            throw new ErrorPhoneNumber( phoneNumber );
        }
        
        // Check the email
        String strPatternForEmail = "\\w+[\\w\\.]+@[\\w\\.]+\\.\\w+";
        Pattern objPatternForEmail
                = Pattern.compile( strPatternForEmail );
        Matcher matcherForEmail
                = objPatternForEmail.matcher( email );
        if ( !matcherForEmail.find() ) {
            throw new ErrorEmail( email );
        }
    }
}
