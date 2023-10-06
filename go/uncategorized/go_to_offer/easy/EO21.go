package easy

func exchange(nums []int) []int {
	l := len(nums)
	arr := make([]int, l)
	i, j := 0, l-1
	for _, num := range nums {
		if num%2 == 0 {
			arr[j] = num
			j--
		} else {
			arr[i] = num
			i++
		}
	}
	return arr
}
