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
Feature: User Registration

  @tag1
  Scenario: User registration with different data
    Given User is on registration page
    When User enter following user details
      | naveen| automation | nav@gmail.com  | 9999 | Banglore |
      | tom | peter | tom@gmail.com | 888777	 | SFO |
      | Lisa | dsouza | lisa@gmail.com| 9824852 | London |
		Then user registration should be successful