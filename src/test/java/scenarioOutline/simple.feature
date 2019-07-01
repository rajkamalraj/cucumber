
Feature: Test Calculator
  This file describes calculator functionality
    
  Scenario Outline: Calculating functions
    Given Enter <firstvalue> in the calculator
    And Press "<button>" button
    And Enter <secondvalue> in the calculator again
    When press equal button
    Then The result should be <result> on this screen

    Examples: 
      | firstvalue  | button | secondvalue | result  |
      | 100		 			|   Add  |  50				 | 150		 |
      | 100					|   Sub  |  50 				 | 50      |
      | 10					|   Mul  |  5					 | 50			 |
      | 50					|   Div  |  10 				 | 5			 |
