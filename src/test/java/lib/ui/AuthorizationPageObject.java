package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

public class AuthorizationPageObject extends MainPageObject {
    private static final String
        LOGIN_BUTTON = "xpath://a[contains(text(),'Log in')]",
        LOGIN_INPUT = "css:input[name='wpName']",
        PASSWORD_INPUT = "css:input[name='wpPassword']",
        SUBMIT_BUTTON = "css:button[name='wploginattempt']";

    public AuthorizationPageObject (RemoteWebDriver driver)
    {
        super(driver);
    }

    public void clickAuthButton()
    {
        this.WaitForElementPresent(LOGIN_BUTTON, "Cannot find login button", 5);
        this.tryClickElementWithFewAttempts(LOGIN_BUTTON, "Cannot find login button", 5);
        //
        //this.WaitForElementAndClick(LOGIN_BUTTON, "Cannot find and click login button", 5);
    }

    public void enterLoginData(String login, String password)
    {
        this.WaitForElementAndSendKeys(LOGIN_INPUT, "Cannot find and send keys to login input", 5, login);
        this.WaitForElementAndSendKeys(PASSWORD_INPUT, "Cannot find and send keys to login input", 5, password);
    }

    public void submitForm()
    {
        this.WaitForElementAndClick(SUBMIT_BUTTON, "Cannot find and click submit button", 5 );
    }


}
