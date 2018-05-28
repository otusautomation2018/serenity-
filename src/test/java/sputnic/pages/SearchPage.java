package sputnic.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.sputnik.ru")
public class SearchPage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade searchInput;

    @FindBy(css = "button[type='submit']")
    WebElementFacade searchBtn;

    public void search(String query){
        searchInput.type(query);
        searchBtn.click();
    }
}
