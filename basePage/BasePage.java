package basePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.ElementsPage;
import pages.ExcelReader;
import pages.HomePage;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public String homeURL;
    public HomePage homePage;
    public ElementsPage elementsPage;
    public ExcelReader excelReader;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("/home/jovan/Documents/DemoQA/ToolsQA.xlsx");
        homePage = new HomePage(driver, wdwait);
        elementsPage = new ElementsPage(driver, wdwait);
        homeURL = excelReader.getStringData("Home", 1, 0);

    }

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);


    }

    public void scroll(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    @AfterClass
    public void teardown() {
        driver.close();
        driver.quit();
    }

}
