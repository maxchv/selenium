package org.itstep;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;

import ru.stqa.selenium.factory.WebDriverPool;

import org.itstep.util.PropertyLoader;

/**
 * Base class for all the JUnit-based test classes
 */
public class JUnitTestBase {

    protected static String gridHubUrl;
    protected static String baseUrl;
    protected static Capabilities capabilities;

    protected WebDriver driver;

    @ClassRule
    public static ExternalResource webDriverProperties = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            baseUrl = PropertyLoader.loadProperty("site.url");
            gridHubUrl = PropertyLoader.loadProperty("grid2.hub");
            baseUrl = PropertyLoader.loadProperty("site.url");
            System.out.println("baseUrl = " + baseUrl);
            gridHubUrl = PropertyLoader.loadProperty("grid.url");

            if ("".equals(gridHubUrl)) {
                gridHubUrl = null;
            }
            System.out.println("gridHubUrl = " + gridHubUrl);
            capabilities = PropertyLoader.loadCapabilities();
            System.out.println("capabilities = " + capabilities);
        }

        ;
    };

    @Rule
    public ExternalResource webDriver = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            driver = WebDriverPool.DEFAULT.getDriver(gridHubUrl, capabilities);
        }

        ;
    };
}
