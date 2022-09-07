Feature: CreateAccount features
  Checks if createAccountPage features works as expected

  Scenario Outline1: Fill up only required Your Personal Information fields With Valid Data
    Given Create an account page is displayed
    When I choose MailCheckBox
    And  I fill up the <firstName> and <lastname> fields
    And I click on the data of Birth selector
    And I press down arrow key several times before it 14 has been chosen in opened dropdown menu
    And I press return key to chose 14 number
    And I fill up the <Email> and <password> fields with valid data
    And I fill up the <Address> and <City> fields with valid data
    And I on the State selector
    And I press down arrow key several times before it Georgia has been chosen in opened dropdown menu
    And I press return key to chose Georgia
    And I fill up the <Zip/Postal Code>  with valid data
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

