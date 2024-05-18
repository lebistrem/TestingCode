Feature: Registration

Scenario: Individual registration
  Given Launch the Individual Registration page
  Then  Individual member registration for "user1"
    | name | id | password | verify_password | email | phone_number | Terms_number |
    | user1.name | user1.id | user1.password | user1.verify_password | user1.email | user1.phone_number | user1.Terms_number |
Scenario: Group registration
  Given Launch the Group Registration page
  Then  Group member registration for "user2"
    | name | id | password | verify_password | email | phone_number | mutual | representative_name | bussiness_registration |
    | user2.name | user2.id | user2.password | user2.verify_password | user2.email | user2.phone_number | user2.mutual | user2.representative_name | user2.bussiness_registration |

