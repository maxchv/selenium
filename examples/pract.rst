############################
Selenium Practice Excercises
############################

***************************
Browser Navigation Commands
***************************

.. _NavigatePrcactice:  http://toolsqa.wpengine.com/selenium-webdriver/browser-navigation-commands/

Practice Exercise
=================

#. Запустить браузер
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
#. Установить третью радиокнопку для категории ‘Years of Exp’ (Используйте атрибут Id для выбора радио кнопки)
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
#. Выберите опцию ‘Europe’ (используя selectByIndex)
#. Проверьте текст выбранной опции и выведите его в консоль
#. Теперь выбирите опцию ‘Africa’ (исползуя selectByVisibleText)
#. Проверьте значение выбранной опции (атрибут value) и вывидите его в консоль
#. Выберите опцию 'North America' (используя метод selectByValue)
#. Проверьте текст выбранной опции и выведите его в консоль
#. Выведите в консоли все возможные опции для выбранного выпадающего списка
#. Закройте браузер

Практическое задание 2 (Multiple Selection Box/List)
==================================================

#. Запустить браузер
#. Открыть файл  “automation-practice-form.html“
#. Найдите элемент списка ‘Selenium Commands’ (используйте атрибут name для идентификации элемента)
#. Выберите опцию ‘Browser Commands’  (исползуя метод selectByIndex)
#. Проверьте выбранные опции (используя метод getAllSelectedOptions)
#. Отмените выбранную опцию ‘Browser Commands’ (используя метод deselectByIndex)
#. Выберите опцию ‘Navigation Commands’ (используя метод selectByVisibleText)
#. Проверьте все выбранные опции (используя метод getAllSelectedOptions)
#. Отмените выбранную опцию Navigation Commands’ (используя метод deselectByVisibleText)
#. Выберите опцию ‘Wait Commands’, 'WebElement Commands' и 'Switch Commands' одновременно (используя метод selectByValue)
#. Проверьте все выбранные опции (используя метод getAllSelectedOptions) и выведите их в консоль
#. Выведите в консоли все опции списка ‘Selenium Commands’ (используя метод getOptions).
#. Отмените все опции (испольуя метод deselectAll)
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

#. Запустить браузер
#. Открыть файл “automation-practice-switch-windows.html”
#. Нажать на кнопку “Timing Alert” (После некоторого времени появится всплывающее окно)
#. Закрыть всплывающее окно Alert (использйте WebDriverWait для ожидания появления окна и класс Function)

#. Запустить браузер
#. Открыть файл “automation-practice-switch-windows.html”
#. Появляется текст "Seconds remaining: 40" с обратным отсчетом времени
#. Дождаться появления текста "Buzz Buzz" (использйте WebDriverWait для ожидания и класс ExpectedCondition)


#. Запустить браузер
#. Открыть файл “automation-practice-switch-windows.html”
#. Нажать на кнопку “Change color” (После некоторого времени появится цвет текста кнопки изменится)
#. Дождаться изменения цвета кнопки (использйте WebDriverWait для ожидания и класс ExpectedConditions)



***************
Switch Commands
***************

.. _SwitchCommands: http://toolsqa.com/selenium-webdriver/switch-commands/

Practice Exercise 1
===================

#. Запустить браузер
#. Открыть файл “automation-practice-switch-windows.html”
#. Получить имя текущего окна (используя метод GetWindowHandle)
#. Кликнуть по кнопке “New Message Window”, что приведет к появлению второго окна
#. Получить все открытые окна (использйте метод GetWindowHandle)
#. Закрыть всплывающее окно (использйте метод switchTo для переключения между окнами)

Practice Exercise 2
===================

#. Запустить браузер
#. Открыть файл “automation-practice-switch-windows.html”
#. Кликнуть по кнопке “Alert Box”, после появится всплывающее окно созданное JavaScript
#. Переключится на окно Alert window (используйте метод switchTo().alert())
#. Закройте всплывающее окно (используя метод accept)


