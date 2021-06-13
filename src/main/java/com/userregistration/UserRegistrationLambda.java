package com.userregistration;

public interface UserRegistrationLambda {
    @FunctionalInterface
    interface Check {
        boolean check(String a, String b) throws InvalidUserException;
    }
}
