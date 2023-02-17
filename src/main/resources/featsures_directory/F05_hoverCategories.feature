@smoke
  Feature: hoverCategories Feature
    Scenario: select on of the three main categories click on sub category
      Given  select of the three main categories "Compute" products
      And    user select random one"Deskto" of the three sub cateogries
      Then   Assert that the sub-category "desktop"title

