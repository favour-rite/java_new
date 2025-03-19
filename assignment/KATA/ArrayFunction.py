def LargestElement(numbers:list):
	largest = list[0]
	for number in numbers:
		if largest < number:
			largest = number
	print(largest)

def reverse(number):
	for count in number:
		print(number[count] + " ")
	
	print()

def occuring(number):
	for(int count = 0; count < numbers.length; count++):
		if (numbers[count] == target):
			print(true)
		
		else:
			print(false)

def  oddposition(number):
	
	

def reversed_string(name):
	reversed_word = ''
	for number in range(len(name)-1,-1, -1):
		reversed_word += name[number]
	if reversed_word == name:
		return True
	return False

print(reversed_string("mummy wa"))

name = input("Enter a string: ")

reverse = reversed_string(name)

if(reverse):
	print("string is a palindrome")
else:
	print("string is not a palindrome")