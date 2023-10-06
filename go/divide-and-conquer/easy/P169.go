package easy

// Given an array nums of size n, return the majority element.
//
// The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.
//
// Example 1:
// Input: nums = [3,2,3]
// Output: 3
//
// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
//
// Constraints:
//
// n == nums.length
// 1 <= n <= 5 * 10⁴
// -10⁹ <= nums[i] <= 10⁹
//
// Follow-up: Could you solve the problem in linear time and in
// O(1) space?
func majorityElement(nums []int) int {
	big := 0
	m := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		_, ok := m[nums[i]]
		if ok {
			m[nums[i]]++
		} else {
			m[nums[i]] = 1
		}
		if m[nums[i]] > m[big] {
			big = nums[i]
		}
	}
	return big
}
