Feature: Github Search Functionality Automation

  Scenario Outline: User visits Github site as a guest for doing some actions
    Given User visited the Github portal
    And  User click on the About page
    When User search with "<repoName>"
    Then User verify with "<repoExpectName>"

    Examples:
      | repoName         | repoExpectName            |
      | create-react-app | facebook/create-react-app |



