import unittest
from test import User

class TestUser(unittest.TestCase):
    def test_user_name(self):
        user = User("Favour")
        self.assertEqual(user.get_name(), "Favour")
    def test_user_age(self):
        user = User("Favour", 23)
        self.assertEqual(user.get_age(), 23)
        