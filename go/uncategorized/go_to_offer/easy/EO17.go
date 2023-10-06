package easy

import "strconv"

func printNumbers(n int) []int {
	s := ""
	for i := 0; i < n; i++ {
		s += "9"
	}
	j, _ := strconv.ParseInt(s, 10, 64)
	step := int(j)
	arr := make([]int, 0)
	for i := 1; i <= step; i++ {
		arr = append(arr, i)
	}
	return arr
}
