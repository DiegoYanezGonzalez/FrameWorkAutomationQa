package automationFrame.testCreation.farmacia.pages;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoDeCompraPage extends SeleniumBase {

    String btnAgregarProduct = "//html/body/div[2]/main/div[2]/div/div[4]/div[2]/ol/li/div/div[2]/div[2]/div/div/form/button";
    String btnCantidadCarrito = "//*[contains(@class, 'showcart')]//*[contains(@class, 'navbar-tool-icon-box')]";
    String btnVerCarrito = "//*[@id='top-cart-btn-checkout']";

    public CarritoDeCompraPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToFarmacia(String string){

        navigateTo(string);
    }

    public void clickInBtnProduct(){

        clickElement(btnAgregarProduct);
    }

    public void validarCargaEnCarrito() throws Exception {
        if(!elementIsDisplayed(btnCantidadCarrito)) {
            throw new Exception("Elemento no Encontrado");
        }
        clickElement(btnCantidadCarrito);
    }

    public void validarDespliegueCarritoCompraWeb() throws InterruptedException {

        clickElement(btnVerCarrito);
    }
}
