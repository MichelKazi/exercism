package twofer

import "fmt"

// ShareWith returns "One for you, one for me" if no argument is provided.
// If there is an argument provided, it replaces "you" with the string provided.
func ShareWith(name string) string {
	if name == "" {
		name = "you"
	}
	return fmt.Sprintf("One for %s, one for me.", name)
}
