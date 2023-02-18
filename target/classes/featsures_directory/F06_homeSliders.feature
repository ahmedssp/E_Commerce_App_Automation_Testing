@smoke
  Feature: homeSliders Feature

    Scenario: first slider is clickable to new url
      Given first slider is clickable on home page
      Then  direct user to first product successfully

    Scenario: Second slider is clickable to new url
      Given Second slider is clickable on home page
      Then  direct user to Second product successfully
