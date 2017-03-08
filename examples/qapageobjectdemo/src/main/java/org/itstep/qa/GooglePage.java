package org.itstep.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage extends Page {

    @FindBy(how = How.NAME, using = "q")
    WebElement q;

    @FindBy(id="resultStats")
    WebElement resultStats;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    String baseUrl;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public String query(String text) {
        driver.get(baseUrl);
        //q = driver.findElement(By.name("q"));
        q.sendKeys(text);
        q.submit();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
        //resultStats = driver.findElement(By.id("resultStats"));
        return  resultStats.getText();
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //GooglePage googlePage = new GooglePage(driver);
        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);
        googlePage.setBaseUrl("http://google.com");
        String expected = "Результатов: примерно";
        String actual = googlePage.query("selenium");
        System.out.println(actual.contains(expected));
        driver.quit();
    }
}
