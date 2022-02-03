package automationFrame.testCreation.google.pages.mercadoLibre;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class ButtonClickSearchProductPage extends SeleniumBase {

    private String searchProductButton = "//*[contains(@class, 'nav-search-btn')]";

    public ButtonClickSearchProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickProductSearch(){
        clickElement(searchProductButton);
    }


}
