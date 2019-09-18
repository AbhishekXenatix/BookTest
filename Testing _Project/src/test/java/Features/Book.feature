Feature: Signup book Feature
  Verify if user is able to signup in to the site

  Scenario Outline: Login as signup user
    Given user is  on signup page
    When user navigates to signup Page
    Then user enters "<Email>" and "<Password>" and "<CPassword>"
    Then user success login
    
Examples:
|Email|Password|CPassword|
|Ram@gmail.com|Chand|Chand|
|Gudda@gmail.com|Babu|Babu|
