package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenStartWithCapitalLetter_ShouldReturn_True(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("Vaibhav");
        Assert.assertEquals(result,true);
    }
    @Test
    public void givenFirstName_WhenNotStartWithCapitalLetter_ShouldReturn_False(){
        UserMain userMain = new UserMain();
        boolean result = userMain.FirstName("vaibhav");
        Assert.assertEquals(result,false);
    }
    @Test
    public void givenFirstName_WhenHaveMinimumThreeLetters_ShouldReturn_True(){
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
    @Test
    public void givenEmail_WhenStartWithSmallLetter_ShouldReturn_True(){
        UserMain userMain = new UserMain();
        boolean result = userMain.Email("abc54@gmail.com");
        Assert.assertEquals(result,true);
    }
    @Test
    public void givenEmail_WhenStartWithCapitalLetter_ShouldReturn_False(){
        UserMain userMain = new UserMain();
        boolean result = userMain.Email("Abc53@gmail.com");
        Assert.assertEquals(result,false);
    }
    @Test
    public void givenEmail_WhenEndsWithcomOrin_ShouldReturn_True(){
      UserMain userMain = new UserMain();
      boolean result = userMain.Email("abc54@yahoo.in");
      Assert.assertEquals(result,true);
    }
    @Test
    public void givenEmail_WhenNotEndsWithcomOrin_ShouldReturn_False(){
        UserMain userMain = new UserMain();
        boolean result = userMain.Email("Abc.53@yahoo.in");
        Assert.assertEquals(result, false);

    }

}

