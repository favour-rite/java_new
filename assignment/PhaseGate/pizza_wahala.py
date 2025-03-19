import math

print(" Iya Abimbola Pizza joint Yaba ")

orders = int(input(" Enter number of guests that will attend the birthday party: "))

pizza_sizes = (input("""  
	_________________________________________________________
	|pizza type 	|Number of Slices	|Price perbox 	|
	|_______________________________________________________|
	|sapa size	|	4		|	2,000   |
	|_______________________________________________________|
	|small money	|	6		|	2,400   |
	|_______________________________________________________|
	|big boys	|	8		|	3000    |
	|_______________________________________________________|
	|odogwu: 	|	12		|	4,200   |
	|_______________________________________________________|

		Enter pizza type you want to buy: 
	"""))


price_per_box = 0
number_of_slices = 0

if pizza_sizes == "sapa size":
	number_of_slices = 4
	prices_per_box = 2000

elif pizza_sizes == "small money":
	number_of_slices = 6
	prices_per_box = 2400

elif pizza_sizes == "big boys":
	number_of_slices = 8
	prices_per_box = 3000

elif pizza_sizes == "odogwu":
	number_of_slices = 12
	prices_per_box = 4200

number_of_boxes = math.ceil(orders/ number_of_slices)
left_over = (number_of_boxes * number_of_slices) - orders
total_prices = number_of_boxes * prices_per_box

print("Number of pizza to buy: " ,number_of_boxes, " boxes")
print("Number of left_over: " , left_over , " slices")
print("Price: " , total_prices)