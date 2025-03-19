import unittest
import kata

class test_get_isEven (unittest.TestCase):
	def test_get_isEven(self):

		number = [1,2,3,4,5]
		
		actual = kata.get_isEven(self)
		expected = 5
		self.assertEqual(actual,expected)