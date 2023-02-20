@smoke
  Feature: Search Feature
    Scenario Outline: user could search using product name
      When User Search for <product_name> product
      Then soft assertion to verify "<product_name>" search

      Examples:
        | product_name |
        | book         |
        | laptop       |
        | nike         |

    Scenario Outline: user could search for product using sku
      When User Search for <SKu_name> product
      Then soft assertion to verify "<SKu_name>" name

      Examples:
        | SKu_name  |
        | SCI_FAITH |
        | APPLE_CAM |
        | SF_PRO_11 |
