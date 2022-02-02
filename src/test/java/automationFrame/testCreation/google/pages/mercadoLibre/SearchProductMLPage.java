package automationFrame.testCreation.google.pages.mercadoLibre;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class SearchProductMLPage extends SeleniumBase {


    public SearchProductMLPage(WebDriver driver) {
        super(driver);
    }

    private String searchProductTextField = "//*[@id='cb1-edit']";



    public void enterSearchCriteria(String product) throws InterruptedException {
        write(searchProductTextField,product);

    }


}
