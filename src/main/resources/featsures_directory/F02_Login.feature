
Feature: F02_Login | users could use login functionality to use their accounts

   Scenario: user could login with valid email and password
      Given user go to login page
      When  user login with  "name2@example.com" and "ahmed1234" valid
      And  User press on login button
      Then user login to the system successfully

   Scenario: user could login with invalid email and password
      Given user go to login page
      When  user login with invalid  "Wrong@example.com" and "no_name1234" valid
      And  User press on login button
      Then user login to the system unsuccessfully
