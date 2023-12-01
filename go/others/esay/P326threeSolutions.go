package esay

//Given an integer n, return true if it is a power of three. Otherwise, return
//false.
//
// An integer n is a power of three, if there exists an integer x such that n ==
// 3ˣ.
//
//
// Example 1:
//
//
//Input: n = 27
//Output: true
//Explanation: 27 = 3³
//
//
// Example 2:
//
//
//Input: n = 0
//Output: false
//Explanation: There is no x where 3ˣ = 0.
//
//
// Example 3:
//
//
//Input: n = -1
//Output: false
//Explanation: There is no x where 3ˣ = (-1).
//
//
//
// Constraints:
//
//
// -2³¹ <= n <= 2³¹ - 1
//
//
//
//Follow up: Could you solve it without loops/recursion?
//

func isPowerOfThree(n int) bool {
	//loop
	//if n <= 0 {
	//	return false
	//}
	//for n%3 == 0 {
	//	n /= 3
	//}
	//return n == 1

	// recursion
	//if n <= 0 {
	//	return false
	//}
	//if n == 3 || n == 1 {
	//	return true
	//}
	//return n%3 == 0 && isPowerOfThree(n/3)

	//enum
	if n == 1 || n == 3 || n == 9 || n == 27 || n == 81 ||
		n == 243 || n == 729 || n == 2187 || n == 6561 ||
		n == 19683 || n == 59049 || n == 177147 || n == 531441 ||
		n == 1594323 || n == 4782969 || n == 14348907 || n == 43046721 ||
		n == 129140163 || n == 387420489 || n == 1162261467 {
		return true
	} else {
		return false
	}

}
