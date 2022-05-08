Feature: From  Authorization Page   LOGIN  to  NextBaseCRM Home page
  Background:
    Given User is on the Authorization Page

  Scenario: User navigates from Authorization Page  to  NextBaseCRM Home page

    When User enter credentials for Login
          | helpdesk29@cybertekschool.com  |
          | marketing29@cybertekschool.com |
          | hr29@cybertekschool.com        |

    Then User should navigate to the NextBaseCRM Home page