


Feature: login function

  @smoke @test1
  Scenario: login with valid credentials
    Given user is on login page
    When user enter Email,password,click Login Button
    Then user logout

  @smoke @test2
  Scenario: login with invalid credentials
    Given user is on login page
    When user enter Email,invalid password,click Login Button
    And Invalid Email or Password message pop up

