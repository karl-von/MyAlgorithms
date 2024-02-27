package easy

func uniqueMorseRepresentations(words []string) int {
	morseCode := map[rune]string{
		'a': ".-",
		'b': "-...",
		'c': "-.-.",
		'd': "-..",
		'e': ".",
		'f': "..-.",
		'g': "--.",
		'h': "....",
		'i': "..",
		'j': ".---",
		'k': "-.-",
		'l': ".-..",
		'm': "--",
		'n': "-.",
		'o': "---",
		'p': ".--.",
		'q': "--.-",
		'r': ".-.",
		's': "...",
		't': "-",
		'u': "..-",
		'v': "...-",
		'w': ".--",
		'x': "-..-",
		'y': "-.--",
		'z': "--..",
	}
	resultMap := make(map[string]bool)
	for _, word := range words {
		str := ""
		for _, char := range word {
			mos := morseCode[char]
			str += mos
		}

		if !resultMap[str] {
			resultMap[str] = true
		}
	}
	return len(resultMap)
}
