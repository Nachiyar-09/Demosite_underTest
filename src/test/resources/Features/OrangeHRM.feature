Feature: Login Functionality
 Scenario Outline: User test the login page for its conditions
     Given User is on Home Page
	 When User Navigate to LogIn Page
	  And User enters "<username>" and "<password>"
	Then Message displayed Login Successfull

Examples:
| username  | password  |
| Admin | admin123 |
| admin | admin123 |