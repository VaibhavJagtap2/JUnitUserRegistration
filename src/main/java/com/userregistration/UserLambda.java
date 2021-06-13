package com.userregistration;

import java.util.regex.Pattern;

public class UserLambda {
    public static void main(String[] args) throws InvalidUserException {
        UserRegistrationLambda.Check firstNameRegex = (String pattern, String firstName) -> {
            try {
                if (Pattern.matches(pattern, firstName))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };
        UserRegistrationLambda.Check lastNameRegex = (String pattern, String lastName) -> {
            try {
                if (Pattern.matches(pattern, lastName))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };
        UserRegistrationLambda.Check emailRegex = (String pattern, String email) -> {
            try {
                if (Pattern.matches(pattern, email))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };
        UserRegistrationLambda.Check phoneRegex = (String pattern, String phoneNumber) -> {
            try {

                if (Pattern.matches(pattern, phoneNumber))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };
        UserRegistrationLambda.Check passwordRegex = (String pattern, String password) -> {
            try {
                if (Pattern.matches(pattern, password))
                    return true;
                else
                    return false;
            } catch (NullPointerException e) {
                throw new InvalidUserException("Please enter proper message");
            }
        };

        firstNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "Vaibhav");
        firstNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "vaibhav");
        firstNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "vai");
        firstNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "Vai");
        lastNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "Jagtap");
        lastNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "jagtap");
        lastNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "jag");
        lastNameRegex.check("^[A-Z]{1}[a-z]{2,}$", "Jag");
        emailRegex.check("^[a-zA-Z0-9.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "vaibhavjagtap8258@gmail.com");
        emailRegex.check("^[a-zA-Z0-9.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "Vaibhav@gmail.co.in");
        emailRegex.check("^[a-zA-Z0-9.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "vaibhav199831#gmail.com");
        phoneRegex.check("^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$", "91 8758452075");
        phoneRegex.check("^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$", "91 78642243232");
        passwordRegex.check("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1}).{8,}", "Vaibhav@123");
        passwordRegex.check("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1}).{8,}", "Vaibhav$12345");

    }
}

