package automationFrame.testCreation.google.pages.mercadoLibre;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class HomeMLPage extends SeleniumBase {

    private String buttonCookie = "//button[text()='Entendido']";

    public HomeMLPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToMercadoLibreHome(){

        navigateTo("https://www.mercadolibre.cl");
    }

    public void cookiesAcceptep(){
        clickElement(buttonCookie);
    }
}
