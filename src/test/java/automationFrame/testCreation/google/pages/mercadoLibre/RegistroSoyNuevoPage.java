package automationFrame.testCreation.google.pages.mercadoLibre;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class RegistroSoyNuevoPage extends SeleniumBase {

    private String soyNuevoButton = "//*[@id='registration-link']";

    public RegistroSoyNuevoPage(WebDriver driver) {
        super(driver);
    }

    public void clickSoyNuevo(){
        clickElement(soyNuevoButton);
    }




}
