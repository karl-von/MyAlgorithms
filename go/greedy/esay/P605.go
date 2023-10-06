package esay

// You have a long flowerbed in which some of the plots are planted, and some
// are not. However, flowers cannot be planted in adjacent plots.
//
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty
// and 1 means not empty, and an integer n, return true if n new flowers can be
// planted in the flowerbed without violating the no-adjacent-flowers rule and false
// otherwise.
//
// Example 1:
// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
//
// Example 2:
// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false
//
// Constraints:
//
// 1 <= flowerbed.length <= 2 * 10⁴
// flowerbed[i] is 0 or 1.
// There are no two adjacent flowers in flowerbed.
// 0 <= n <= flowerbed.length
func canPlaceFlowers(flowerbed []int, n int) bool {
	l := len(flowerbed)
	for i := 0; i < l && n > 0; i++ {
		if flowerbed[i] == 1 {
			i++
		} else {
			if (i == 0 || flowerbed[i-1] == 0) && (i == l-1 || flowerbed[i+1] == 0) {
				n--
				i++
			}
		}
	}
	return n == 0
}

//	l := len(flowerbed)
//	for i := 0; i < l; i++ {
//		if n ==0{
//			return true
//		}
//		if flowerbed[i] == 1 {
//			continue
//		} else {
//			if i-1 >= 0 && i+1 < l {
//				if flowerbed[i-1]+flowerbed[i+1] == 0 {
//					flowerbed[i] = 1
//					n--
//				}
//			} else if i-1 < 0 && i+1 >= l {
//				flowerbed[i] = 1
//				n--
//			} else if i-1 < 0 && flowerbed[i+1] == 0 {
//				flowerbed[i] = 1
//				n--
//			} else if i+1 == l && flowerbed[i-1] == 0 {
//				flowerbed[i] = 1
//				n--
//			}
//		}
//	}
//	return n == 0
//}
