Feature: Search Bar Functionality
@Search
  Scenario: Search for existing content
    Given the user is on the W3Schools homepage
    When the user enters "HTML" in the search bar
    And clicks the search button
    Then the search results page should display "HTML" related content

  #Scenario: Search for non-existing content
    #Given the user is on the W3Schools homepage
    #When the user enters "This content does not exist" in the search bar
    #And clicks the search button
    #Then the search results page should display "No results found" message
#
  #Scenario: Search with empty query
    #Given the user is on the W3Schools homepage
    #When the user clicks the search button without entering any search query
    #Then the search bar should display an error message
#
  #Scenario: Cancel search
    #Given the user is on the W3Schools homepage
    #When the user enters "HTML" in the search bar
    #And clicks the "X" button
    #Then the search bar should be cleared of the search query
#
  #Scenario: Search with keyboard shortcut
    #Given the user is on the W3Schools homepage
    #When the user enters "CSS" in the search bar
    #And presses the "Enter" key on the keyboard
    #Then the search results page should display "CSS" related content
