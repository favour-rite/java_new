import string
contacts = []

def main():

	
	print("""
		====================

		1. Add Contact
		2. Search by Name
		3. Delete Contact
		4. Display Contacts
		5. Dial Contact
		6. Exit

		===================
		""")
	choice = int(input("Enter your choice: "))

	if choice == 1:
		add_contact()

	elif choice == 2:
		search_by_name()

	elif choice == 3:
		delete_contact()

	elif choice == 4:
		display_contacts()

	elif choice == 5:
		dial_contact()

	elif choice == 6:
		exit_program = True
	
	else :
		print("Invalid option. try again")
		main()


def add_contact():

	phone_number = input("Enter phone number: ")
	if len(phone_number) > 11 or len(phone_number) < 11:
		print("Invalid number")
		main()

	alpha = string.ascii_lowercase
	for char in alpha:
		if phone_number.__contains__(char):
			print("Invalid number")
			main()
	letters = string.ascii_uppercase
	for char in letters:
		if phone_number.__contains__(char):
			print("Invalid number")
			main()
		else:
			name = input("Enter name: ")
			contacts.append({"name": name , "phone number": phone_number})
			print("contact added successfully")
			main()

def search_by_name():

	name = input("Enter name to search: ")

	for contact in contacts:

		if contact["name"] == name:
			print(" Search Results ")
			print(contact)
		else:
			print(" Contact not found!!! ")
	main()

def delete_contact():
	name = input("Enter name to delete: ")

	for contact in contacts:
		if contact["name"] == name:
			contacts.remove(contact)
			print(" deleted successfully... ")
		else:
			print(" not found... ")
	main()

def dial_contact():

	name = input("Enter name to dial: ")
	for contact in contacts:
		if contact["name"] == name:
        		print(f"Dialing {contact["name"]} :{contact["phone number"]}")
		else:
        		print(f"Contact '{name}' not found.")
	main()

def display_contacts():

	for contact in contacts:
		print(f"{contact["name"]} : {contact["phone number"]}")
	main()

main()

