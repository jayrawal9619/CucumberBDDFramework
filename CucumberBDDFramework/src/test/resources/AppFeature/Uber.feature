#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Uber Booking Feature

  @tag1
  Scenario: Booking Cab
    Given User wants to select a car type "sedan" from uber app
    When User selects car "sedan" and pick up point "Banglore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
