package lib.ui.mobile_web;

import lib.ui.MainPageObject;
import lib.ui.MyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWMyListsPageObject extends MyListsPageObject {
    static {
        FOLDER_BY_NAME_TPL = "xpath://*[@text='{FOLDER_NAME}']";
        ARTICLE_BY_TITLE_TPL = "xpath://h3[(text()='{TITLE}')]";  //h3[contains(text(),'Java')]
        POPUP_CLOSE_BUTTON = "xpath://XCUIElementTypeButton[@name='Close']";
        POPUP_TITLE  = "id:Sync your saved articles?";
        SWIPE_TRASH_BUTTON = "id:swipe action delete";
        REMOVE_FROM_SAVED_BUTTON = "xpath://h3[(text()='{TITLE}')]/../../a[@class='mw-ui-icon mw-ui-icon-wikimedia-unStar-progressive mw-ui-icon-element   watch-this-article watched']";
    }
    public MWMyListsPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
