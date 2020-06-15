package lib.ui.mobile_web;

import lib.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWSearchPageObject extends SearchPageObject {

    static {
        SEARCH_INIT_ELEMENT = "css:button#searchIcon";
        SEARCH_INPUT = "css:form>input[type='search']";
        SEARCH_CANCEL_BUTTON = "css:div.header-action>button.cancel";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://div[(@class='wikidata-description' and contains(text(),'{SUBSTRING}'))]";
        SEARCH_RESULT_ELEMENTS = "css:ul.page-list>li.page-summary";
        SEARCH_RESULT_ID = "id:org.wikipedia:id/page_list_item_title";
        //SEARCH_RESULTS_TITLE_AND_DESCRIPTION_COMPARISION_TPL = "xpath://ancestor::*[*[//XCUIElementTypeStaticText and contains(@name, '{TITLE}')] and *[//XCUIElementTypeStaticText and contains(@name, '{DESCRIPTION}')]]";
        SEARCH_RESULTS_TITLE_AND_DESCRIPTION_COMPARISION_TPL = "xpath://ancestor::*[*[(@class='wikidata-description' and contains(text(),'{DESCRIPTION}'))] and *[//h3[contains(text(),'Hitler')]]]";
    }

    public MWSearchPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
