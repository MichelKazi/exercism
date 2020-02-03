// This is a "stub" file.  It's a little start on your solution.
// It's not a complete solution though; you have to write some code.

// Package proverb should have a package comment that summarizes what it's about.
// https://golang.org/doc/effective_go.html#commentary
package proverb

import "fmt"

// Proverb should have a comment documenting it.
// Proverb takes an array of strings and returns
func Proverb(rhyme []string) []string {
	var arr = []string{}

	for i := 0; i < len(rhyme)-1; i++ {
		arr = append(arr, fmt.Sprintf("For want of a %s the %s was lost.\n", rhyme[i], rhyme[i+1]))
	}

	return append(arr, fmt.Sprintf("And all for the want of a %s\n", rhyme[0]))
}
