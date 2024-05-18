Feature: Login

  Scenario: Individual registration
    Given Launch the Login page
    Then  Login "user1"
      | id | password |
      | user1.id | user1.password |
