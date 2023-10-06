package esay

//Given an integer numRows, return the first numRows of Pascal's triangle.
//
// In Pascal's triangle, each number is the sum of the two numbers directly
//above it as shown:
//
//
// Example 1:
// Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//
// Example 2:
// Input: numRows = 1
//Output: [[1]]
//
//
// Constraints:
//
//
// 1 <= numRows <= 30
//
//

func generate(numRows int) [][]int {
	result := make([][]int, 0)
	for i := 0; i < numRows; i++ {
		tiny := make([]int, 0)
		for j := 0; j < i+1; j++ {
			if j == 0 || j == i {
				tiny = append(tiny, 1)
			} else {
				tiny = append(tiny, result[i-1][j-1]+result[i-1][j])
			}

		}
		result = append(result, tiny)
	}

	return result
}
