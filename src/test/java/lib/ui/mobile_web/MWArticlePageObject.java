package lib.ui.mobile_web;

import lib.ui.ArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWArticlePageObject extends ArticlePageObject {
    static {
        TITLE_ID = "css:#content h1";
        OPTIONS_ADD_TO_MY_LIST_BUTTON_ID = "xpath://a[@data-event-name='menu.watch']|//a[@title='Add this page to your watchlist']|//a[@title='Watch']";  //a[@title='Add this page to your watchlist']   //a[@title='Watch']
        CLOSE_ARTICLE_BUTTON = "id:Back";
        FOLDER_NAME_TPL = "xpath://*[@text='{SUBSTRING}']";
        FOOTER_ELEMENT = "id:View article in browser";
        OPTIONS_REMOVE_FROM_MY_LIST_BUTTON = "xpath://a[@title='Unwatch']";
    }

    public MWArticlePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
