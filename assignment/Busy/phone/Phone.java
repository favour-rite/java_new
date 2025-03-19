public class Phone {

    static Scanner userInput = new Scanner(System.in);
    static List<Contact> contacts = new ArrayList<>();  
    public static void main(String[] args) {
        while (true) {  
            System.out.println("""
                    ====================
                    1. Add Contact
                    2. Search by Name
                    3. Delete Contact
                    4. Display Contacts
                    5. Dial Contact
                    6. Exit
                    ====================
            """);

            System.out.print("Enter your choice: ");
            int choice = userInput.nextInt();  

          
            if (choice == 1) {
                addContact();
            } else if (choice == 2) {
                searchByName();
            } else if (choice == 3) {
                deleteContact();
            } else if (choice == 4) {
                displayContacts();
            } else if (choice == 5) {
                dialContact();
            } else if (choice == 6) {
                System.out.println("Exiting program...");
                break;  
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

   
    static class Contact {
        String name;
        String phoneNumber;

	Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

   
    public static void addContact() {
        System.out.print("Enter phone number: ");
        String phoneNumber = userInput.nextLine();

            if (phoneNumber.length() != 11 || !phoneNumber.matches("\\d+")) {
            System.out.println("Invalid phone number. It should be exactly 11 digits.");
          
        }

        System.out.print("Enter name: ");
        String name = userInput.nextLine();

          contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added successfully.");
    }

 
    public static void searchByName() {
        System.out.print("Enter name to search: ");
        String name = userInput.nextLine();


        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.name.equalsIgnoreCase(name)) {  

                System.out.println("Found: " + contact.name + " : " + contact.phoneNumber);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = userInput.nextLine();

          boolean found = false;
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.name.equalsIgnoreCase(name)) {
                iterator.remove();  
                System.out.println("Contact deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    
    public static void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.println("Contacts List:");
        for (Contact contact : contacts) {
            System.out.println(contact.name + " : " + contact.phoneNumber);
        }
    }


    public static void dialContact() {
        System.out.print("Enter name to dial: ");
        String name = userInput.nextLine();

        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.name.equalsIgnoreCase(name)) {
                System.out.println("Dialing " + contact.name + " : " + contact.phoneNumber);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}