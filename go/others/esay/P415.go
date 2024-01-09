package esay

//Given two non-negative integers, num1 and num2 represented as string, return
//the sum of num1 and num2 as a string.
//
// You must solve the problem without using any built-in library for handling
//large integers (such as BigInteger). You must also not convert the inputs to
//integers directly.
//
//
// Example 1:
//
//
//Input: num1 = "11", num2 = "123"
//Output: "134"
//
//
// Example 2:
//
//
//Input: num1 = "456", num2 = "77"
//Output: "533"
//
//
// Example 3:
//
//
//Input: num1 = "0", num2 = "0"
//Output: "0"
//
//
//
// Constraints:
//
//
// 1 <= num1.length, num2.length <= 10⁴
// num1 and num2 consist of only digits.
// num1 and num2 don't have any leading zeros except for the zero itself.
//

func addStrings(num1 string, num2 string) string {
	maxLength := len(num1)
	if len(num2) > maxLength {
		maxLength = len(num2)
	}
	result := make([]byte, maxLength+1)
	carry := 0
	for i := 0; i < maxLength; i++ {
		n1, n2 := 0, 0
		if i < len(num1) {
			n1 = int(num1[len(num1)-1-i] - '0')
		}
		if i < len(num2) {
			n2 = int(num2[len(num2)-1-i] - '0')
		}
		step := n1 + n2 + carry
		carry = step / 10
		result[maxLength-i] = byte(step%10 + '0')
	}
	if carry > 0 {
		result[0] = byte(carry + '0')
		return string(result)
	}
	return string(result[1:])
}
