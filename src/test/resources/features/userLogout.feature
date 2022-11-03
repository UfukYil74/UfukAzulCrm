@AZLC-1423 @US2 @All
 Feature: AzulCrm Log out Functionality
  User Story : As a user, I should be able to log out

  Acceptance Criterias:
    1- The user can log out and ends up on the login page.
    2- The user can not go to the home page again by clicking the step back button after successfully logging out.
    3- The user must be logged out if the user close the open tab (all tabs if there are multiple open tabs)


  Background: For the scenarios in the feature file, user is expected to be on the home page
    Given User is on the home page

  @AC01
    Scenario: As a User, I should see the login page after I logout
    When User click the user menu
    And  User click the Log out
    Then User  should see the login page

  @AC02
    Scenario: As a User, I should not go to the home  page after I logout and click the step back
    When User click the user menu
    And  User click the Log out
    And  User  click the step back button
    Then User  should see the login page

  @AC03
    Scenario: As a User, I should not go to home  page after I logout, close the all tabs and open the new app url
    When User click the user menu
    And  User click the Log out
    And  User  close the all tabs
    And  User open the  app url
    Then User  should see the login page

