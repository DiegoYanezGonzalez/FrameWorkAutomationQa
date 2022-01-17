Feature: Google Search
  'When I go to the Tellotec page, and search for an item,
  I expect to see some reference to that item in the result summary.'

  Scenario Outline: Standard Search Repuestos
    Given that I have gone to the Tellotec page
    When I add "<repuesto>" to the search box
    And click the Search Button
    Then the "<repuesto>" should be mentioned in the results

    Examples:
      |repuesto   |
      |Foco       |
      |2020       |
      |Tapa       |
      |2022       |
      |2019       |
      |L200       |
      |Mitsubishi |

#  Scenario: Standard Search Two
#    Given that I have gone to the Google page
#    When I add "dogs" to the search box
#    And click the Search Button
#    Then "dogs" should be mentioned in the results

