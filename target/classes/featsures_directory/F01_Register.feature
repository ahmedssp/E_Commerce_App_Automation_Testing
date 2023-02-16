

Feature:  F01_Register | users could register with new account
 @smack
  Scenario: guest user could register with valid data successfully
   Given user go to register page
   When  user select gender type
   And  user enter first name "automation1" and last name "tester1"
   And user enter date of birth
   And user enter email "name2@example.com" field
   And user fills Password fields "ahmed1234" Config
   And user clicks on register button
   Then success message is displayed

