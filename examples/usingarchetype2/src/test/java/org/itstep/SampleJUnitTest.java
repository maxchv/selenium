package org.itstep;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;

import org.itstep.pages.HomePage;

public class SampleJUnitTest extends JUnitTestBase {

  private HomePage homepage;

  @Before
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testGoogleQuery() {
    driver.get(baseUrl);
    Assert.assertTrue(homepage.query("selenium").contains("Результатов:"));
  }
}
