package automationFrame.testCreation.google.pages.mercadoLibre;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class ComprarAhoraButtonPage extends SeleniumBase {

    private String comprarButton = "//*[contains(@class, 'ui-pdp-actions__container')]//span[text()='Comprar ahora']";


    public ComprarAhoraButtonPage(WebDriver driver) {
        super(driver);
    }


    public void clickProductComprar(){
        clickElement(comprarButton);
    }

}
