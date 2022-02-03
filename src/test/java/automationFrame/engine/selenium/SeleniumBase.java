package automationFrame.engine.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Set;

public class SeleniumBase {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    public SeleniumBase(WebDriver driver) {
        SeleniumBase.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }


    //navigate to page
    public static void navigateTo(String url) {
        driver.get(url);
    }


    //clean browser
    public static void cleanBrowser() {
        driver.quit();
    }


    //find element with condition expected visibility of element
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    //click in element
    public void clickElement(String locator) {

        Find(locator).click();
    }


    //write in field with condition of key ESCAPE after write
    public void writeTextWithEscape(String locator, String textWrite) throws InterruptedException {
        Find(locator).clear();
        Find(locator).sendKeys(textWrite);
        Thread.sleep(200);
        Find(locator).sendKeys(Keys.ESCAPE);
    }


    //write in field
    public void write(String locator, String textWrite) {
        Find(locator).clear();
        Find(locator).sendKeys(textWrite);
    }

    //write with enter
    public void writeWithEnter(String locator, String textWrite) {
        Find(locator).clear();
        Find(locator).sendKeys(textWrite);
        Find(locator).sendKeys(Keys.ENTER);
    }


    //dropdowon selection for value
    public void selectFromDropdownByValue(String locator, String valueToSelect) {
        Select dropdown = new Select(Find(locator));


        dropdown.selectByValue(valueToSelect);


    }

    public void validationText(String localizator, String text) {
        Assert.assertEquals(text, Find(localizator).getText());
    }


    public void selectFromDropdownByIndex(String locator, int valueToSelect) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByIndex(valueToSelect);
    }

    public void selectFromDropdownByText(String locator, String valueToSelect) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByVisibleText(valueToSelect);
    }


    //get the text of some element
    public String textFromElement(String locator) {
        return Find(locator).getText();
    }


    //change focus tabs page
    public void SwitchTabs() {
        String mainTab = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {
            if (!actual.equalsIgnoreCase(mainTab)) {
                driver.switchTo().window(actual);
            }
        }
    }


    //get list of result of element
    public List<WebElement> bringMeAllElements(String locator) {

        return driver.findElements(By.xpath(locator));
    }


    //get title of some element
    public String getTitle() {
        return driver.getTitle();
    }




    public boolean elementIsDisplayed(String locator) {
        return Find(locator).isDisplayed();


    }

    public boolean elementIsNotDisplayed(String locator) {

        return Find(locator).isDisplayed();

    }

<<<<<<< HEAD
=======

    //Wrappers Selenium

    /**
     * funcion wrapper para obtener un WebElement
     *
     * @param locator: Objeto By de la Page
     * @return WebElement
     */
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    /**
     * funcion wrapper para obtener una Lista de WebElement
     *
     * @param locator: Objeto By de la Page
     * @return Lista de WebElement
     */
    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    /**
     * funcion que obtiene el texto de un objeto WebElement
     *
     * @param locator: Objeto By del repositorio
     * @return String     *
     */
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public String getText(WebElement element){
        return element.getText();
    }

    /**
     * funcion que escribe un texto enviado a un objeto WebElement
     *
     * @param inputText : texto a escribir
     * @param locator   : Objeto By del repositorio
     */
    public void type(String inputText, By locator) throws InterruptedException {
        driver.findElement(locator).sendKeys(inputText);
    }

    public void sendEnter(By locator){
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    /**
     * funcion que hace 1 click en un WebElement
     *
     * @param locator : Objeto By del repositorio
     */

    public void click(String locator){
        WebDriverWait espera = new WebDriverWait(driver, 2);
        espera.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        driver.findElement(By.xpath(locator)).click();
    }

    /**
     * funcion que cierra el Objeto WebDriver
     */
    public void closeDriver() {
        driver.close();
    }

    /**
     * funcion para saber si un WebElement esta desplegado en pantalla
     *
     * @param locator : Objeto By del repositorio
     * @return : verdadero o falso
     */
    public Boolean isDisplayed(String locator) {
        try {
            return driver.findElement(By.xpath(locator)).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    /**
     * funcion para Navegar a un URL
     *
     * @param url : String con URL
     */
    public void goToUrl(String url) {
        driver.get(url);
    }



    public void validacionText(By localizador, String text){
        Assert.assertEquals(text, driver.findElement(localizador).getText());
    }



    //Espera explicita hasta elemento visible
    public void esperarElementoVisible (int tiempo,By localizador){
        WebDriverWait espera = new WebDriverWait(driver,tiempo);
        espera.until(ExpectedConditions.visibilityOfElementLocated(localizador));
    }

>>>>>>> e183745ebe0c9a7f9c8dc19dba486ccf401c4f0c
}