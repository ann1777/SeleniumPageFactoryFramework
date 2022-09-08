Feature: CreateAccount features
  Checks if createAccountPage features works as expected

  Scenario Outline1: Fill up only required Your Personal Information fields With Valid Data
    Given Create an account page is displayed
    When I choose MailCheckBox
    And  I fill up the <firstName> and <lastname> fields
    And I click on the Birth data selector
    And I click on 14 in opened dropdown menu
    And I click on the Birth month selector
    And I click on May in opened dropdown menu
    And I click on the Birth year selector
    And I click on 2004 in opened dropdown menu
    And I fill up the <Email> and <password> fields with valid data
    And I fill up the <Address> and <City> fields with valid data
    And I click on the State selector
    And I click on Georgia has in opened dropdown menu
    And I press return key
    And I fill up the <Zip/Postal Code> with valid data
    And I click on the Country selector
    And I press down arrow key to get available option
    And I press return key to chose it
    And I fill up the <Mobile phone> and <future reference alias> fields with valid data
    And I press on the Register button
    Then My account page opens with My account title and My account navigation tab next to the Home icon on it
    And I see the User info button appears on the page header with the user <fullName> on it
    And I see the <Sign out button name> appears on the page header between the <Contact us button name> and the User info button
    Examples:
      | firstName | lastname | Email                     | password   | Address                      | City      | Zip/Postal Code | Mobile phone | future reference alias | fullName      | Contact us button name | Sign out button name |
      | "Sara"    | "Alston" | "{newusername}@gmail.com" | "123456qw" | "some str., 1235, Mycompany" | "NewCity" | "12345"         | "0692536849" | "sara"                 | "Sara Alston" | "Contact us"           |  "Sign out"          |

