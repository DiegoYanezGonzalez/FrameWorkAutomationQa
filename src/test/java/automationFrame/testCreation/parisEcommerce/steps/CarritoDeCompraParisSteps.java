package automationFrame.testCreation.parisEcommerce.steps;

import automationFrame.engine.selenium.DriverFactory;
import automationFrame.testCreation.farmacia.pages.CarritoDeCompraPage;
import automationFrame.testCreation.parisEcommerce.pages.CarritoCompraPageParis;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CarritoDeCompraParisSteps {

    CarritoCompraPageParis pageParis = new CarritoCompraPageParis(DriverFactory.getDriver());

    @Given("que estoy en la url {string}")
    public void que_estoy_en_la_url(String string) {
        pageParis.navigateToParis(string);
    }

    @When("agrego al carrito")
    public void agrego_al_carrito() {
        pageParis.clickInBtnProduct();
    }

    @And("click en continuar")
    public void click_en_continuar() {
        pageParis.clickContinuar();
    }

    @And("click en ir al carrito")
    public void click_en_ir_al_carrito() {
        pageParis.clickIrAlCarrito();
    }

    @When("el cliente introduce un número de cupón inválido y hace clic en el botón aplicar")
    public void el_cliente_introduce_un_número_de_cupón_inválido_y_hace_clic_en_el_botón() {
        pageParis.writeCuponInvalid();
    }


    @Then("se muestra un mensaje de error cerca del campo que dice Código de Cupón Inválido")
    public void se_muestra_un_mensaje_de_error_cerca_del_campo_que_dice_código_de_cupón_inválido() {
        Assert.assertTrue(pageParis.validateTextErrorCupon());
        Assert.assertEquals( "Código de cupón inválido",pageParis.textInvalid());
    }


    @Then("el cliente aumenta la cantidad a pedir del producto haciendo click en el botón mas del producto a un número mayor de {int}")
    public void el_cliente_aumenta_la_cantidad_a_pedir_del_producto_haciendo_click_en_el_botón_del_producto_a_un_número_mayor_de(Integer int1) throws InterruptedException {
        pageParis.agregadoDeProducto(int1);
    }

    @When("el botón mas se deshabilita.")
    public void el_botón_mas_se_deshabilita() {
        Assert.assertFalse(pageParis.isDisplayed("//input[(@disabled)]"));
    }

    //TestCase 02 garantiaExtendida suma
    @When("el cliente agrega la garantia de daño accidental")
    public void el_cliente_agrega_la_garantia_de_daño_accidental() {
        pageParis.agregarGarantia();
    }

    @Then("el total a pagar incluye el monto a pagar del producto mas el valor de la garantía del producto")
    public void el_total_a_pagar_incluye_el_monto_a_pagar_del_producto_mas_el_valor_de_la_garantía_del_producto() {
        //pageParis.validarSumaProductoMasGarantia();
        Assert.assertEquals("$549.990",pageParis.validarSumaProductoMasGarantia());
    }
}
