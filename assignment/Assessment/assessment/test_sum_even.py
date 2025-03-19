import unittest
import get_ sum_even_number


class test_ sum_even_number(unittest.TestCase):

	def  test_ sum_even_exist(self):
		number = [1,2,4,5,6]
		test_ sum_even.get_sum_even_()
	
	def test_sum_exist(self):

		actual = get_sum_even.get_sum_even([12,7,10])
		expected = (22)

		self.assertEqual(actual, expected)



