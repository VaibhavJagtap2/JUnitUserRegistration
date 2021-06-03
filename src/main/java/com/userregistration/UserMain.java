package com.userregistration;

import java.util.regex.Pattern;

public class UserMain {
    private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private final String EMAIL_PATTERN = "^[a-z]+[A-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    public boolean FirstName(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean LastName(String lastName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    public boolean Email(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
