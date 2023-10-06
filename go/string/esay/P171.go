package esay

// Given a string columnTitle that represents the column title as appears in an
// Excel sheet, return its corresponding column number.
//
// For example:
//
// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28
// ...
//
// Example 1:
//
// Input: columnTitle = "A"
// Output: 1
//
// Example 2:
//
// Input: columnTitle = "AB"
// Output: 28
//
// Example 3:
//
// Input: columnTitle = "ZY"
// Output: 701
//
// Constraints:
//
// 1 <= columnTitle.length <= 7
// columnTitle consists only of uppercase English letters.
// columnTitle is in the range ["A", "FXSHRXW"].
func titleToNumber(columnTitle string) (res int) {
	l := len(columnTitle) - 1
	for i := 0; i < len(columnTitle); i++ {
		var b = columnTitle[i]
		var temp = int(b - 'A' + 1)
		temp1 := temp * l
		if temp1 == 0 {
			temp1 += 1
		}
		res += temp * temp1
		l--
	}
	return res + 1
	//l := 1
	//for i := len(columnTitle); i >=0 ; i-- {
	//	var b = columnTitle[i]
	//	var temp = int(b-'A')+1
	//	res += temp * l
	//	l *= 26
	//}
	//return res
}
