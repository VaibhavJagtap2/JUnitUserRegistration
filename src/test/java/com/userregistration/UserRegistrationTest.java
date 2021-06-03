package com.userregistration;

import com.userregistrationtest.UserMain;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstNameShouldReturn_True(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Vaibhav");
        Assert.assertEquals(result,true);
    }
    @Test
    public void givenFirstNameShouldReturn_False(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("vaibhav");
        Assert.assertEquals(result,false);
    }
    @Test
    public void givenFirstName_MinimumThreeLettersShouldReturn_True(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Vai");
        Assert.assertEquals(result,true);
    }
    @Test
    public void  givenFirstName_MinimumThreeLetters_ShouldReturn_False(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Va");
        Assert.assertEquals(result,false);
    }
}

