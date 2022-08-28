package my_test;

import Utils.DriverSetup;
import Utils.utility;
import base_test.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page_factory.LoginElements;
import page_object.LoginPage;

import java.io.IOException;

public class verifyUserLogin extends BaseTest {


    @Test
    public void verifyUserLogin() throws IOException {
        String userEmail= utility.getValue("UserEmail");
        String userPassword= utility.getValue("userPassword");
        loginPage.userEmailAddress(userEmail);
        loginPage.userPassword(userPassword);
        loginPage.clickContinue();

    }

}
