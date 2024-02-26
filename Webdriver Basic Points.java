/*Selenium
At first in-order to invoke browser
Selenium has created a Class called ChromeDriver
This ChromeDriver has  methods
To access this methods we need object
So , Object is created to access this Methods

Summary -- Different Browser has Different class
Example : --1.Chrome Browser --- Chrome Driver-- class
2. Firefox Browser ---- Firefox Driver-- class
if we observe - Chrome Driver and Firefox Driver also have their own Methods -
So to avoid this own Methods -- We are going to Implement only
Webdriver methods */


Interface -- Webdriver is an Interface - which have abstract methods -- No body - only Definition

Each Class Responsibility to implement Webdriver methods
we are creating object with Web driver to access only web driver Methods

ChromeDriver driver = new ChromeDriver();-- user is able to access own chromeDriver methods
But Here by this Webdriver 
Webdriver driver = new ChromeDriver();
