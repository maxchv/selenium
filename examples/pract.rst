############################
Selenium Practice Excercises
############################

**************************
Команды навигации браузера
**************************

.. _NavigatePrcactice:  http://toolsqa.wpengine.com/selenium-webdriver/browser-navigation-commands/

Практическое задание1
=====================

#. Запустить браузер
#. Открыть ссылку http://DemoQA.com
#. Нажать на ссылку Registration используя xpath “driver.findElement(By.xpath(“.//*[@id=’menu-item-374?]/a”)).click();“
#. Вернуться на главную страницу (используя команду ‘back’)
#. Снова перейти на страницу регистрации (На этот раз используйте команду ‘forward’)
#. Опять перейти на главную страницу (В этот раз используйте команду ‘to’)
#. Обновите браузер (исползуя команду ‘refresh’)
#. Закройте браузер

**************************
WebDriver Browser Commands
**************************

.. _BrowserCommands: http://toolsqa.wpengine.com/selenium-webdriver/browser-commands/

Practice Exercise 1
===================

#. Запустите браузер.
#. Откройте ссылку http://Store.DemoQA.com
#. Получите содержимое заголовка веб-старницы (тега title)
#. Напечатайте заголовок и его длину в консоль.
#. Получите URL страницы и проверте его корректонсть
#. Получите исходный html код страницы
#. Вывести исходный html код и его длину в консоли.
#. Закройте браузер.

Practice Exercise – 2
=====================

#. Запустите браузер.
#. Откройте ссылку http://demoqa.com/frames-and-windows/
#. Откройте новое окно нажав по ссылке “driver.findElement(By.xpath(“.//*[@id=’tabs-1?]/div/p/a”)).click();”
#. Закройте браузер командой close()

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
#. Кликнуть по кнопке “New Browser Window”, что приведет к появлению нового окна браузера
#. Кликнуть по кнопке “New Message Window”, что приведет к появлению всплывающего окна
#. Кликнуть по кнопке “New Browser Tab”, что приведет к появлению вкладки браузера
#. Получить все открытые окна и вывести их на консоль (использйте метод GetWindowHandle)

Practice Exercise 2
===================

#. Запустить браузер
#. Открыть файл “automation-practice-switch-windows.html”
#. Кликнуть по кнопке “Alert Box”, после появится всплывающее окно созданное JavaScript
#. Переключится на окно Alert window (используйте метод switchTo().alert())
#. Закройте всплывающее окно (используя метод accept)

***************
Complex Actions
***************

.. _DragAndDrop: http://toolsqa.com/selenium-webdriver/drag-drop/

Practice Exercise Drag'n'Drop #1
================================

#. Запустить браузер
#. Открыть url “http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml”
#. В Live Demo найти папку Thriller в левой панели 
#. Переместить найденный элемент из левой панели в правую в папку Bestsellers 
#. Использовать методы класса Actions: clickAndHold, moveToElement, release

Practice Exercise Drag'n'Drop #2
================================

#. Запустить браузер
#. Открыть url http://www.w3schools.com/html/html5_draganddrop.asp
#. Найти изображение w3schools.com 
#. Переместить изображение с левого прямоугольника в правый
#. Использовать методы класса Actions: dragAndDrop

https://seleniumonlinetrainingexpert.wordpress.com/tag/performing-drag-and-drop-operations/
http://tinyurl.com/burdnrx

Practice Exercise Context Menu #1
=================================

#. Запустить браузер
#. Открыть url http://www.trendskitchens.co.nz/jquery/contextmenu/
#. Найти элемент с содержимым 'DEMO right-click me!!'
#. Нажать правой кнопкой мыши
#. В появившемся контекстном меню кликнуть левой кнопкой мыши по пункту 'Open'
#. В появившемся модальном окне alert проверить содержимое 'Trigger was quickDemo\nAction was Open'
#. Закрыть модальное окно
#. Снова нажать правой кнопкой мыши по элементу с содержимым 'DEMO right-click me!!'
#. В появившемся контекстном меню кликнуть левой кнопкой мыши по пункту 'Save'
#. В появившемся модальном окне alert проверить содержимое 'Trigger was quickDemo\nAction was Save'
#. Закрыть модальное окно
#. Закрыть браузер

Practice Exercise Complex Actions
=================================

#. Запустить браузер
#. Открыть url http://store.demoqa.com/
#. Подвести курсор мыши к пункту меню Product Category
#. В появившемся меню выбрать пункт iPads
#. После загрузки страницы подвести курсор мыши к пункту меню ProductCategory
#. В появившемся меню выбрать пункт iMacs
#. После загрузки страницы подвести курсор мыши к пункту меню ProductCategory
#. В появившемся меню выбрать пункт MacBooks
#. После загрузки страницы перейти к товару "Apple 13-inch MacBook Pro" и кликнуть по закголовку
#. После загрузки информации о товаре проверить цену акционного товара ($864.00 вместо $999.00)

context:
https://swisnl.github.io/jQuery-contextMenu/demo.html