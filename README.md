# Fix NoSuchElementException in Selenium and JAVA


## What is a NoSuchElementException?
NoSuchElementException is an exception thrown in Java and Selenium when an element is not found on the page. It indicates that the code was unable to locate a particular element on the page within the time specified. 

## NoSuchElementException in Selenium
In Selenium automation tests, NoSuchElementException is thrown by WebDriver.findElement and WebElement.findElement methods and is derived from NotFoundException.

It majorly occurs due to 2 reasons, either the web element’s locator is incorrect or the element is not present on the page at that moment.

For example, you are trying to click on a button by fetching the web element for same using its ID, but the ID is incorrect or the button is not present on the page, then a NoSuchElementException will be thrown.
## NoSuchElementException in JAVA
In JAVA, this exception can be thrown by various methods that can be used for data retrieval to indicate that the element requested does not exist.

For example, if you try to retrieve data from an empty data structure or (n+1)th element from a data structure of n length, then NoSuchElementException is thrown.


## About Project
It is created using Selenium with Java, TestNG and Maven.

This is the list of tools, being used in this framework:
1. Apache Maven
2. Java 8
3. Selenium Cloud Grid - [LambdaTest](http://www.lambdatest.com?fp_ref=vipul51) Platform
4. TestNG Framework

## Steps for Local Execution
1. Import this project in Eclipse/IntelliJ as “Existing Maven Project”
2. Go to the test file and Run test case for your desired case.
3. You can see the logs coming up on Console as your execution progresses.
4. Since we are using RemoteWebDriver and executing on Cloud Grid platform, [LambdaTest](http://www.lambdatest.com?fp_ref=vipul51), you can login to same and view detailed logs on dashboard.
