Feature: BasePage features
  Checks if BasePage header and footer features works as expected

  Scenario Outline1: Contact found in search result by FirstName
    Given Base page header is displayed with a searchField
    And I see <itemName> on HomePage
    When I search for <itemName>
    Then I see <searchResult> in search result block
    Examples:
      | itemName             | searchResult                  |
      | "Printed Dress"      | "Printed Dress"               |
      | "Blouse"             | "Blouse"                      |
      | "Faded Short Sleeve" | "Faded Short Sleeve T-shorts" |

  Scenario Outline2: Base page header Tabs submenu containers available options
    Given Base page header is displayed with <tabs> on it
    When I hover mouse on <tab> button
    Then I see submenu-container opens with available <submenu-container options>
    Examples:
      | tabs      | submenu-container options                             |
      | "Women"   | "Blouses", "Dresses", "Casual Dresses"                |
      | "Dresses" | "Casual Dresses", "Evening dresses", "Summer dresses" |

  Scenario Outline3: Fill subscribe NewsLetter field with valid user email
    Given Base page footer is displayed with a subscribe NewsLetter field
    When I fill up the subscribe NewsLetter field with <valid user email>
    And I click on submitNewsletter button
    Then I see <validEmailPageAlertMsg> on the page
    And I see the <successAlertMsg> in the footer NewsLetterInputFld
    Examples:
      | valid user email          | validEmailPageAlertMsg                                             | successAlertMsg                                        |
      | "{newusername}@gmail.com" | "Newsletter: You have successfully subscribed to this newsletter." | "You have successfully subscribed to this newsletter." |

  Scenario Outline4: Fill subscribe NewsLetter field with already subscribed user email
    Given Base page footer is displayed with a subscribe NewsLetter field
    When I fill up the subscribe NewsLetter field with <valid user email>
    And I click on submitNewsletter button
    And  I see <validEmailPageAlertMsg> on the page
    And I see the <successAlertMsg> in the footer NewsLetterInputFld
    And I fill up the subscribe NewsLetter field with the same <valid user email>
    And I click on submitNewsletter button
    Then I see <dangerEmailPageAlertMsg> on the page
    And I see the <dangerFooterAlertMsg> in the footer NewsLetterInputFld
    Examples:
      | valid user email       | validEmailPageAlertMsg                                               | successAlertMsg                                        | dangerEmailPageAlertMsg                                 | dangerFooterAlertMsg                        |
      | "{username}@gmail.com" | " Newsletter : You have successfully subscribed to this newsletter." | "You have successfully subscribed to this newsletter." | "Newsletter: This email address is already registered." | "This email address is already registered." |


  Scenario Outline5: Fill subscribe NewsLetter field with invalid user email
    Given Base page footer is displayed with a subscribe NewsLetter field
    When I fill up the subscribe NewsLetter field with <invalid user email>
    And I click on submitNewsletter button
    Then I see <invalidEmailPageAlertMsg> on the page
    And I see the <dangerAlertMsg> in the footer NewsLetterInputFld
    Examples:
      | invalid user email   | invalidEmailPageAlertMsg             | dangerAlertMsg           |
      | "testusergmail.com"  | "Newsletter: Invalid email address." | "Invalid email address." |
      | "+380523012225"      | "Newsletter: Invalid email address." | "Invalid email address." |
      | "@gmail.com"         | "Newsletter: Invalid email address." | "Invalid email address." |
      | "//////////////////" | "Newsletter: Invalid email address." | "Invalid email address." |

  Scenario Outline6: Subscribe to followUs group by social network links
    Given Base page footer Follow Us section is displayed with social network icons on it
    And I signed in as site user
    When I click on an <social network icon>
    Then The <social network page> opens
    And I see the <page title> on it
    Examples:
      | social network icon | social network page                 | page title                                                                  |
      | "Facebook Icon"     | "https://www.facebook.com/groups/*" | "Selenium Framework"                                                        |
      | "Twitter Icon"      | "https://twitter.com/*"             | "Selenium Framework"                                                        |
      | "YOUTube Icon"      | "https://youtube.com/*"             | "Selenium Framework"                                                        |
      | "Google+ Icon"      | "https://plus.google.com/*"         | "Google+ is no longer available for consumer (personal) and brand accounts" |

  Scenario Outline7: Open site pages using footer Page links
    Given Base page footer is displayed with the Categories, Information and My account Page links on it
    And I signed in as site user
    When I click on a <page link> in the footer
    Then The site page opens with the corresponding <navigation page Tab text>
    And I see the same or corresponding <page heading> on it
    Examples:
      | page link                     | navigation page Tab text      | page heading                    |
      | "Women"                       | "Women"                       | "Women"                         |
      | "Specials"                    | "Price drop"                  | "Price drop"                    |
      | "New products"                | "New products"                | "New products"                  |
      | "Best sellers"                | "Best sellers"                | "Best sellers"                  |
      | "Our stores"                  | "Our store(s)!"               | "Our store(s)!"                 |
      | "Contact us"                  | "Contact"                     | "Customer service - Contact us" |
      | "Terms and conditions of use" | "Terms and conditions of use" | "Terms and conditions of use"   |
      | "About us"                    | "About us"                    | "About us"                      |
      | "Sitemap"                     | "Sitemap"                     | "Sitemap"                       |
      | "My orders"                   | "Order history"               | "Order history"                 |
      | "My credit slips"             | "Credit slips"                | "Credit slips"                  |
      | "My addresses"                | "My addresses"                | "My addresses"                  |
      | "My personal info"            | "Your personal information"   | "Your personal information"     |
      | "Sign out"                    | "Authentication"              | "Authentication"                |











