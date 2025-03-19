import TestCase
import kata

class test_largest_element (unittest.TestCase):
	def test_largest_element(self):

		number = [1,2,3,4,5]
		
		actual = get_isEven.get_isEven(self)
		expected = 5
		self.assertEqual(actual,expected)