package hamming

import "errors"

// Distance takes two strings of equal length returns the number of differences
// This number is the hamming distance
// if the lengths of a and b are different an error is returned
func Distance(a, b string) (int, error) {
	distance := 0
	if len(a) != len(b) {
		return distance, errors.New("left and right strands do not match")
	}

	for i := 0; i < len(a); i++ {
		if a[i] != b[i] {
			distance++
		}
	}

	return distance, nil
}
