from arrayfunction import*
import get_largest_element


class test_largest_element(unittest.TestCase):
	def test_largest_element(self):
		number = [1,2,3,4,5]
		actual = get_largest_element.get_largest_element(number)
		expected = 5
		self.assertEqual(actual,expected)
		


	def test_that_the_prime_function_exist(self):
		palindromeprime.prime(345)
	
	def test_that_the_prime_number_function_determines_a_prime_number(self):
		self.assertIs(palindromeprime.prime(7), True)
		self.assertIs(palindromeprime.prime(4), False)
	
	