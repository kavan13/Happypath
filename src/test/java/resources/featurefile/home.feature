Feature: Happy Path Test
  As a user I should be able fill form and submit  successfully

  @Sanity @Smoke @Regression
  Scenario: verify user is able to submit form successfully
    Given I am on happypath homepage
    When I enter first name "Abcd"
    And I enter last name "Xyz"
    And I click on next button on name page
    And I select file to upload
    And I click on next button on file upload page
    And I send signature"abc"
    And I click on next button on signature page
    And I enter date
    And I select date
    And I click on next button on date
    And I select security question "1"
    And I enter answer of security question "xyz"
    And I click on next button on security question page
    And I click on next
    And I select submit
    Then I should see successful submission message "Your submission has been received!"
