package automationFrame.testCreation.google.steps.mercadoLibre;

import automationFrame.engine.selenium.DriverFactory;
import automationFrame.testCreation.google.pages.mercadoLibre.*;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class mercadoLibreStepsMsgErrorMail {

    protected HomeMLPage homeMLPage;
    protected SearchProductMLPage searchProduct;
    protected ButtonClickSearchProductPage buttonsearchProduct;
    protected ElejirMarcaMLPage marcaProductClick;
    protected PrimeraOpcionResultadoPage primeraOpcion;
    protected ComprarAhoraButtonPage comprar;
    protected RegistroSoyNuevoPage soyNuevoClick;
    protected MailInvalidoFormulario mailInvalido;

    @Given("cuando estoy en la pagina de MercadoLibre")
    public void cuando_estoy_en_la_pagina_de_mercado_libre() {
        homeMLPage = new HomeMLPage(DriverFactory.getDriver());
        homeMLPage.navigateToMercadoLibreHome();
        homeMLPage.cookiesAcceptep();
    }

    @When("agrego un {string} al campo de texto")
    public void agrego_un_al_campo_de_texto(String product) throws InterruptedException {
        searchProduct = new SearchProductMLPage(DriverFactory.getDriver());
        searchProduct.enterSearchCriteria(product);
    }

    @And("doi click en el boton buscar")
    public void doi_click_en_el_boton_buscar() {
        buttonsearchProduct = new ButtonClickSearchProductPage(DriverFactory.getDriver());
        buttonsearchProduct.clickProductSearch();
    }

    @And("selecciono marca Hp")
    public void selecciono_marca_hp() {
        marcaProductClick = new ElejirMarcaMLPage(DriverFactory.getDriver());
        marcaProductClick.clickProductMarca();
    }

    @And("selecciono la primera opcion de los resultados")
    public void selecciono_la_primera_opcion_de_los_resultados() {
        primeraOpcion = new PrimeraOpcionResultadoPage(DriverFactory.getDriver());
        primeraOpcion.clickPrimerResultado();
    }

    @And("selecciono el boton comprar ahora")
    public void selecciono_el_boton_comprar_ahora() {
        comprar = new ComprarAhoraButtonPage(DriverFactory.getDriver());
        comprar.clickProductComprar();
    }

    @And("click en opcion Soy Nuevo")
    public void click_en_opcion_soy_nuevo() {
            soyNuevoClick = new RegistroSoyNuevoPage(DriverFactory.getDriver());
            soyNuevoClick.clickSoyNuevo();
    }

    @And("al agregar el {string} el {string} el {string} invalido y el {string}")
    public void al_agregar_el_mail_invalido_se_muestra_un_mensaje_error(String user, String apellido, String mail, String pass) throws InterruptedException {
            mailInvalido = new MailInvalidoFormulario(DriverFactory.getDriver());

            Thread.sleep(3000);
            mailInvalido.nameWriteInField(user);

            mailInvalido.apellidoWriteInField(apellido);

            mailInvalido.mailWriteInField(mail);

            mailInvalido.contrasenaWriteInField(pass);

            mailInvalido.clickCheckAccepted();

            mailInvalido.clickContinuarFormulario();
    }

    @Then("se muestra un mensaje error")
    public void se_muestra_un_mensaje_error() {
        Assert.assertEquals("Usa el formato nombre@ejemplo.com",mailInvalido.validaTextError());

    }

}
