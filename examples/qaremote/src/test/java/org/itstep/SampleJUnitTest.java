package org.itstep;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.itstep.pages.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleJUnitTest extends JUnitTestBase {

    private HomePage homepage;

    @Before
    public void initPageObjects() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testHomePageHasAHeader() {
        System.out.println("SampleJUnitTest.testHomePageHasAHeader");
        System.out.println("baseUrl = " + baseUrl);
        driver.get(baseUrl);
        Assert.assertFalse("Selenium Grid Hub v.3.1.0".equals(homepage.header.getText()));
    }

    @Test
    public void testResultQuery() {
        System.out.println("SampleJUnitTest.testResultQuery");
        driver.get("http://google.com");
        homepage.queryItstep("itstep");
        new WebDriverWait(driver, 10).until(
                ExpectedConditions.presenceOfElementLocated(By.id("resultStats"))
        );
        Assert.assertTrue(
                "Не отображается Результатов",
                homepage.resultStats.getText().contains("Результатов: примерно")
        );
    }
}
