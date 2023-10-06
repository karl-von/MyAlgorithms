package easy

import "errors"

type ListNode struct {
	Val  int
	Next *ListNode
}

func reversePrint(head *ListNode) []int {
	arr := make([]int, 0)
	sta := newStack()
	for head != nil {
		sta.add(head.Val)
		head = head.Next
	}
	for i := 0; i < sta.len; i++ {
		j, _ := sta.pull()
		arr = append(arr, j)
	}
	return arr
}

type stack struct {
	arr []int
	len int
}

func newStack() stack {
	s := stack{
		arr: make([]int, 0),
		len: 0,
	}
	return s
}
func (s *stack) add(i int) bool {
	s.arr = append(s.arr, i)
	s.len++
	return true
}
func (s *stack) pull() (int, error) {
	l := len(s.arr)
	if l == 0 {
		return -1, errors.New("")
	}
	newArr := s.arr[0 : l-1]
	i := s.arr[l-1]
	s.arr = newArr
	s.len--
	return i, nil
}
