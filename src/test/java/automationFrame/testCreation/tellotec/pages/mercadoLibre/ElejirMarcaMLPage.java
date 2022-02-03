package automationFrame.testCreation.google.pages.mercadoLibre;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class ElejirMarcaMLPage extends SeleniumBase {

    private String clickMarcaProduct = "//*[contains(@class, 'ui-search-carousel')]//*[contains(@class, 'slick-track')]/div/div/a/div";

    public ElejirMarcaMLPage(WebDriver driver) {
        super(driver);
    }

    public void clickProductMarca(){
        clickElement(clickMarcaProduct);
    }
}
