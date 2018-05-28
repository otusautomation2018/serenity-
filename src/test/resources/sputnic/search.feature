Feature: Search on sputnic.ru

  Scenario: Positive test: search page contains 10 results
    Given user opens the site
    When user searches for 'automated testing'
    And result page contains '10' results

  Scenario: Negative test: use search
    Given user opens the site
    When user searches for 'csdsdccdcdc'
    Then result page contains message about nothing was found
