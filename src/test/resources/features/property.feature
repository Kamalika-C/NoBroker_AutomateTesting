
Feature: Property search and filter
  
  @property
  Scenario: Verify sorting option
    Given User is on House Rent page
    When User selects sort by
    And user selects sorting options 
    Then Property list should display in sorted
    
   @property
  Scenario: Verify property images display
    Given User is on House Rent page
    When User views image of property card
    Then Property images should be displayed

    @property
Scenario: Invalid location search
  Given User is on House Rent page
  When User enters invalid location "<location>" in location search
  And click on Search
  Then Application should show error for invalid location

  Examples:
  | location   |
  | xyzabc123  |