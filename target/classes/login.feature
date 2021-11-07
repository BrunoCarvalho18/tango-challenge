#Author: Bruno Carvalho


@general
Feature: Login
  I would like to login on the page

  @login
  Scenario Outline: Login with valid credentials
    Given I am on the login page
    When  I fill "email" with "password" correctly
    Then  I should see login sucessful 

    Examples: 
      | email                            |   password                            | 
      | brunocarvalhodesa@gmail.com      |   it is not good to put password      |
   