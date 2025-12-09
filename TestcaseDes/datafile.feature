Feature: Login

@positive
Scenario Outline: login with valid input
Given  user open chrome browser
When user open url "https://practicetestautomation.com/practice-test-login/"
And enter username "<username>" and password as "<password>"
And click on submit button
Then page title should be "Logged In Successfully | Practice Test Automation"

Examples:
|username|password|
|student|Password123|
|stud233|pass2333|
|ser55|kdkkd|