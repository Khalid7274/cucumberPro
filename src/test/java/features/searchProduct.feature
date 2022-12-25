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
Feature: Search and Place the order for Products
@offersPage
Scenario Outline: search experince for product search in both home and offer page

Given user is on Greenkart landing page
When user searched with short name <vegName> and extracted actual name of product
Then user searched with for <vegName> short name in offers page
And validate product name in offer page matches with landing page 

Examples:
| vegName|
| Tom    |
| Beet   |





