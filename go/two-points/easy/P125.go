package easy

import (
	"strings"
)

//A phrase is a palindrome if, after converting all uppercase letters into
//lowercase letters and removing all non-alphanumeric characters, it reads the same
//forward and backward. Alphanumeric characters include letters and numbers.
//
// Given a string s, return true if it is a palindrome, or false otherwise.
//
//
// Example 1:
//
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//
//
// Example 2:
//
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//
//
// Example 3:
//
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric
//characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
//
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 2 * 10⁵
// s consists only of printable ASCII characters.
//

func isPalindrome(s string) bool {
	length := len(s)

	var newS string
	for i := 0; i < length; i++ {
		if isalnum(s[i]) {
			newS += string(s[i])
		}
	}
	newS = strings.ToLower(newS)
	j := len(newS) - 1
	for i := 0; i < len(newS); i++ {
		if i == j {
			break
		}
		if newS[i] != newS[j] {
			return false
		}
		j--
	}
	return true
}
func isalnum(ch byte) bool {
	return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')
}
