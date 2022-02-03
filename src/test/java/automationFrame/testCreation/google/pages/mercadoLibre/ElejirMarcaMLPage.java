package automationFrame.testCreation.google.pages.mercadoLibre;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class ElejirMarcaMLPage extends SeleniumBase {


    public ElejirMarcaMLPage(WebDriver driver) {
        super(driver);
    }

    public void clickProductMarca(String marca){
         String clickMarcaProduct = "//img[@alt=\""+marca+"\"]/ancestor::div[contains(@class,\"image-container\")]";

        clickElement(clickMarcaProduct);
    }
}
