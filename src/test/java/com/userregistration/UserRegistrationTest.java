package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_ShouldReturn_True() {
        boolean result=false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserMain userMain = new UserMain();
            result = userMain.FirstName("^[A-Z]{1}[a-z]{2,}$", "Avinash");
        }
        catch (InvalidUserException e){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result =false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserMain userMain = new UserMain();
            result = userMain.LastName("^[A-Z]{1}[a-z]{2,}$", "Biradar");
        }catch (InvalidUserException e){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenEmailStartsWithSmallLetter_ShouldReturn_True() {
        boolean result =false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserMain userMain = new UserMain();
            result = userMain.Email("^[a-zA-Z0-9\\\\-\\\\+\\\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","avinashbiradar64@gmail.com");
        }catch (InvalidUserException e){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True() {
        boolean result =false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserMain userMain = new UserMain();
            result = userMain.Phone("^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$","91 9604445258");
        }catch (InvalidUserException e){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneCapitalLetter_ShouldReturn_True() {
        boolean result =false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserMain userMain = new UserMain();
            result = userMain.Password("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1}).{8,}","Avinash@123");
        }catch (InvalidUserException e){
            e.printStackTrace();
        }
        Assert.assertTrue(result);
    }
    @RunWith(Parameterized.class)
    public static class TestFormRegistration
    {
        String emailId;
        boolean expectedResult;
        private UserMain emailVariable;
        UserMain formObject = new UserMain();
        public TestFormRegistration(String emailId, boolean expectedResult)
        {
            this.emailId = emailId;
            this.expectedResult = expectedResult;
        }
        @Before
        public void initialize()
        {
            emailVariable = new UserMain();
        }
        @Parameterized.Parameters
        public static List<Object[]> emails()
        {
            return Arrays.asList(new Object[][] { {"Avinash@gmail.com", true}, {"Avinash@gmail.co.in",true}, {"avinashgmail.com", false}});
        }
        @Test
        public void testEmailId() throws InvalidUserException {
            try {
                System.out.println("parameter email is->" + emailId);
                Assert.assertEquals(expectedResult, emailVariable.multipleEmailvalidate(emailId));
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }
    }
}