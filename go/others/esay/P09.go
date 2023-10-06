package esay

//Given an integer x, return true if x is a palindrome, and false otherwise.
//
//
// Example 1:
//
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//
//
// Example 2:
//
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it
//becomes 121-. Therefore it is not a palindrome.
//
//
// Example 3:
//
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
//
// Constraints:
//
//
// -2³¹ <= x <= 2³¹ - 1
//
//
//
//Follow up: Could you solve it without converting the integer to a string?
//

import (
	"strconv"
	"strings"
)

func isPalindrome(x int) bool {
	var s = strconv.Itoa(x)
	split := strings.Split(s, "")
	if x < 0 {
		return false
	}
	length := len(split) - 1
	for index := range split {
		if split[index] == split[length-index] {
			continue
		} else {
			if index == length-index {
				continue
			} else {
				return false
			}
		}
	}
	return true
}
