import unittest
import get_sum_whole_number

class Testletter(unittest.TestCase):

	def test_that_get_sum(self):

		number = 12345
		actual = get_sum_whole_number.get_sum_whole_number(number)
		expected = 15
		self.assertEqual(actual, expected)
		
	



if __name__ == "__main__":
	unittest.main()


	


