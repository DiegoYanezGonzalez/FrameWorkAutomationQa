package automationFrame.testCreation.parisEcommerce.pages;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class CarritoCompraPageParis extends SeleniumBase {


    public CarritoCompraPageParis(WebDriver driver) {
        super(driver);
    }



    //TestCase01 Locators
    String btnMasCantidadProduct = "//*[@id='GTM_cart_quantity-mas']";
/*
    public void clickAumentarProduct() throws InterruptedException {
        clickElement(btnMasCantidadProduct);
        Thread.sleep(300);clickElement(btnMasCantidadProduct);

    }*/



    //Locators TestCase 03
    String btnAgregarProduct = "//span[text()='Añadir al carro']";
    String btnContinuareAgregarProduct = "//button[text()='Continuar']";
    String btnIrAlCarrito = "//*[@id='mini-cart-link-cart']";
    String fieldCupon = "//*[@id='dwfrm_cart_couponCode']";
    String btnAplicarfieldCupon = "//*[@id='dwfrm_cart_couponCode']";
    String textInvalidCupon = "//div[@class='error coupon-error']";
    String btnAddProduct = "//input[@id=\\\"GTM_cart_quantity-mas\\\"]";



    public void navigateToParis(String string){
        navigateTo(string);
    }

    public void clickInBtnProduct(){
        clickElement(btnAgregarProduct);

    }

    public void clickContinuar(){
        clickElement(btnContinuareAgregarProduct);
    }

    public void clickIrAlCarrito(){
        clickElement(btnIrAlCarrito);
    }

    public void writeCuponInvalid(){
        write(fieldCupon,"123433");
        clickElement(btnAplicarfieldCupon);
    }

    public boolean validateTextErrorCupon(){
        isDisplayed(textInvalidCupon);
        return true;
    }

    public void agregadoDeProducto(Integer num) throws InterruptedException {
        for (int i=0; i<num; i++){
            if (!isDisplayed(btnAddProduct)){
                break;
            }
            //explicitWait(2000);
            clickElement(btnAddProduct);
        }
    }


    //TestCase 03

    String btnEditarGarantia = "//*[contains(@class, 'link-add')]/a";
    String checkElegirGarantia = "//*[contains(@class, 'warranty-modal__form')]/div[2]/ul/li[9]/label/p/i";

    public void agregarGarantia(){
        clickElement(btnEditarGarantia);
        clickElement(checkElegirGarantia);
    }

}
