
number = [2,4,6,16]
for count in number:
	count = count ** 2
	print(count)

number = [8,56,34.10]
for count in number:
	if count > 10:
		print (count)
def get_number_multiple(number):
	return[number for number in range (1, number + 1)]
def get_number_greater_than_10(number):
	return[count for count in number if count > 10 ]