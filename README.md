# Digit Counter

## Description
This project provides a Java solution for counting the number of digits in an integer.
The program asks the user to enter an integer between -3,000,000,000 and 3,000,000,000 
and displays the number of digits contained in the input.
The negative sign is not considered a digit.

## Algorithm
The program repeatedly divides the input number by 10.
For each division, the digit counter is increased by one until the number becomes zero.
The value zero is handled separately because zero contains one digit.

## Examples
### Example 1
Input:
0
Output:
1

### Example 2
Input:
123456
Output:
6

### Example 3
Input:
-98765
Output:
5

## Complexity
Time complexity: O(log n)
Space complexity: O(1)
