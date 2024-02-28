package esay

import (
	"sort"
	"strconv"
)

//You are given an integer array score of size n, where score[i] is the score
//of the iᵗʰ athlete in a competition. All the scores are guaranteed to be unique.
//
// The athletes are placed based on their scores, where the 1ˢᵗ place athlete
//has the highest score, the 2ⁿᵈ place athlete has the 2ⁿᵈ highest score, and so on.
// The placement of each athlete determines their rank:
//
//
// The 1ˢᵗ place athlete's rank is "Gold Medal".
// The 2ⁿᵈ place athlete's rank is "Silver Medal".
// The 3ʳᵈ place athlete's rank is "Bronze Medal".
// For the 4ᵗʰ place to the nᵗʰ place athlete, their rank is their placement
//number (i.e., the xᵗʰ place athlete's rank is "x").
//
//
// Return an array answer of size n where answer[i] is the rank of the iᵗʰ
//athlete.
//
//
// Example 1:
//
//
//Input: score = [5,4,3,2,1]
//Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
//Explanation: The placements are [1ˢᵗ, 2ⁿᵈ, 3ʳᵈ, 4ᵗʰ, 5ᵗʰ].
//
// Example 2:
//
//
//Input: score = [10,3,8,9,4]
//Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
//Explanation: The placements are [1ˢᵗ, 5ᵗʰ, 3ʳᵈ, 2ⁿᵈ, 4ᵗʰ].
//
//
//
//
// Constraints:
//
//
// n == score.length
// 1 <= n <= 10⁴
// 0 <= score[i] <= 10⁶
// All the values in score are unique.
//
//

func findRelativeRanks(score []int) (result []string) {
	score1 := make([]int, len(score))
	copy(score1, score)
	sort.Sort(sort.Reverse(sort.IntSlice(score1)))

	indexMap := make(map[int]int)
	for index, v := range score1 {
		indexMap[v] = index
	}

	for _, v := range score {
		rank := indexMap[v]
		if rank == 0 {
			result = append(result, "Gold Medal")
		} else if rank == 1 {
			result = append(result, "Silver Medal")
		} else if rank == 2 {
			result = append(result, "Bronze Medal")
		} else {
			rank++
			result = append(result, strconv.Itoa(rank))
		}
	}
	return
}

//  Success:
//	Runtime:6 ms, faster than 91.89% of Go online submissions.
//	Memory Usage:6.1 MB, less than 12.61% of Go online submissions
