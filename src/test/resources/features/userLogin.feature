  @AZLC-1415,@US1,@All
  Feature: AzulCrm Login Functionality
    User Story :  As a user, I should be able to log in

    Acceptance Criterias:
     1-All users can log in with valid credentials.
     2-"Incorrect login or password." should be displayed for invalid data
     3- "Please fill out this field" message should be displayed if the password or username is empty
     4-User land on the ‘Get Password’ page after clicking on the "Forgot your password?" link
     5-User can see "Remember Me" link exists and is clickable on the login page
     6-User should see the password in bullet signs by default
     7-Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
     8-All users can see their own usernames in the profile menu, after successful login

    Accounts types are: helpdesk,hr, marketing

    Background: For the scenarios in the feature file, user is expected to be on login page
      Given User is on the login page

      @AC1 @wip
      Scenario Outline: As a User, I can log in with valid credentials of different account types
        When  User enters valid username "<username>"
        And   User enters valid password "<password>"
        And   User click login button
        Then  user access the home page

        Examples:
          | username                       | password  |
          | marketing99@cybertekschool.com | UserUser  |
          | hr22@cybertekschool.com        | UserUser  |
          | helpdesk22@cybertekschool.com  | UserUser  |


      @AC2 @wip
      Scenario Outline: As a User, I should see the "Incorrect login or password." message when I enter the invalid credentials
        When  User enters any username "<username>"
        And   User enters any password "<password>"
        And   User click login button
        Then  user should see the warning message incorrect

        Examples:
            | username                       | password |
            | marketing99@cybertekschool.com | invalid  |
            | invalid                        | UserUser |
            | invalid                        | invalid  |


     @AC3 @wip
     Scenario Outline: As a User, I should see the "Please fill out this field" message if the password or username is empty
       When  User enters any username "<username>"
       And   User enters any password "<password>"
       And   User click login button
       Then  user should see warning message fill out

       Examples:
         | username                       | password |
         | marketing99@cybertekschool.com |          |
         |                                | UserUser |
         |                                |          |


    @AC4 @wip
     Scenario: As a User, I should land on the "Get Password" page after clicking on the "Forgot your password"
       When User click Forgot your password link
       Then User land  on the Get Password page


    @AC5 @wip
     Scenario: As a User, I can see the "Remember Me" link exists and is clickable on the login page
       Then User click Remember Me link


    @AC6 @wip
    Scenario: As a User, I should see the password in bullet signs by default on the login page
      When User enters any password
      Then User should see the password in bullet signs by default


    @AC7 @wip
    Scenario: verify Enter key is working on the login page
      When user enter valid username and password
      And  user press ENTER
      Then user access the home page


    @AC8 @wip
    Scenario Outline: As a User, I can see my own usernames in the profile menu, after login succesfully
      When  User enters valid username "<username>"
      And   User enters valid password "<password>"
      And   User click login button
      Then  user access the home page
      Then  user see hisher "<username>" ;

      Examples:
        | username                       | password  |
        | marketing99@cybertekschool.com | UserUser  |
        | hr22@cybertekschool.com        | UserUser  |
        | helpdesk22@cybertekschool.com  | UserUser  |



