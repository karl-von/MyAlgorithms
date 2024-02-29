package easy

import "math"

//Given a string s and a character c that occurs in s, return an array of
//integers answer where answer.length == s.length and answer[i] is the distance from
//index i to the closest occurrence of character c in s.
//
// The distance between two indices i and j is abs(i - j), where abs is the
//absolute value function.
//
//
// Example 1:
//
//
//Input: s = "loveleetcode", c = "e"
//Output: [3,2,1,0,1,0,0,1,2,2,1,0]
//Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
//
//The closest occurrence of 'e' for index 0 is at index 3, so the distance is
//abs(0 - 3) = 3.
//The closest occurrence of 'e' for index 1 is at index 3, so the distance is
//abs(1 - 3) = 2.
//For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5,
// but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
//The closest occurrence of 'e' for index 8 is at index 6, so the distance is
//abs(8 - 6) = 2.
//
//
// Example 2:
//
//
//Input: s = "aaab", c = "b"
//Output: [3,2,1,0]
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 10⁴
// s[i] and c are lowercase English letters.
// It is guaranteed that c occurs at least once in s.
//

func shortestToChar(s string, c byte) (result []int) {
	n := len(s)
	for i := range s {
		l, r := n, n
		if s[i] == c {
			result = append(result, 0)
			continue
		}
		for left := i; left >= 0; left-- {
			if s[left] == c {
				l = i - left
				break
			}
		}
		for right := i; right < len(s); right++ {
			if s[right] == c {
				r = right - i
				break
			}
		}
		result = append(result, min(int(math.Abs(float64(l))), int(math.Abs(float64(r)))))
	}
	return
}
func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}

//Success:
//	Runtime:0 ms, faster than 100.00% of Go online submissions.
//	Memory Usage:2.5 MB, less than 6.33% of Go online submissions.
