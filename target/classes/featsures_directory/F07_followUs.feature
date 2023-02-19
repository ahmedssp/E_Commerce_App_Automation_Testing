

Feature: followUs Feature

  Scenario: user opens facebook link
    When user opens "Facebook" link
    Then page"https://www.facebook.com/nopCommerce" is opened in new tab

  Scenario:  user open twitter page
    When  user opens "Twitter" link
    Then  page"https://twitter.com/nopCommerce" is opened in new tab
#
  Scenario: user open youtube page
    When  user opens "YouTube" link
    Then  page"https://www.youtube.com/user/nopCommerce" is opened in new tab

  Scenario:  user open rss page
    When  user opens "RSS" link
    Then  page"https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

