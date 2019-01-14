package main

import "fmt"

func main() {
	num := 5
	for i := 0; i <=10; i++ {
		fmt.Print(num)
		fmt.Print(" x ")
		fmt.Print(i)
		fmt.Print(": ")
		fmt.Println(i*num)
	}
}