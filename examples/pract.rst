############################
Selenium Practice Excercises
############################

***************************
Browser Navigation Commands
***************************

.. _NavigatePrcactice:  http://toolsqa.wpengine.com/selenium-webdriver/browser-navigation-commands/

Practice Exercise
=================

#. Launch new Browser
#. Open http://DemoQA.com website
#. Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374?]/a”)).click();“
#. Come back to Home page (Use ‘Back’ command)
#. Again go back to Registration page (This time use ‘Forward’ command)
#. Again come back to Home page (This time use ‘To’ command)
#. Refresh the Browser (Use ‘Refresh’ command)
#. Close the Browser

**************************
WebDriver Browser Commands
**************************

.. _BrowserCommands: http://toolsqa.wpengine.com/selenium-webdriver/browser-commands/

Practice Exercise 1
===================

#. Launch a new Firefox browser.
#. Open http://Store.DemoQA.com
#. Get Page Title name and Title length
#. Print Page Title and Title length on the Eclipse Console.
#. Get Page URL and verify if the it is a correct page opened
#. Get Page Source (HTML Source code) and Page Source length
#. Print Page Length on Eclipse Console.
#. Close the Browser.

Practice Exercise – 2
=====================

#. Launch a new Firefox browser.
#. Open http://demoqa.com/frames-and-windows/
#. Use this statement to click on a New Window button “driver.findElement(By.xpath(“.//*[@id=’tabs-1?]/div/p/a”)).click();”
#. Close the browser using close() command

*******************
WebElement Commands
*******************

.. _WebElementCommands: http://toolsqa.wpengine.com/selenium-webdriver/webelement-commands/

**********************************
CheckBox & Radio Button Operations
**********************************

.. _CheckAndRadioOperations: http://toolsqa.wpengine.com/selenium-webdriver/checkbox-radio-button-operations/

Practice Exercise
=====================

#. Launch new Browser
#. Open “http://toolsqa.wpengine.com/automation-practice-form/“
#. Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
#. Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
#. Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
#. Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)

*************************************
DropDown & Multiple Select Operations
*************************************

.. _DropDownMultiSelect: http://toolsqa.wpengine.com/selenium-webdriver/dropdown-multiple-select-operations/

Practice Exercise -1 (Drop Down Box/List)
=========================================

#. Launch new Browser
#. Open “http://toolsqa.wpengine.com/automation-practice-form/”
#. Select ‘Continents’ Drop down ( Use Id to identify the element )
#. Select option ‘Europe’ (Use selectByIndex)
#. Select option ‘Africa’ now (Use selectByVisibleText)
#. Print all the options for the selected drop down and select one option of your choice
#. Close the browser

Practice Exercise -2 (Multiple Selection Box/List)
==================================================

#. Launch new Browser
#. Open “http://toolsqa.wpengine.com/automation-practice-form/”
#. Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
#. Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
#. Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
#. Print and select all the options for the selected Multiple selection list.
#. Deselect all options
#. Close the browser