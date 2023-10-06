package esay

//You are given an array prices where prices[i] is the price of a given stock
//on the iᵗʰ day.
//
// You want to maximize your profit by choosing a single day to buy one stock
//and choosing a different day in the future to sell that stock.
//
// Return the maximum profit you can achieve from this transaction. If you
//cannot achieve any profit, return 0.
//
//
// Example 1:
//
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
//6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you
//must buy before you sell.
//
//
// Example 2:
//
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
//
//
//
// Constraints:
//
//
// 1 <= prices.length <= 10⁵
// 0 <= prices[i] <= 10⁴
//
//

func maxProfit(prices []int) int {
	var max int
	var min int = prices[0]
	for i := 0; i < len(prices); i++ {
		temp := prices[i]
		if temp < min {
			min = temp
		} else {
			max = big(max, temp-min)
		}
	}
	return max
}
func min(x int, y int) int {
	if x <= y {
		return x
	} else {
		return y
	}
}

//		var money int
//		len := len(prices)
//		low := prices[0]
//		for i := 0; i < len-1; i++ {
//			buy := prices[i]
//			if buy >= low && i != 0 {
//				continue
//			} else {
//				low = buy
//			}
//			for j := i + 1; j < len; j++ {
//				if prices[j] <= buy {
//					continue
//				} else {
//					money = big(money, prices[j]-buy)
//				}
//			}
//		}
//		return money
//	}
func big(x int, y int) int {
	if x >= y {
		return x
	} else {
		return y
	}
}
