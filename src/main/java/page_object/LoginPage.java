package page_object;

import page_factory.LoginElements;

public class LoginPage extends BasePage{
    public void userEmailAddress(String userEmail){
        LoginElements loginElements= new LoginElements(getDriver());
        loginElements.email_address.sendKeys(userEmail);
    }

    public void userPassword(String userPassowrd){
        LoginElements loginElements= new LoginElements(getDriver());
        loginElements.password.sendKeys(userPassowrd);
    }
    public void clickContinue(){
        LoginElements loginElements= new LoginElements(getDriver());
        loginElements.Sign_in_button.click();

    }
}
