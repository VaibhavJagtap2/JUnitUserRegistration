package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    //when the name starts with a capital letter
    public void givenFirstName_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Vaibhav");
        Assert.assertEquals(true, result);
    }
    @Test
    //when a name starts with a small letter
    public void givenFirstName_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("vaibhav");
        Assert.assertEquals(false, result);
    }
    //when a name has 3 or more letters
    @Test
    public void givenFirstName_MinimumThreeLetters_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Vai");
        Assert.assertEquals(true, result);
    }
    @Test
    //when a name does not contain 3 minimum letters
    public void givenFirstName_NotHaveMinimumThreeLetters_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Va");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.LastName("Jagtap");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenLastNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.LastName("jagtap");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenLastNameHaveMinimumThreeLetter_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.LastName("Jag");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenLastNameNotHaveMinimumThreeLetter_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.LastName("ja");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenEmailStartsWithSmallLetter_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Email("abc45@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenEmailNotStartsWithSmallLetter_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Email("Abc@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenEmailEndsWithComOrIn_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Email("abc111@yahoo.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenEmailNotEndsWithComOrIn_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Email("Abc@gmail.kjnk");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Phone("91 9604445258");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotFollowedByCountryCode_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Phone("8105215414");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsTenDigit_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Phone("91 9604445258");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNotTenDigit_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Phone("91 8105215");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenPasswordIsMinimumEightDigit_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Password("Vaibhav43#2");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenPasswordIsNotMinimumEightDigit_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Password("vaibns");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneCapitalLetter_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Password("Vaibhav@345");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneCapitalLetter_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Password("vsvsai@");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneNumericNumber_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Password("Vaibhav2@3");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneNumericNumber_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Password("adased@");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneSpeacialCharacter_ShouldReturn_True() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Password("Vaibahv234$");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneSpeacialCharacter_ShouldReturn_False() {
        UserMain userMain = new UserMain();
        boolean result = userMain.Password("vaibahv123");
        Assert.assertEquals(false, result);
    }
}

