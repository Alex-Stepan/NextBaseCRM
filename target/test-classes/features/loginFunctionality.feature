Feature: From default page Login to Home Page

  Background:
    Given User is on default page


  Scenario: User navigates to Home Page

    When User verifies login functionality to Home page

    Then User close the browser
