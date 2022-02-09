package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement elementslogo;
    public WebElement actualUrlElements;
    public WebElement elementsTitle;
    public WebElement formslogo;
    public WebElement actualUrlForms;
    public WebElement formsTitle;
    public WebElement AlertsFrameAndWindowsLogo;
    public WebElement AlertsFrameAndWindowsTitle;
    public WebElement ActualUrlAlertsFrameAndWindows;
    public WebElement WidgetsLogo;
    public WebElement WidgetsTitle;
    public WebElement ActualUrlWidgets;
    public WebElement InteractionsLogo;
    public WebElement InteractionsTitle;
    public WebElement ActualUrlInteractions;
    public WebElement BookStoreLogo;
    public WebElement BookStoreTitle;
    public WebElement ActualUrlBookStore;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getElementslogo() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[1]"));
    }

    public void clickElementslogo() {
        this.getElementslogo().click();
    }

    public String getActualUrlElements() {
        return driver.getCurrentUrl();
    }

    public WebElement getElementsTitle() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div"));
    }

    public WebElement getFormslogo() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]"));
    }

    public void clickFormslogo() {
        this.getFormslogo().click();
    }

    public String getActualUrlForms() {
        return driver.getCurrentUrl();
    }

    public WebElement getFormsTitle() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div"));
    }

    public WebElement getAlertsFrameAndWindowsLogo() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]/div/div[1]"));
    }

    public void clickAlertsFrameAndWindowsLogo() {
        this.getAlertsFrameAndWindowsLogo().click();
    }

    public WebElement getAlertsFrameAndWindowsTitle() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div"));
    }

    public String getActualUrlAlertsFrameAndWindows() {
        return driver.getCurrentUrl();
    }

    public WebElement getWidgetsLogo() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[1]"));
    }

    public void clickWidgetsLogo() {
        this.getWidgetsLogo().click();
    }

    public WebElement getWidgetsTitle() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div"));
    }

    public String getActualUrlWidgets() {
        return driver.getCurrentUrl();
    }

    public WebElement getInteractionsLogo() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[5]/div/div[1]"));
    }

    public void clickInteractionsLogo() {
        this.getInteractionsLogo().click();
    }

    public WebElement getInteractionsTitle() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div"));
    }

    public String getActualUrlInteractons() {
        return driver.getCurrentUrl();
    }

    public WebElement getBookStoreLogo() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]/div/div[1]"));
    }

    public void clickBookStoreLogo() {
        this.getBookStoreLogo().click();
    }

    public WebElement getBookStoreTitle() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div"));
    }

    public String getActualUrlBooksStore() {
        return driver.getCurrentUrl();
    }


    public WebElement getNavigation() { // svaka stranica ima element navigacije sa leve strane
        return driver.findElement(By.className("left-pannel"));
    }


}
