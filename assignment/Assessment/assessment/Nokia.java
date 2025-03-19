import java.util.Scanner;
public class Nokia{
	public static void main(String[] args){

System.out.println("Welcome to your Nokia phone\n List of menu functions\n1 ->Phone book\n 2->Messages\n 3->Chat\n 4->Call register\n 5->Tones\n 6->Settings\n 7->Call divert\n 8->Games\n 9->Calculator\n 10->Reminders\n 11->Clock\n 12->Profiles\n 13->SIM services\n "); 

System.out.println("menu");

Scanner input=new Scanner(System.in);
System.out.println("Input a number");
int choice =input.nextInt();

switch (choice) {
case 1:
	System.out.println("Phone book\n 1: Search\n 2: Service Nos.\n 3: Add name\n 4: Erase\n 5: Edit\n 6: Assign tone\n 7: Send b'card\n 8: Options\n 9: Speed dials\n 10: Voice tags ");

System.out.println("phone book");
Scanner menu = new Scanner(System.in);
System.out.println("Input a number:");
int Phonebook = input.nextInt();


switch (Phonebook) {
	case 1:
		System.out.println("1:Search"); 
			break;
	case 2:
		System.out.println("2:Service Nos");
			 break;
	case 3:
		System.out.println("3:Add Name");
			 break;
	case 4:
		System.out.println("4:Erase"); 
			break;
	case 5:
		System.out.println("5:Edit");
			 break;
	case 6:
		System.out.println("6:Assign Tone");
			 break;
	case 7:
		System.out.println("7:Send b'card"); 
			break;
	case 8:
		System.out.println("Options\ninput an option\n 1. Types of view\n 2. Memory status");
			Scanner Input = new Scanner(System.in);
			int Options =Input.nextInt();
			switch(Options) {
		case 1:
		System.out.println("Types Of View");
			 break;
		case 2:
		System.out.println("Memory Status");
			 break;
			}
			break;
	case 9:
		System.out.println("Speed Dials"); 
			break;
	case 10:
		System.out.println("Voice Tags"); 
			break;

	default: System.out.print(" Invalid ");
			break;

		}
		
			break;
	case 2:
		System.out.println("Messages\n1:Write messages\n2:Inbox\n3:Outbox\n4:Picture messages\n5:Templates\n6:Smileys\n7:Message settings\n8:Info service\n9:Voice mailbox number\n10:Service command editor");

System.out.println("messsages");
Scanner map = new Scanner(System.in);
System.out.println("Input a number:");
int Messages = map.nextInt();

switch (Messages) {

	case 1:
		System.out.println("Write messages"); 
			break;
	case 2:
		System.out.println("Inbox");
			 break;
	case 3:
		System.out.println("Outbox");
			 break;
	case 4:                                    
		System.out.println("Picture messages"); 
			break;
	case 5:
		System.out.println("Templates");
			 break;
	case 6:
		System.out.println("Smileys");
			 break;
	case 7:
System.out.println("Message settings"); 
System.out.println("input a number");
System.out.println("1.Set 1");
System.out.println("2.Common");

Scanner submenu = new Scanner(System.in);
int MessagesSettings = submenu.nextInt();
switch(MessagesSettings){
	case 1:
		System.out.println("Input an Options:");
		System.out.println("1.Message Centre Number");
		System.out.println("2.Message Sent As");
		System.out.println("3.Message Validity");

		Scanner menumap = new Scanner(System.in);
		int menumapnumber = menumap.nextInt();
		switch(menumapnumber){
	case 1:	
		System.out.println("Message Centre Number"); 
			break;
	case 2:
		System.out.println("Message Sent As");
			 break;
	case 3:
		System.out.println("Message Validity"); 
			break;
}
			break;
	case 2:
		System.out.println("Common");
		System.out.println("Input a number:");
		System.out.println("1.Delivery Reports");
		System.out.println("2.Reply Via Same Centre");
		System.out.println("3.Character Support");

		Scanner menumap2 = new Scanner(System.in);
		int menumapnumber2 = menumap2.nextInt();
		switch (menumapnumber2) {
	case 1:	
		System.out.println("Delivery Reports");
			 break;
	case 2:
		System.out.println("Reply Via Same Centre");
			 break;
	case 3:
		System.out.println("Character Support");
			 break;
}

			break;
} 
			break;

	case 8:
		System.out.println("Info sevice");
			break;
	case 9:
		System.out.println("Voice mailbox number");
			break;
	case 10:
		System.out.println("Service command editor");
			break;
		default: System.out.print(" Invalid ");
}
			break;
	

	case 3:
		System.out.println("Chat");
			break;
		
	case 4:
		System.out.println(" call register/n 1: missed calls/n 2: received calls/n 3: Dialled number/n 4: Erase recent call lists/n 5: Show call duration/n 6: Show call costs/n 7: call cost settings/n 8: prepaid credit ");

	System.out.println("callregister");
	Scanner calls = new Scanner(System.in);
	System.out.println("Input a number:");
	int callregister = calls.nextInt();

	switch (callregister) {

		case 1:	
			System.out.println("missed calls");
				break;
		case 2:
			System.out.println("received calls");
				break;
		case 3:
			System.out.println("dialled numbers");
				break;
		case 4:
			System.out.println("erase recent call lists");

				break;
		case 5:
			System.out.println("1. last call duration/n 2. All calls'duration/n 3. Received calls'duration/n 4. dialled calls duratio/n  5. clear timers ");

	System.out.println("Call duration");
	Scanner call = new Scanner(System.in);
	System.out.println("Input a number");
	int showcallduration = call.nextInt();

	switch (showcallduration) {

		case 1:	
			System.out.println("last call duration");
				break;
		case 2:
			System.out.println("all calls'duration");
				break;
		case 3:
			System.out.println("received calls'duration");
				break;
		case 4:
			System.out.println("dialled calls'duration");
				break;
		case 5:
			System.out.println("clear timers");
				break;			
}
				break;
		case 6:
			System.out.println(" last call cost/n 2. All calls'cost /n3. Clear counters ");

System.out.println("call cost");
	Scanner cost = new Scanner(System.in);
	System.out.println("Input a number");
	int ShowCallCost = cost.nextInt();

	switch (ShowCallCost) {
	
		case 1: 
			System.out.println("Last call cost");
				break;
		case 2:
			System.out.println("All calls'cost");
				break;
		case 3:
			System.out.println("Clear counters");
}
				break;
		case 7: 
			System.out.println("call costs settings\n 1.call cost limit\n 2.show costs in");
System.out.println("cost settings");
	Scanner costs = new Scanner(System.in);
	System.out.println("Input a number");
	int CallCostSettings = costs.nextInt();

	switch (CallCostSettings) {

		case 1:
			System.out.println("1:Call cost limit");
				break;
		case 2:
			System.out.println("2:Show costs in");
}
				break;
		case 8:
			System.out.println("3:Prepaid credit");
				break;

		default: System.out.print(" Invalid ");
				break;

}
			break;
}switch (choice) {
    case 5:
        System.out.println("Tones");
        System.out.println("1. Ringing tone\n 2. Ringing volume\n 3. Incoming call alert\n 4. Composer\n 5. Message alert tone\n 6. Keypad tones\n 7. Warning and game tones\n 8. Vibrating alert\n 9. Screen saver");

        Scanner tone = new Scanner(System.in);
        System.out.println("Input a number");
        int tones = tone.nextInt();
        switch (tones) {
            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("Incoming Call Alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message Alert Tone");
                break;
            case 6:
                System.out.println("Keypad Tones");
                break;
            case 7:
                System.out.println("Warning And Game Tones");
                break;
            case 8:
                System.out.println("Vibrating Alert");
                break;
            case 9:
                System.out.println("Screen Saver");
                break;
        }
        break;
    case 6:
        System.out.println("Call Settings");
        System.out.println("1. Automatic redial\n 2. Speed dialling\n 3. Call waiting options\n 4.Own number sending\n 5. Phone line in use\n 6. Automatic answer");

        Scanner caller = new Scanner(System.in);
        System.out.println("Input a number");
        int call = caller.nextInt();
        switch (call) {
            case 1:
                System.out.println("Automatic redial");
                break;
            case 2:
                System.out.println("Speed dialling");
                break;
            case 3:
                System.out.println("Call waiting options");
                break;
            case 4:
                System.out.println("Own number sending");
                break;
            case 5:
                System.out.println("Phone line in use");
                break;
            case 6:
                System.out.println("Automatic answer");
                break;
        }
        break;
    case 7:
        System.out.println("Call divert");
        break;
    case 8:
        System.out.println("Games");
        break;
    case 9:
        System.out.println("Calculator");
        break;
    case 10:
        System.out.println("Reminder");
        break;
	default: System.out.print(" Invalid ");
		break;

    case 11:
        System.out.println("Clock");
        System.out.println("1. Alarm clock\n 2. Clock settings\n 3. Date setting\n 4. Stopwatch\n 5. Countdown timer\n 6. Auto update of date and time");

        Scanner alarm = new Scanner(System.in);
        System.out.println("Input a number");
        int clock = alarm.nextInt();

        switch (clock) {
            case 1:
                System.out.println("Alarm Clock");
                break;
            case 2:
                System.out.println("Clock Setting");
                break;
            case 3:
                System.out.println("Date Setting");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown Timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
	   default: System.out.print(" Invalid ");

        } 
        break;
    case 12:
        System.out.println("Profiles");
        break;
    case 13:
        System.out.println("Sim Services");
        break;
		}
	}
}