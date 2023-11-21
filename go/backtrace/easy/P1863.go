package easy

import (
	"fmt"
	"strconv"
)

func subsetXORSum(nums []int) int {
	str := fmt.Sprintf("%64b", nums[0])

	result, _ := strconv.ParseInt(dfs1863(nums, str, 1), 2, 64)
	return int(result)
}

func dfs1863(nums []int, result string, step int) string {
	if len(nums)-1 == step {
		return result
	}
	next := fmt.Sprintf("%64b", nums[step])
	str := ""
	for i := 0; i < 64; i++ {
		if str[i] != next[i] {
			str = "1" + str
		} else {
			str = "0" + str
		}
	}
	result = str
	dfs1863(nums, result, step+1)
	return result
}
