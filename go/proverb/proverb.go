// This is a "stub" file.  It's a little start on your solution.
// It's not a complete solution though; you have to write some code.

// Package proverb contains a function that returns a proverbial rhyme
package proverb

import "fmt"

// Proverb should have a comment documenting it.
// Proverb takes an array of strings and returns a proverbial rhyme
// If it's empty, nothing happens
func Proverb(rhyme []string) []string {

	if len(rhyme) == 0 {
		return []string{}
	}

	arr := []string{}
	allForWant := fmt.Sprintf("And all for the want of a %s.", rhyme[0])

	for i := 0; i < len(rhyme)-1; i++ {
		arr = append(arr, fmt.Sprintf("For want of a %s the %s was lost.", rhyme[i], rhyme[i+1]))
	}

	arr = append(arr, allForWant)

	return arr
}
