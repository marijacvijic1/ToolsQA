package testPages;

import basePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ElementsPageTest extends BasePage {

    @Test
    public void VerifyThatElementsTitleFromDropDownListIsClickable() {
        homePage.clickElementslogo();
        elementsPage.clickElementtitle();
    }


    @Test
    public void VerifyThatUpwardsArrowMinimizesAndExpandsTheElementsOfTheDropDownListWithTheTitleElements() {
        homePage.clickElementslogo();
        wdwait.until(visibilityOf(elementsPage.getUpwardsArrow()));
        elementsPage.clickUpwardsArrow();
    }

    @Test
    public void VerifyThatTextBoxElementIsClickable() throws InterruptedException {
        homePage.clickElementslogo();
        elementsPage.clickTextBox();
        Assert.assertEquals(true, elementsPage.getTextBox1().isDisplayed());
        Assert.assertTrue(true, elementsPage.getfullname1());
        Thread.sleep(5000);
    }

    @Test
    public void VerifyThatThatTheSiteSubmitValidFullName() throws InterruptedException {
        homePage.clickElementslogo();
        elementsPage.clickTextBox();
        elementsPage.clickfullName();
        String fullName = excelReader.getStringData("Elements", 1, 0);
        elementsPage.insertfullName(fullName);
        Thread.sleep(2000);
        elementsPage.clickSubmit();


    }

    @Test
    public void VerifyThatThatTheSiteSubmitValidEmail() {
        homePage.clickElementslogo();
        elementsPage.clickTextBox();
        elementsPage.clickEmail();
        String email = excelReader.getStringData("Elements", 1, 1);
        elementsPage.insertEmail(email);
        elementsPage.clickSubmit();
    }

    @Test
    public void VerifyThatThatTheSiteSubmitValidCurrentAddress() {
        homePage.clickElementslogo();
        elementsPage.clickTextBox();
        elementsPage.clickCurrentAddress();
        String currentaddress = excelReader.getStringData("Elements", 1, 2);
        elementsPage.insertCurrentAddress(currentaddress);
        elementsPage.clickSubmit();
    }

    @Test
    public void VerifyThatTheSiteSubmitValidPermanentAddress() {
        homePage.clickElementslogo();
        elementsPage.clickTextBox();
        elementsPage.clickPermanentAddress();
        String permanentaddress = excelReader.getStringData("Elements", 1, 3);
        elementsPage.insertPermanentAddress(permanentaddress);
        elementsPage.clickSubmit();
    }

    @Test
    public void VerifyThatTheInvalidEmailIsNotAccepted() {
        homePage.clickElementslogo();
        elementsPage.clickTextBox();
        elementsPage.clickEmail();
        String email = excelReader.getStringData("Elements", 2, 1);
        elementsPage.insertEmail(email);
        elementsPage.clickSubmit();
    }

    @Test
    public void VerifyThatTheBarsRemainUnfilled() {
        homePage.clickElementslogo();
        elementsPage.clickTextBox();
        elementsPage.clickSubmit();
    }

    @Test
    public void CheckingIfTheInputIsCachedByReturningOnThePreviousPage() throws InterruptedException {
        homePage.clickElementslogo();
        elementsPage.clickTextBox();
        elementsPage.clickfullName();
        String fullName = excelReader.getStringData("Elements", 1, 0);
        elementsPage.insertfullName(fullName);
        Thread.sleep(2000);
        driver.navigate().to("https://demoqa.com/elements");
        homePage.clickElementslogo();
        elementsPage.clickTextBox();
    }

    @Test
    public void VerifyThatElementCheckBoxFromTheElementDropDownListIsClickable() {
        homePage.clickElementslogo();
        elementsPage.clickCheckBox();
        Assert.assertEquals(true, elementsPage.getCheckBox1().isDisplayed());
    }

    @Test
    public void VerifyThatCheckBoxSquareIsClickable() throws InterruptedException {
        homePage.clickElementslogo();
        elementsPage.clickCheckBox();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getCheckBoxSquare()));
        elementsPage.clickCheckBoxSquare();
        String actualMessage = elementsPage.actualMessage();
        String expectedMessage = excelReader.getStringData("Elements", 1, 0);

        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertTrue(elementsPage.getMessage().isDisplayed());
    }

    @Test
    public void VerifyThatPlusButtonIsClickable() {
        homePage.clickElementslogo();
        elementsPage.clickCheckBox();
        elementsPage.clickPlusButton();
    }

    @Test
    public void VerifyThatWhenTheCheckboxOfDesktopElementIsClickedAllCheckBoxesNextToChildElementsFromThatParentBecomesChecked() throws InterruptedException {
        homePage.clickElementslogo();
        elementsPage.clickCheckBox();
        elementsPage.clickPlusButton();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getDesktopCheckBox()));
        elementsPage.clickDesktopCheckBox();
        String actualMessage = elementsPage.actualMessage();
        String expectedMessage = excelReader.getStringData("Messages", 1, 0);
        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertTrue(elementsPage.getMessage().isDisplayed());
    }

    @Test
    public void VerifyThatWhenTheCheckboxOfDocumentsElementIsClickedAllCheckBoxesNextToChildElementsFromThatParentBecomesChecked() {
        homePage.clickElementslogo();
        elementsPage.clickCheckBox();
        elementsPage.clickPlusButton();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getDocumentsCheckBox()));
        elementsPage.clickDocumentsCheckBox();
        String actualMessage = elementsPage.actualMessage1();
        String expectedMessage = excelReader.getStringData("Messages", 1, 1);
        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertTrue(elementsPage.getMessage1().isDisplayed());
    }

    @Test
    public void VerifyThatWhenTheCheckboxOfDownloadsElementIsClickedAllCheckBoxesNextToChildElementsFromThatParentBecomesChecked() {
        homePage.clickElementslogo();
        elementsPage.clickCheckBox();
        elementsPage.clickPlusButton();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getDownloadsCheckBox()));
        elementsPage.clickDownloadsCheckBox();
        String actualMessage = elementsPage.actualMessage2();
        String expectedMessage = excelReader.getStringData("Messages", 1, 2);
        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertTrue(elementsPage.getMessage2().isDisplayed());
    }

    @Test
    public void VerifyThatRadioButtonFromTheElementDropDownListIsClickable() {
        homePage.clickElementslogo();
        elementsPage.clickRadioButton();
        Assert.assertEquals(true, elementsPage.getRadioButtonPage().isDisplayed());
    }

    @Test
    public void VerifyThatYesRadioButtonIsClickable() throws InterruptedException {
        homePage.clickElementslogo();
        elementsPage.clickRadioButton();
        Thread.sleep(2000);
        elementsPage.clickYesRadioButton();
        String actualMessage = elementsPage.actualMessage3();
        String expectedMessage = excelReader.getStringData("Messages", 1, 3);
        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertTrue(elementsPage.getMessage3().isDisplayed());
    }

    @Test
    public void VerifyThatNoRadioButtonIsClickable() throws InterruptedException {
        homePage.clickElementslogo();
        elementsPage.clickRadioButton();
        Thread.sleep(2000);
        elementsPage.clickNoRadioButton();
    }

    @Test
    public void VerifyThatImpressiveRadioButtonIsClickable() throws InterruptedException {
        homePage.clickElementslogo();
        elementsPage.clickRadioButton();
        Thread.sleep(2000);
        elementsPage.clickImpressiveRadioButton();
        String actualMessage = elementsPage.actualMessage4();
        String expectedMessage = excelReader.getStringData("Messages", 1, 4);
        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertTrue(elementsPage.getMessage4().isDisplayed());
    }

    @Test
    public void VerifyThatWebTablesFromTheElementDropDownListIsClickable() {
        homePage.clickElementslogo();
        elementsPage.clickWebTables();
        Assert.assertEquals(true, elementsPage.getWebTablesPage().isDisplayed());
    }

    @Test
    public void VerifyThatAddButtonIsClickable() {
        homePage.clickElementslogo();
        elementsPage.clickWebTables();
        elementsPage.clickAddButton();
        Assert.assertEquals(true, elementsPage.getUserForm().isDisplayed());
    }

    @Test
    public void VerifyThatAllInformationsAreSavedInTableWhenYouClickSubmitButton() throws InterruptedException {
        homePage.clickElementslogo();
        elementsPage.clickWebTables();
        elementsPage.clickAddButton();
        elementsPage.clickFirstName();
        String firstname = excelReader.getStringData("Elements", 1, 4);
        elementsPage.insertFirstName(firstname);
        Thread.sleep(1000);
        elementsPage.clickLastName();
        String lastname = excelReader.getStringData("Elements", 1, 5);
        elementsPage.insertLastName(lastname);
        Thread.sleep(1000);
        elementsPage.clickEmailfield();
        String email = excelReader.getStringData("Elements", 1, 6);
        elementsPage.insertEmailfield(email);
        Thread.sleep(1000);
        elementsPage.clickAgeField();
        String age = excelReader.getStringData("Elements", 1, 7);
        elementsPage.insertAge(age);
        Thread.sleep(1000);
        elementsPage.clickSalaryField();
        String salary = excelReader.getStringData("Elements", 1, 8);
        elementsPage.insertSalary(salary);
        Thread.sleep(1000);
        elementsPage.ClickDepartmentField();
        String department = excelReader.getStringData("Elements", 1, 9);
        elementsPage.insertDepartment(department);
        Thread.sleep(1000);
        elementsPage.clickSubmitButton1();
        Assert.assertEquals(true, elementsPage.getNewRow().isDisplayed());
    }

}