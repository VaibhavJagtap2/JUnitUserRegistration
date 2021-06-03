package com.userregistrationtest;

import java.util.regex.Pattern;

public class UserMain {
    private final String NAME_PATTERN = "[A-Z]{1}[a-z]{2,}$";

    public boolean FirstName(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}
