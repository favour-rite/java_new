import java.util.Arraylist;

public class Account{

	private String name;
	private String lastName;
	private String pin;
	private int accountBalance;
	

	public void setName(StringName){
		this.name = name;
		this.pin = pin;

	}
	public String getName(){
	return name;
	
	      this.pin = pin;
    }
    public static void createAccount(ArrayList<Account> account) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your 4 digit pin ");
        int pin = input.nextInt();

        Account contact = new Account(firstName, lastName, pin);
        account.add(contact);

        System.out.println("Account added successfully!");
    }
}


	
	}
	
}