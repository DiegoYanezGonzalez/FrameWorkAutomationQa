package automationFrame.testCreation.google.pages.mercadoLibre;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class PrimeraOpcionResultadoPage extends SeleniumBase {

    private String eleccionPrimeraOpcion = "//*[contains(@class, 'ui-search-layout')]/li/div/div/div";

    public PrimeraOpcionResultadoPage(WebDriver driver) {
        super(driver);
    }

    public void clickPrimerResultado(){
        clickElement(eleccionPrimeraOpcion);
    }
}
