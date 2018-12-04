package lib.ui.mobile_web;

import lib.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;


public class MWSearchPageObject extends SearchPageObject {
    static {
        SEARCH_INIT_ELEMENT = "css:button#searchIcon";
        SEARCH_INPUT = "css:form>input[type='search']";
        SEARCH_RESULTS_BY_TITLE_AND_SUBSTRING_TPL = "xpath://XCUIElementTypeLink//*[@text='{TITLE}']|//*[@text='{DESCRIPTION}']";
        SEARCH_RESULT_By_SUBSTRING_TPL = "css:.page-list li[title='{SUBSTRING}']";//"xpath://div[contains(@class,'wikidata-description')][contains(text(),'{SUBSTRING}')]";
        SEARCH_CANCEL_BUTTON = "css:button.cancel";
        SEARCH_RESULTS_LOCATOR = "css:ul.page-list>li.page-summary";
        EMPTY_RESULT_LABEL = "css:p.without-results";
        EMPTY_PAGE = "css:div.overlay-content";
        SEARCH_RESULTS = "id:org.wikipedia:id/page_list_item_title";
    }

    public MWSearchPageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
