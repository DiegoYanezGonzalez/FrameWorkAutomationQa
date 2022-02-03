package automationFrame.testCreation.google.pages.google;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class TellotecPages extends SeleniumBase {


    //Atraibutos o Localizaodres
    private String searchTextField = "//*[@name='s']";
    private String searchButton = "//*[@id='ui-id-2']";
    private String searchResults = "//div[@class=\"g\"]//h3/a";
    private String firtsResults = "//*[contains(@class, 'product-container')]/div[2]";

    public TellotecPages(WebDriver driver) {
        super(driver);
    }

    // Metodos KeywordDriven


    public void navigateToTellotec(){

        navigateTo("https://www.tellotec.cl");
    }


    public void enterSearchCriteria(String repuesto) throws InterruptedException {
        writeTextWithEscape(searchTextField,repuesto);

    }

    public void clickTellotecSearch(){

        clickElement(searchButton);
    }

    public String validateTextCart(){

        return textFromElement(firtsResults);
    }

    public void validation(String inputText){
        String result = getTitle();
        Assert.assertTrue(result.contains(inputText));
    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringFromList = new ArrayList<String>();
        for(WebElement e : list){
            stringFromList.add(e.getText());
        }

        return stringFromList;

    }
}
