Feature: Login functionality

Background: User successfully opened main page
Given user open "chrome" browser with exe as "G:\\Automation Support\\chromedriver.exe" 
Given user enter url as "http://primusbank.qedgetech.com/"



@SmokeTest
Scenario Outline: Login functionality with valid username and password
When user enter <username> as username
When user enter <password> as password
When user click on Login button
Then Application shows Admin page to user

Examples:
         |username|password|
         |Admin|Admin|
         |Admin123|342Admin|
         |admin|admin|








