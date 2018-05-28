package sputnic.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends PageObject {

    private static final String RESULT_LOCATOR = "//div[@class='b-result js-metrics']";
    public final String NOT_FOUND_TEXT = "По вашему запросу ничего не найдено. " +
            "Пожалуйста, уточните фразу и начните поиск снова.";

    @FindBy(xpath = RESULT_LOCATOR)
    public WebElementFacade resultList;

    public boolean resultListIsDisplayed(){
        resultList.waitUntilVisible();
        return resultList.isDisplayed();
    }

    public int actualNumberOfResults(){
        return resultList.findElements(By.xpath(RESULT_LOCATOR)).size();
    }

    @FindBy(className = "b-query")
    public WebElementFacade notFoundMessage;
}
