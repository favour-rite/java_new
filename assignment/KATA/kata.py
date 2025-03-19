def get_isEven(number):
	number = [1,2,3,4,5]
	for number in number:
		if number % 2 == 0:
			return true
		else:
			return false


def get_isPrime(number):
	factors = 0
	for count in number:
		if number % count == 0:
			factors+=1
		
		if factors == 2:
			return true
		else:
			return false


def get_subtract(number1, number2):
	if number1 > number2:
		return number1 - number2
	else:
		return number2 - number1
		
	
def get_divide( number1,number2):
	if denominator == 0:

		return 0.0
	return numerator / denominator
print("The quotient: " )

	
def get_factors(number):
	count = 0
	for index in number:
           	 if number % index == 0:
                	count+=1
	return count


def get_isSquare(number):
	square = number * number
	return square
	
	
def get_isParlindrome(number):
	return str(number) == str (number)[:: - 1]

	number = int(input("Enter a number: "))

	result = is_palindrome(number)

	print("The palindrome number is: ", result)

	
def square(number):

	return number ** 2

number = int (input("Enter a number: "))

result = square(number)

print(f"The squared number is {number}: {result}")



def factor_of(integer):

	if integer <= 0:

		return 0

	factors = 0

	for number in range(1, integer + 1):
		if integer % number == 0:

			factors += 1
	return factors
print("The factor is: ",result)



def get_factorial(number):
	answer = 1

	for value in range(1, number + 1):

		answer *= value

	return answer

number = int(input("Enter a number: "))

result = factorial(number)

	


	
	
	