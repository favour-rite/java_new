import unittest
import get_vowel_letters


class test_vowel_(unittest.TestCase):



	def test_vowel_letter_to_return_number(self):

		actual = get_vowel_letters.get_vowel_letters(self)
		expected = 4
		self.assertEqual(actual, expected)
