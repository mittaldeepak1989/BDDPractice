Feature: This feature is designed to validate multiple sets of data

@Custom
Scenario Outline: scenario description
	Given a precondition has value <Browser> with <Url>
		
		Examples:
		| Browser | Url                          |
		| ff 	  | http://demo.nopcommerce.com/ |
		| chrome  | http://demo.nopcommerce.com/ |