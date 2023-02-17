

Feature: Currencies Feature for all products
  Scenario: user select currencies and reflect on all product
    When  User select Currencies"Euro"from hom page
    Then assertion products displayed "€"currency
