package esay

//At a lemonade stand, each lemonade costs $5. Customers are standing in a
//queue to buy from you and order one at a time (in the order specified by bills).
//Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
// You must provide the correct change to each customer so that the net
//transaction is that the customer pays $5.
//
// Note that you do not have any change in hand at first.
//
// Given an integer array bills where bills[i] is the bill the iᵗʰ customer
//pays, return true if you can provide every customer with the correct change, or
//false otherwise.
//
//
// Example 1:
//
//
//Input: bills = [5,5,5,10,20]
//Output: true
//Explanation:
//From the first 3 customers, we collect three $5 bills in order.
//From the fourth customer, we collect a $10 bill and give back a $5.
//From the fifth customer, we give a $10 bill and a $5 bill.
//Since all customers got correct change, we output true.
//
//
// Example 2:
//
//
//Input: bills = [5,5,10,10,20]
//Output: false
//Explanation:
//From the first two customers in order, we collect two $5 bills.
//For the next two customers in order, we collect a $10 bill and give back a $5
//bill.
//For the last customer, we can not give the change of $15 back because we only
//have two $10 bills.
//Since not every customer received the correct change, the answer is false.
//
//
//
// Constraints:
//
//
// 1 <= bills.length <= 10⁵
// bills[i] is either 5, 10, or 20.
//

func lemonadeChange(bills []int) bool {
	b5, b10, b20 := 0, 0, 0
	for i := 0; i < len(bills); i++ {
		b := bills[i]
		if b == 5 {
			b5++
		} else if b == 10 {
			if b5 >= 1 {
				b5--
				b10++
			} else {
				return false
			}
		} else {
			if b10 >= 1 && b5 >= 1 {
				b10--
				b5--
				b20++
			} else if b5 >= 3 {
				b5 -= 3
				b20++
			} else {
				return false
			}
		}
	}
	return true
	//m := make(map[int]int, 0)
	//m[5], m[10], m[20] = 0, 0, 0
	//for i := 0; i < len(bills); i++ {
	//	b := bills[i]
	//	if b == 5 {
	//		m[5] = m[5] + 1
	//	} else if b == 10 {
	//		if m[5] >= 1 {
	//			m[5]--
	//			m[10]++
	//		} else {
	//			return false
	//		}
	//	} else {
	//		if m[10] >= 1 && m[5] >= 1 {
	//			m[10]--
	//			m[5]--
	//			m[20]++
	//		} else if m[5] >= 3 {
	//			m[5] -= 3
	//			m[20]++
	//		} else {
	//			return false
	//		}
	//	}
	//}
	//return true
}
