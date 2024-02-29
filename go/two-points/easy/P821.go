package easy

import "math"

func shortestToChar(s string, c byte) (result []int) {
	n := len(s)
	for i := range s {
		l, r := n, n
		if s[i] == c {
			result = append(result, 0)
			continue
		}
		for left := i; left >= 0; left-- {
			if s[left] == c {
				l = i - left
				break
			}
		}
		for right := i; right < len(s); right++ {
			if s[right] == c {
				r = right - i
				break
			}
		}
		result = append(result, min(int(math.Abs(float64(l))), int(math.Abs(float64(r)))))
	}
	return
}
func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}

//Success:
//	Runtime:0 ms, faster than 100.00% of Go online submissions.
//	Memory Usage:2.5 MB, less than 6.33% of Go online submissions.
