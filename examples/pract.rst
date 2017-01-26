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

Практическое задание
====================

#. Запустить браузер
#. Открыть файл  “automation-practice-form.html“
#. Отметить радио кнопкой пол Female для категории Sex если еще не выбрано и Male в противном случае (испольуйте метод IsSelected)
#. Установить третюю радиокнопку для категории ‘Years of Exp’ (Используйте атрибут Id для выбора радио кнопки)
#. Поставить флажок в чекбоксе ‘Automation Tester’ категории ‘Profession'(Используйте значение атрибута value для выбора элемента)
#. Поставить флажок в чекбоксе ‘Selenium IDE’ категории ‘Automation Tool’ (испольуйте cssSelector)

*************************************
DropDown & Multiple Select Operations
*************************************

.. _DropDownMultiSelect: http://toolsqa.wpengine.com/selenium-webdriver/dropdown-multiple-select-operations/

Практическое задание 1 (Drop Down Box/List)
=========================================

#. Запустить браузер
#. Открыть файл  “automation-practice-form.html“
#. Найдите выподающий список ‘Continents’ (используйте идентификатор элемента)
#. Выбирите опцию ‘Europe’ (используя selectByIndex)
#. Теперь выбирите опцию ‘Africa’ (исползуя selectByVisibleText)
#. Выведите в консоли все возможные опции для выбранного выпадающего списка
#. Закройте браузер

Практическое задание 2 (Multiple Selection Box/List)
==================================================

#. Запустить браузер
#. Открыть файл  “automation-practice-form.html“
#. Найдите элемент списка ‘Selenium Commands’ (используйте атрибут name для идентификации элемента)
#. Выберите опцию ‘Browser Commands’  и отмените ее (исползуя selectByIndex и deselectByIndex)
#. Выберите опцию ‘Navigation Commands’  и отмените ее (используя selectByVisibleText и deselectByVisibleText)
#. Выведите в консоли все опции списка ‘Selenium Commands’.
#. Отмените все опции
#. Закройте браузер

**********************************************
Handle Dynamic WebTables in Selenium Webdriver
**********************************************

.. _Tables: http://toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/

Practice Exercise 1
===================

#. Запустить браузер
#. Открыть файл “automation-practice-table.html”
#. Получить ячейку таблицы со значением ‘Dubai’ и напечатать в консоли
#. Кликнуть по ссылке ‘Detail’ в первой сткроке первой колонки

Practice Exercise 2
===================

#. Запустить браузер
#. Открыть файл “automation-practice-table.html”
#. Получить ячейку таблицы со значением ‘Dubai’ используя динамический поиск
#. Напечатать все значения строки ‘Clock Tower Hotel’

*************
Wait Commands
*************

Practice Exercise
=================

.. _WaitCommands: http://toolsqa.com/selenium-webdriver/wait-commands/

#. Launch new Browser
#. Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
#. Click on the Button “Timing Alert”
#. Accept the Alert (Alert will take 3 second to get displayed, Use WebDriverWait to wait for it)


***************
Switch Commands
***************

.. _SwitchCommands: http://toolsqa.com/selenium-webdriver/switch-commands/

Practice Exercise 1
===================

#. Launch new Browser
#. Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
#. Get Window name (Use GetWindowHandle command)
#. Click on Button “New Message Window”, it will open a Pop Up Window
#. Get all the Windows name ( Use GetWindowHandles command)
#. Close the Pop Up Window (Use Switch Command to shift window)

Practice Exercise 2
===================

#. Launch new Browser
#. Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
#. Click on Button “Alert Box”, it will open a Pop Up Window generated by JavaScript
#. Switch to Alert window (Use ‘SwitchTo()Alert() command)
#. Close the Pop Up Window (Use Accept command)


