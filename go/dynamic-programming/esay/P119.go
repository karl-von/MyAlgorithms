package esay

// Given an integer rowIndex, return the rowIndexᵗʰ (0-indexed) row of the
// Pascal's triangle.
//
// In Pascal's triangle, each number is the sum of the two numbers directly
// above it as shown:
//
// Example 1:
// Input: rowIndex = 3
// Output: [1,3,3,1]
//
// Example 2:
// Input: rowIndex = 0
// Output: [1]
//
// Example 3:
// Input: rowIndex = 1
// Output: [1,1]
//
// Constraints:
//
// 0 <= rowIndex <= 33
func getRow(rowIndex int) []int {
	result := make([]int, 0)
	for i := 0; i < rowIndex; i++ {
		front := make([]int, 0)
		for j := 0; j < i+1; j++ {
			if j == 0 || j == i {
				front = append(front, 1)
			} else {
				front = append(front, result[j-1]+result[j])
			}
		}
		if i != rowIndex-1 {
			result = front
		}
	}
	return result
}
