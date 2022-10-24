Feature: LogIn

  I need funcionality as a user, to log into application

Scenario: Happy Path
  Given User is on the login page
  When User types correct login
  And User types correct password
  And User clicks LogIn button
  Then User loged in correctly