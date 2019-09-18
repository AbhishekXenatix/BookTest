Feature: Create Login and sign Feature
  Verify if user is able to sign in to the site

  Scenario Outline: Login as sign user
    Given user is  on signup page
    When user navigates to signup Page
    Then user enters "<Email>" and "<Fullname>" and "<Phone>"
    Then user success login
    
Examples:
|Email|Fullname|Phone|
|Ram@gmail.com|Chand|9999956456|
|Gudda@gmail.com|Babu|7878787878|
