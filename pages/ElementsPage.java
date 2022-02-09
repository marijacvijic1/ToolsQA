package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement upwardsArrow;
    public WebElement TextBox;
    public WebElement fullname;
    public WebElement submitButton;
    public WebElement email;
    public WebElement TextBox1;
    public WebElement CurrentAddress;
    public WebElement PermanentAddress;
    public WebElement fullname1;
    public WebElement CheckBox;
    public WebElement CheckBox1;
    public WebElement CheckBoxSquare;
    public WebElement Message;
    public WebElement plusbutton;
    public WebElement DesktopCheckBox;
    public WebElement DocumentsCheckBox;
    public WebElement Message1;
    public WebElement DownloadsCheckBox;
    public WebElement Message2;
    public WebElement RadioButton;
    public WebElement RadioButtonPage;
    public WebElement YesRadioButton;
    public WebElement Message3;
    public WebElement NoRadioButton;
    public WebElement Message4;
    public WebElement ImpressiveRadioButton;
    public WebElement WebTables;
    public WebElement WebTablesPage;
    public WebElement AddButton;
    public WebElement UserForm;
    public WebElement FirstName;
    public WebElement LastName;
    public WebElement emailfield;
    public WebElement Age;
    public WebElement salary;
    public WebElement department;
    public WebElement submitButton1;
    public WebElement NewRow;


    public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUpwardsArrow() {
        return driver.findElement(By.className("icon"));
    }

    public void clickUpwardsArrow() {
        this.getUpwardsArrow().click();
    }

    public WebElement getElementtitle() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(1) > span > div"));
    }

    public void clickElementtitle() {
        this.getElementtitle().click();
    }

    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));
    }

    public void clickTextBox() {
        this.getTextBox().click();
    }

    public WebElement getTextBox1() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]"));
    }

    public WebElement getFullname() {
        return driver.findElement(By.id("userName"));
    }

    public void clickfullName() {
        this.getTextBox().click();
    }


    public void insertfullName(String fullName) {
        this.getFullname().clear();
        this.getFullname().sendKeys(fullName);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public void clickSubmit() {
        this.getSubmitButton().click();
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public void clickEmail() {
        this.getEmail().click();
    }

    public void insertEmail(String email) {
        this.getEmail().clear();
        this.getEmail().sendKeys(email);
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public void clickCurrentAddress() {
        this.getCurrentAddress().click();
    }

    public void insertCurrentAddress(String currentaddress) {
        this.getCurrentAddress().clear();
        this.getCurrentAddress().sendKeys(currentaddress);
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress-wrapper"));
    }

    public void clickPermanentAddress() {
        this.getPermanentAddress().click();
    }

    public void insertPermanentAddress(String permanentaddress) {
        this.getPermanentAddress().clear();
        this.getPermanentAddress().sendKeys(permanentaddress);
    }

    public String getfullname1() {
        return driver.findElement(By.id("userName")).getText();
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("item-1"));
    }

    public void clickCheckBox() {
        this.getCheckBox().click();
    }

    public WebElement getCheckBox1() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]"));
    }

    public WebElement getCheckBoxSquare() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/span/label/span[1]"));
    }

    public void clickCheckBoxSquare() {
        this.getCheckBoxSquare().click();
    }

    public WebElement getMessage() {
        return driver.findElement(By.id("result"));
    }

    public String actualMessage() {
        return getMessage().getText();
    }

    public WebElement getPlusbutton() {
        return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
    }

    public void clickPlusButton() {
        this.getPlusbutton().click();
    }

    public WebElement getDesktopCheckBox() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/ol/li[1]/span/label"));
    }

    public void clickDesktopCheckBox() {
        this.getDesktopCheckBox().click();
    }

    public WebElement getDocumentsCheckBox() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/ol/li[2]/span/label"));
    }

    public void clickDocumentsCheckBox() {
        this.getDocumentsCheckBox().click();
    }

    public WebElement getMessage1() {
        return driver.findElement(By.id("result"));
    }

    public String actualMessage1() {
        return getMessage1().getText();
    }

    public WebElement getDownloadsCheckBox() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/ol/li[3]/span/label/span[3]"));
    }

    public void clickDownloadsCheckBox() {
        this.getDownloadsCheckBox().click();
    }

    public WebElement getMessage2() {
        return driver.findElement(By.cssSelector("#result"));
    }

    public String actualMessage2() {
        return getMessage2().getText();
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.id("item-2"));
    }

    public void clickRadioButton() {
        this.getRadioButton().click();
    }

    public WebElement getRadioButtonPage() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]"));
    }

    public WebElement getYesRadioButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]"));
    }

    public void clickYesRadioButton() {
        this.getYesRadioButton().click();
    }

    public WebElement getMessage3() {
        return driver.findElement(By.id("result"));
    }

    public String actualMessage3() {
        return getMessage1().getText();
    }

    public WebElement getNoRadioButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[4]"));
    }

    public void clickNoRadioButton() {
        this.getNoRadioButton().click();
    }

    public WebElement getImpressiveRadioButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
    }

    public void clickImpressiveRadioButton() {
        this.getImpressiveRadioButton().click();
    }

    public WebElement getMessage4() {
        return driver.findElement(By.id("result"));
    }

    public String actualMessage4() {
        return getMessage4().getText();
    }

    public WebElement getWebTables() {
        return driver.findElement(By.id("item-3"));
    }

    public void clickWebTables() {
        this.getWebTables().click();
    }

    public WebElement getWebTablesPage() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]"));
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public void clickAddButton() {
        this.getAddButton().click();
    }

    public WebElement getUserForm() {
        return driver.findElement(By.id("userForm"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public void clickFirstName() {
        this.getFirstName().click();
    }

    public void insertFirstName(String firstname) {
        this.getFirstName().clear();
        this.getFirstName().sendKeys(firstname);
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public void clickLastName() {
        this.getLastName().click();
    }

    public void insertLastName(String lastname) {
        this.getLastName().clear();
        this.getLastName().sendKeys(lastname);
    }

    public WebElement getEmailfield() {
        return driver.findElement(By.id("userEmail"));
    }

    public void clickEmailfield() {
        this.getEmailfield().click();
    }

    public void insertEmailfield(String email) {
        this.getEmailfield().clear();
        this.getEmailfield().sendKeys(email);
    }

    public WebElement getAge() {
        return driver.findElement(By.id("age"));
    }

    public void clickAgeField() {
        this.getAge().click();
    }

    public void insertAge(String age) {
        this.getAge().clear();
        this.getAge().sendKeys(age);
    }

    public WebElement getSalary() {
        return driver.findElement(By.id("salary"));
    }

    public void clickSalaryField() {
        this.getSalary().click();
    }

    public void insertSalary(String salary) {
        this.getSalary().clear();
        this.getSalary().sendKeys(salary);
    }

    public WebElement getDepartment() {
        return driver.findElement(By.id("department"));
    }

    public void ClickDepartmentField() {
        this.getDepartment().click();
    }

    public void insertDepartment(String department) {
        this.getDepartment().clear();
        this.getDepartment().sendKeys(department);
    }

    public WebElement getSubmitButton1() {
        return driver.findElement(By.id("submit"));
    }

    public void clickSubmitButton1() {
        this.getSubmitButton1().click();
    }

    public WebElement getNewRow() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div"));
    }
}