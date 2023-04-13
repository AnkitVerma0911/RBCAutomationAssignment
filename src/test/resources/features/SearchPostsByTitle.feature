Feature: Search Posts by Title
@SearchTitle
  Scenario Outline: Search posts by title
    Given the user has access to the search API endpoint
    When the user searches for posts with title "<title>"
    Then the API should return a list of posts that match the title

    Examples:
      | title              |
      | "sunt aut facere repellat provident occaecati excepturi optio reprehenderit" |
      | "qui est esse" |
      | "eum et est occaecati" |

  #Scenario: Search for non-existing post
    #Given the user has access to the search API endpoint
    #When the user searches for a non-existing post with title "This post does not exist"
    #Then the API should return an empty list of posts