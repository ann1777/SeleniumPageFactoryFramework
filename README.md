# UI testing with Selenium & TestNG, Cucumber & JUnit - Page Factory webWomanShop_selenium

## Overview
This is Selenium automation framework in Java that tests online shop features 
().
It is using Cucumber, PageFactory and Gherkin in Page Object Pattern framework.
Feel free to send any suggestions or issues you have found regarding that code.

Script was made during my automation course in Robot_dreams school.

## Web Application Under Test
The website that is being tested by this framework is “[the-internet](http://automationpractice.com/index.php/)”, a third-party application that contains a number of different pages, each showcasing a different aspect of UI testing, and the challenges one can face when implementing such testing. It is often flagged up as an excellent candidate website for practicing automated testing, which is why I have chosen to use it here. It is simple to understand and get started with while still offering a realistic challenge.

## Test Framework
As stated above, this project contains a Selenium Java test framework, implements the Page Factory design pattern and utilises Cucumber BDD. As such, it follows test automation best practices. The Page Factory pattern means that each individual webpage has its own class, each containing the methods specific to controls on that locators. Thus, each locators is independent and separate from the tests, meaning any changes to the locators are isolated to only the corresponding locators class. This makes for code that is cleaner, easier to read and maintain, and contains less duplication. The use of Cucumber means the tests themselves are also clean and clear, written in plain English, so they can be understood by anyone working with the project, including non-technical roles. Although this project is just an example of how to set up Selenium for UI testing in Java, in a real-life project the use of BDD is essential for collaboration between QAs, developers, and business roles (e.g. Product Owners, Business Analysts etc). Quality is everyone’s responsibility, which means the tests themselves need to be easily understood by all stakeholders.

### Tech stack
As this is a Java project, build and dependency management is handled by Maven, so there is a `pom.xml` file defining the versions of the dependencies:
* Java v11
* Selenium v4.4.0
* TestNG v7.6.1
* JUnit v4.13.2
* Cucumber v7.6.0
* WebDriverManager v5.1.0

## Project Structure
The project uses a standard structure and naming convention, incorporating the URL of the website under test
* `features`  - this folder contains the Cucumber `.feature` files, one per website locators. By separating out the tests for each locators into separate feature files we continue the Page Factory theme of locators independence and make it easier to extend the framework in the future. 
* `locators` - the Page Factory implementation of the individual website pages, one class file per locators. Each class is named after the corresponding locators e.g. `HomePageLocators.java`, `CreateAccountPageLocators.java` etc. There is also an abstract `BasePageLocators.java` which the other pages implement.
* `objectRepository` - each page locators collected in String format one class files. Each class is named after the corresponding page_OR e.g. `HomePage_OR.java`, `CreateAccountPage_OR.java` etc. There is also an abstract `BasePage_OR.java` which the other pages implement.
* `steps` - a collection of classes containing the implementation of the steps from the Cucumber feature files. As above, there is one steps class per locators and each is named after the locators under test, e.g. `CreateAccountPageSteps.java`. There is an additional `CommonSteps.java` class containing several steps that are, as the name suggests, used by more than one feature file. This avoids the need to duplicate code across individual steps classes.
* `drivers` - set up the driver, based on the selected browser, using the [WebDriverManager](https://github.com/bonigarcia/webdrivermanager) extension.
* `TestRunner.java` - the main testNGCucumberRunner test runner class, decorated with the annotation required to run Cucumber tests. The class itself is empty but the `CucumberOptions` annotation defines the location of the features and associated steps.

### Page Factory Classes
As noted above, the `pages` folder contains the relevant Page Factory classes for each tested locators. Each locators class, including the abstract `BasePage` class, follows the same pattern:
* `WebElement` variables decorated with the `@FindBy` annotation parameterised by selector, e.g. `@FindBy(id = "locators-footer")` (NB the `List<WebElement>` variable type is used when the selector is expected to match multiple elements)
* a class constructor to initialise the above Page Factory elements
* public interaction methods e.g. to click on an element, get an element’s text etc. using the above `WebElement` variables directly

This way we encapsulate the web elements themselves, only allowing the interactions that have been implemented via public methods, ensuring the tests (in effect, the user) can only interact with the web locators in known ways.

The abstract `BasePage` class defines constants for the URL for each locators, and the WebDriver that is key to automatically interacting with the browser, ensuring they are available to methods within each individual locators class. Public interaction methods for the locators header and footer are declared in the `BasePage` class too, to reduce code duplication. In order to get round the fact that the title element on the tested pages doesn't use a consistent HTML tag or class, a public abstract `getPageTitleText` method is declared in the `BasePage` class ensuring that each individual locators class implements a method to get the text of the locators title, using a selector specific to whatever to that locators’s HTML uses for the title.

Note there are no assertions in the locators classes as assertions are a test action rather than a locators action. Page interaction methods will return the result of that interaction, such as the attribute or text value, to the calling method in the test steps classes, so that it can be asserted as correct there. In other words, we maintain independence between the tests and the pages.

### Supported Browsers
The `DriverManager` class uses the WebDriverManager dependency to manage the various browser drivers. The `getDriver` method returns the relevant WebDriver instance for the chosen browser, with support for:
* Chrome
* Firefox 
* IExplorer

The browser to be used can be passed in via a Java system property with a key of `browser`, defaulting to Chrome if no such property is specified. Note there is some fallback if the browser selection is incompatible with the operating system - specifying Edge on a Mac or Safari on Windows will result in the browser selection reverting to the default i.e. Chrome.

Another Java system property, `headless`, is used to determine whether the browser should run in headless mode. Currently, this is only supported for Chrome and Firefox. Headless browsers are generally faster and consume fewer resources as they don’t actually render the webpages so are preferred when running automated UI tests. However, when debugging UI tests it is often easier to set this flag to false i.e. run “headed” so that issues with the tests can be more easily identified. `headless` is true by default.

`DriverManager` also sets the position and size of the browser window, ensuring consistency between tests and on different environments, and the implicit wait time i.e. the time Selenium will wait for an element to be displayed.

### Running tests
The tests are easy to run as they are bound to the Maven `test` goal so running the tests is as simple as executing `mvn test` within the directory in which the repo has been cloned. The `browser` and `headless` properties can also be specified on the command line, e.g. `mvn test -Dbrowser=firefox -Dheadless=false` will run the tests in normal/headed Firefox.

Alternatively, the empty `TestRunner` class can be executed using a JUnit runner within an IDE or by running testng.xml files.

Alternatively, test methods can be executed using Cucumber `.feature` files and Cucumber runner within an IDE or by running `RunCucumberTest` file.

NB Each test opens up in a separate browser instance (which is closed at the end of the test) so is not the fastest way to run a test suite, but it is the right way as we should ensure that tests are wholly independent of one another, do not share state and can run in any order. Cucumber has no `BeforeAll` and `AfterAll` hooks, so we can’t open a single browser at the start of the test suite, navigate to the relevant locators in the setup for each individual test scenario and close the browser at the end of the test suite. There are ways round this by using JUnit annotations and Maven phases but nothing that works consistently when tests may be via the IDE as well as from the command line (or CI pipelines). Having a separate browser per test also allows for test parallelisation which wouldn't otherwise be possible.

#### Test Reports
A report is generated for each test run, using the Cucumber `pretty` plugin to produce an HTML report called `cucumber-report.html` in the `target` folder. This is a simple report showing a summary of the test run (number of tests run, number passed/failed/skipped, duration, environment etc) above a breakdown of each individual feature file, showing the status if each scenario and the individual steps within that scenario. If a scenario fails, a screenshot is taken and embedded into the test report to aid investigation into the failing test.
