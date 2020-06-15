package lib.ui.mobile_web;

import lib.ui.NavigationUi;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWNavigationUI extends NavigationUi {
    static {
        MY_LISTS_BUTTON = "xpath://*[@id='ca-watch']";
        OPEN_NAVIGATION = "xpath://label[@data-event-name='ui.mainmenu']";
        MY_LISTS_LINK = "xpath://a[@data-event-name='menu.unStar']";
    }
    public MWNavigationUI(RemoteWebDriver driver)
    {
        super(driver);
    }
}
