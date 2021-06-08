


Feature: login function

  @test1
  Scenario: login with valid credentials
    Given user is on login page
    When user enter Email,password,click Login Button

   Then user is able to see headTables on landing page:
     | HOME         |
     | VISA         |
     | COMPANY      |
     | OUR PARTNERS |

    Then user logout

  @test2
  Scenario: login with invalid credentials
    Given user is on login page
    When user enter Email,invalid password,click Login Button
    And Invalid Email or Password message pop up

