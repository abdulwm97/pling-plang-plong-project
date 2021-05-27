Feature: Testing PlingPlangPlong generator
  Scenario: Typing in number that is a factor of 3, not 5 and 7
    Given I type in a number 3
    When I send the number into the PlingPlangPlong generator
    Then I should get a Pling

  Scenario: Typing in number that is a factor of 5, not 3 and 7
    Given I type in a number 5
    When I send the number into the PlingPlangPlong generator
    Then I should get a Plang

  Scenario: Typing in number that is a factor of 7, not 3 and 5
    Given I type in a number 7
    When I send the number into the PlingPlangPlong generator
    Then I should get a Plong

  Scenario: Typing in number that is a factor of 3 and 5, not 7
    Given I type in a number 15
    When I send the number into the PlingPlangPlong generator
    Then I should get a PlingPlang

  Scenario: Typing in number that is a factor of 3 and 7, not 5
    Given I type in a number 21
    When I send the number into the PlingPlangPlong generator
    Then I should get a PlingPlong

  Scenario: Typing in number that is a factor of 5 and 7, not 3
    Given I type in a number 35
    When I send the number into the PlingPlangPlong generator
    Then I should get a PlangPlong

  Scenario: Typing in number that is a factor of 3, 5 and 7
    Given I type in a number 105
    When I send the number into the PlingPlangPlong generator
    Then I should get a PlingPlangPlong

  Scenario: Typing in number that isn't a factor of 3, 5 and 7
    Given I type in a number 2
    When I send the number into the PlingPlangPlong generator
    Then I should get a 2