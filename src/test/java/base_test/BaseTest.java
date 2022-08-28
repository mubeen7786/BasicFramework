package base_test;
import Utils.utility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page_object.BasePage;
import page_object.LoginPage;

import java.io.IOException;

public class BaseTest{
    BasePage basePage=new BasePage();
    protected LoginPage loginPage=new LoginPage();

    @BeforeClass
    public WebDriver getDriver(){
        return basePage.getDriver();
    }

    @Test
    public void OpenBrowser() throws IOException {
        String url_Address= utility.getValue("url");
        basePage.loadpage(url_Address);
    }
    @AfterTest
    public void closeDriver(){
//    getDriver().close();
    }

 }


