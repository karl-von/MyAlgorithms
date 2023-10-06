package esay

import "strings"

// Write a function to find the longest common prefix string amongst an array of
// strings.
//
// If there is no common prefix, return an empty string "".
//
// Example 1:
//
// Input: strs = ["flower","flow","flight"]
// Output: "fl"
//
// Example 2:
//
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
//
// Constraints:
//
// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters.
func longestCommonPrefix(strs []string) string {
	index := 0
	var isPrefix bool
	if strs[0] == "" {
		return ""
	}
	for {
		prefix := strings.Fields(strs[0])[0]
		index, isPrefix = testPrefix(strs, prefix[0:index], index)
		if !isPrefix || index >= len(strs[0]) {
			str := strs[0]
			return str[0 : index-1]
		}
	}

}

func testPrefix(strs []string, prefix string, index int) (int, bool) {
	for _, s := range strs {
		if !strings.HasPrefix(s, prefix) {
			return index, false
		}
	}
	strings.Index(strs[0], prefix)
	return index + 1, true
}
