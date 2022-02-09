package testPages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTest extends BasePage {

    @Test
    public void VerifyThatBrowserNavigateToElementPage() {
        /* proveriti da li kada se, na home page stranici,
         klikne na ELEMENTS dugme ode na elements stranicu*/


        wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".avatar.mx-auto.white")));
        WebElement element = homePage.getElementslogo();
        element.click();
        WebElement text1 = homePage.getElementsTitle();
        text1.getText();
        String naslov = "Elements";
        Assert.assertEquals(text1.getText(), naslov);

        WebElement navigation = homePage.getNavigation();
        Assert.assertNotNull(navigation); // Provera da li je prisutna navigacija
    }


    @Test
    public void VerifyThatElementsLogoIsClickable() {
        homePage.clickElementslogo();
        wdwait.until(ExpectedConditions.visibilityOf(homePage.getElementsTitle()));
        String expectedUrl = "https://demoqa.com/elements";
        Assert.assertEquals(homePage.getActualUrlElements(), expectedUrl);
        WebElement navigation = homePage.getNavigation();
        Assert.assertNotNull(navigation);
    }

    @Test
    public void VerifyThatFormsLogoIsClickable() {
        homePage.clickFormslogo();
        wdwait.until(ExpectedConditions.visibilityOf(homePage.getFormsTitle()));
        String expectedUrl = "https://demoqa.com/forms";
        Assert.assertEquals(homePage.getActualUrlForms(), expectedUrl);
        WebElement navigation = homePage.getNavigation();
        Assert.assertNotNull(navigation);
    }

    @Test
    public void VerifyThatAlertsFrameAndWindowsLogoIsClickable() {
        homePage.clickAlertsFrameAndWindowsLogo();
        wdwait.until(ExpectedConditions.visibilityOf(homePage.getAlertsFrameAndWindowsTitle()));
        String expectedUrl = "https://demoqa.com/alertsWindows";
        Assert.assertEquals(homePage.getActualUrlAlertsFrameAndWindows(), expectedUrl);
        WebElement navigation = homePage.getNavigation();
        Assert.assertNotNull(navigation);
    }

    @Test
    public void VerifyThatWidgetsLogoIsClickable() {
        homePage.clickWidgetsLogo();
        wdwait.until(ExpectedConditions.visibilityOf(homePage.getWidgetsTitle()));
        String expectedUrl = "https://demoqa.com/widgets";
        Assert.assertEquals(homePage.getActualUrlWidgets(), expectedUrl);
        WebElement navigation = homePage.getNavigation();
        Assert.assertNotNull(navigation);
    }

    @Test
    public void VerifyThatWidgetsIsClickable() {
        homePage.clickWidgetsLogo();
        wdwait.until(ExpectedConditions.visibilityOf(homePage.getWidgetsTitle()));
        String expectedUrl = "https://demoqa.com/widgets";
        Assert.assertEquals(homePage.getActualUrlWidgets(), expectedUrl);
        WebElement navigation = homePage.getNavigation();
        Assert.assertNotNull(navigation);
    }

    @Test
    public void VerifyThatInteractionsLogoIsClickable() {
        homePage.clickInteractionsLogo();
        wdwait.until(ExpectedConditions.visibilityOf(homePage.getInteractionsTitle()));
        String expectedUrl = "https://demoqa.com/interaction";
        Assert.assertEquals(homePage.getActualUrlInteractons(), expectedUrl);
        WebElement navigation = homePage.getNavigation();
        Assert.assertNotNull(navigation);
    }

    @Test
    public void VerifyThatBookStoreLogoIsClickable() {
        scroll(homePage.getBookStoreLogo());
        homePage.clickBookStoreLogo();
        wdwait.until(ExpectedConditions.visibilityOf(homePage.getBookStoreTitle()));
        String expectedUrl = "https://demoqa.com/books";
        Assert.assertEquals(homePage.getActualUrlBooksStore(), expectedUrl);
        WebElement navigation = homePage.getNavigation();
        Assert.assertNotNull(navigation);
    }


}


