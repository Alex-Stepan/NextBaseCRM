Feature: From  Authorization Page   LOGIN  to  NextBaseCRM Home page
  Background:
    Given User is on the Authorization Page

  Scenario: User navigates from Authorization Page  to  NextBaseCRM Home page
    When User enter login
      | helpdesk29@cybertekschool.com  |
      | marketing29@cybertekschool.com |
      | hr29@cybertekschool.com        |
    And User enter password
      |UserUser|
    Then User should navigate to the NextBaseCRM Home page