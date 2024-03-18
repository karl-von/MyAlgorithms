package easy

import "sort"

//You are given an array of strings names, and an array heights that consists
//of distinct positive integers. Both arrays are of length n.
//
// For each index i, names[i] and heights[i] denote the name and height of the
//iᵗʰ person.
//
// Return names sorted in descending order by the people's heights.
//
//
// Example 1:
//
//
//Input: names = ["Mary","John","Emma"], heights = [180,165,170]
//Output: ["Mary","Emma","John"]
//Explanation: Mary is the tallest, followed by Emma and John.
//
//
// Example 2:
//
//
//Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
//Output: ["Bob","Alice","Bob"]
//Explanation: The first Bob is the tallest, followed by Alice and the second
//Bob.
//
//
//
// Constraints:
//
//
// n == names.length == heights.length
// 1 <= n <= 10³
// 1 <= names[i].length <= 20
// 1 <= heights[i] <= 10⁵
// names[i] consists of lower and upper case English letters.
// All the values of heights are distinct.
//
//

func sortPeople(names []string, heights []int) (result []string) {
	nameMap := make(map[int]string)
	for i := 0; i < len(names); i++ {
		nameMap[heights[i]] = names[i]
	}
	sort.Sort(sort.IntSlice(heights))
	for i := len(heights) - 1; i >= 0; i-- {
		result = append(result, nameMap[heights[i]])
	}
	return
}

//Success:
//	Runtime:22 ms, faster than 53.85% of Go online submissions.
//	Memory Usage:7 MB, less than 17.95% of Go online submissions.
