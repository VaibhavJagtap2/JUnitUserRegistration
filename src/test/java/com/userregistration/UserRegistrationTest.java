package com.userregistration;

import com.userregistrationtest.UserMain;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenWithCapitalShouldReturn_True(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Vaibhav");
        Assert.assertEquals(result,true);
    }
    @Test
    public void givenFirstName_WhenWithNotCapitalShouldReturn_False(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("vaibhav");
        Assert.assertEquals(result,false);
    }
    @Test
    public void givenFirstName_WhenHaveMinimumThreeLettersShouldReturn_True(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Vai");
        Assert.assertEquals(result,true);
    }
    @Test
    public void  givenFirstName_WhenHaveMinimumThreeLetters_ShouldReturn_False(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Va");
        Assert.assertEquals(result,false);
    }
    @Test
    public void givenLastName_WhenWithCapitalShouldReturn_True(){
        UserMain userMain = new UserMain();
        boolean result = userMain.LastName("Jagtap");
        Assert.assertEquals(result,true);
    }
    @Test
    public void givenLastName_WhenNotWithCapitalShouldReturn_False(){
        UserMain userMain = new UserMain();
        boolean result = userMain.LastName("jagtap");
        Assert.assertEquals(result,false);
    }
    @Test
    public void givenLastName_WhenHaveMinimumThreeLetterStartWithCapital_ShouldReturn_True(){
        UserMain userMain = new UserMain();
        boolean result = userMain.LastName("Jag");
        Assert.assertEquals(result,true);
    }
    @Test
    public void givenLastName_WhenHaveMinimumThreeLetterNotStartWithCapital_ShouldReturn_False(){
        UserMain userMain = new UserMain();
        boolean result = userMain.LastName("jag");
        Assert.assertEquals(result,false);
    }
}

