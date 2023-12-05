package easy

//Given a string s, reverse only all the vowels in the string and return it.
//
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both
//lower and upper cases, more than once.
//
//
// Example 1:
// Input: s = "hello"
//Output: "holle"
//
// Example 2:
// Input: s = "leetcode"
//Output: "leotcede"
//
//
// Constraints:
//
//
// 1 <= s.length <= 3 * 10⁵
// s consist of printable ASCII characters.
//

func reverseVowels(s string) string {
	sByte := []byte(s)
	for i, j := 0, len(sByte)-1; i < j; i, j = i+1, j-1 {
		iIsVowel, jIsVowel := isVowel(sByte[i]), isVowel(sByte[j])
		if iIsVowel && jIsVowel {
			sByte[i], sByte[j] = sByte[j], sByte[i]
		} else {
			if iIsVowel {
				i--
			}
			if jIsVowel {
				j++
			}
		}
	}
	return string(sByte)
}

func isVowel(c byte) bool {
	return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
}
