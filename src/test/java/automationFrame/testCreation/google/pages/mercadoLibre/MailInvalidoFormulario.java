package automationFrame.testCreation.google.pages.mercadoLibre;

import automationFrame.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;

public class MailInvalidoFormulario extends SeleniumBase {

    private String nombreText = "//*[@id='firstName']";
    private String apellidoText = "//*[@id='lastName']";
    private String mailText = "//*[@id='email']";
    private String contrasenaText = "//*[@id='password']";
    private String checkAccept = "//*[@id=\"tyc_checkbox\"]";
    private String btnContinuar = "//*[contains(@class, 'andes-button')]";
    private String textError = "//span[contains(text(), 'Usa el formato nombre@ejemplo.com')]";

    public MailInvalidoFormulario(WebDriver driver) {
        super(driver);
    }

    public void nameWriteInField(String name) {
        write(nombreText,name);
    }

    public void apellidoWriteInField(String apellido) {
        write(apellidoText,apellido);
    }

    public void mailWriteInField(String mail) {
        write(mailText,mail);
    }

    public void contrasenaWriteInField(String pass) {
        write(contrasenaText,pass);
    }

    public void clickCheckAccepted(){
        clickElement(checkAccept);
    }

    public void clickContinuarFormulario(){
        clickElement(btnContinuar);
    }


   public String validaTextError(){
        return textFromElement(textError);

    }

}
