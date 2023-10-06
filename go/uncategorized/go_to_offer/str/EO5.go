package str

func replaceSpace(s string) string {
	str := ""
	for i := 0; i < len(s); i++ {
		if s[i] == ' ' {
			str += "%20"
		} else {
			str += string(s[i])
		}
	}
	return str
}
