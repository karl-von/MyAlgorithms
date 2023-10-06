package _map

func findRepeatNumber(nums []int) int {
	m := make(map[int]int, 0)
	for i := 0; i < len(nums); i++ {
		if m[nums[i]] == 0 {
			m[nums[i]] = 1
		} else {
			return nums[i]
		}
	}
	return -1
}
