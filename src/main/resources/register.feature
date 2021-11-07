#Author: Bruno Carvalho


@general
Feature: Create Account
  I would like to create account on the page register

  @register-valid
  Scenario Outline: Create Account with valid credentials
    Given I am on the create account page
    When  I fill "<firstname>" with "<lastname>" with "<email>" correctly    
    And   I fill "<password>" correctly
    Then  I should see create account sucessfuly 

    Examples: 
      | firstname          |   lastname    |    email                                    | password                                  | 
      | Bruno             |      Carvalho  |     brunocarvalhodesa@gmail.com             |     it is not good to put true password   |
      
  @register-invalid
  Scenario Outline: Create Account with invalid credentials
    Given I am on the create account page
    When  I fill "<firstname>" with "<lastname>" with "<email>" incorrectly    
    And   I fill "<password>" incorrectly
    Then  I should see create account unsucessfuly 

    Examples: 
      | firstname          |   lastname    |    email                                    | password                                  | 
      | Bruno Carvalho     |     Carvalho  |     brunocarvalhodesa                       |     it is not good to put true password   |
