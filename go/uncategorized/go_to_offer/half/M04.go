package half

func findNumberIn2DArray(matrix [][]int, target int) bool {
	if len(matrix) == 0 || len(matrix[0]) == 0 {
		return false
	}
	step := len(matrix[0]) - 1
	for i := 0; i < len(matrix) && step >= 0; i++ {
		current := matrix[i][step]
		if current == target {
			return true
		} else if current > target {
			step--
			i--
		}
	}
	return false
}
