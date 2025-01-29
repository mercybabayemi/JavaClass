import java.util.Scanner;
public class Nokia{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Nokia menu\n1. Phonebook\n2. Messages\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM services");

	int answer = input.nextInt();

	switch(answer){
	case 1: System.out.println("Phonebook\n1. Search\n2. Service Nos\n3. Add name\n4. Erase \n5. Edit\n6. Assign tones\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags");
	int phoneBook = input.nextInt();
		switch(phoneBook){
		case 1: System.out.print("Search");
		break;
		case 2: System.out.print("Service NoS.");
		break;
		case 3: System.out.print("Add name");
		break;
		case 4: System.out.print("Erase");
		break;
		case 5: System.out.print("Edit");
		break;
		case 6: System.out.print("Assign tone");
		break;
		case 7: System.out.print("Send b'card");
		break;
		case 8: System.out.println("Options\n1. Type of view\n2. Memory status");
		int options = input.nextInt();
			switch(options){
			case 1: System.out.print("Type of view");
			break;
			case 2: System.out.print("Memory status");
			break;
			}
		break;
		case 9: System.out.print("Speed dials");
		break;
		case 10: System.out.print("Voice tags");
		break; 
		}
	break;
	case 2:  System.out.println("Messages\n1. Write message\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor");
	int messages = input.nextInt();
		switch(messages){
		case 1: System.out.print("Write messages");
		break;
		case 2: System.out.print("Inbox");
		break;
		case 3: System.out.print("Outbox");
		break;
		case 4: System.out.print("Picture messages");
		break;
		case 5: System.out.print("Templates");
		break;
		case 6: System.out.print("Smileys");
		break;
		case 7: System.out.println("Message Settings\n1. Set 1\n2. Common");
		int messageSettings = input.nextInt();
			switch(messageSettings){
			case 1: System.out.println("Set 1\n1.Message centre number \n2. Message sent as\n3. Message validity");
	int set1 = input.nextInt();
				switch(set1){
				case 1: System.out.print("Message centre number");
				break;
				case 2: System.out.print("Message sent as");
				break;
				case 3: System.out.print("Message validity");
				break;
				}
			break;
			case 2: System.out.println("Common\n1.Delivery report\n2. Reply via same centre\n3. Character support");
	int common = input.nextInt();
				switch(common){
				case 1: System.out.print("Delivery report");
				break;
				case 2: System.out.print("Reply via same centre");
				break;
				case 3: System.out.print("Character support");
				break;
				}
			break;
			}
		case 8: System.out.print("Info service");
		break;
		case 9: System.out.print("Voice mailbox number"); 
		break;
		case 10: System.out.print("Service command editor");
		break;
		}
	break;
	case 3: System.out.print("Chat");
	break;
	case 4: System.out.println("Call register\n1. Missed call\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration \n6. Show call cost\n7. Call cost settings\n8. Prepaid credit");
	int callRegister = input.nextInt();
		switch(callRegister){
		case 1: System.out.print("Missed calls");
		break;
		case 2: System.out.print("Received calls");
		break;
		case 3: System.out.print("Dialled numbers");
		break;
		case 4: System.out.print("Erase recent call lists");
		break;
		case 5: System.out.println("Show call duration\n1. Last call duration\n2. All calls' duration\n3. Received calls' duration\n4. Dialed calls' duration\n5. Clear timers");
		int showCallDuration = input.nextInt();
			switch(showCallDuration){
			case 1: System.out.print("Last call duration");
			break;
			case 2: System.out.print("All calls' duration");
			break;
			case 3: System.out.print("Received calls' duration");
			break;
			case 4: System.out.print("Dialed calls' duration");
			break;
			case 5: System.out.print("Clear timers");
			break;
			}
		break;
		case 6: System.out.println("Show call costs\n1. Last call cost\n2. All calls' cost\n3. Clear counters");
		int showCallCosts = input.nextInt();
			switch(showCallCosts){
			case 1: System.out.print("Last call cost");
			break;
			case 2: System.out.print("All calls' cost");
			break;
			case 3: System.out.print("Clear counters");
			break;
			}
		break;
		case 7: System.out.println("Call cost settings\n1. Call cost limits\n2. Show costs in");
		int callCostSettings = input.nextInt();
			switch(callCostSettings){
			case 1: System.out.print("Call cost limits");
			break;
			case 2: System.out.print("Show costs in");
			break;
			}
		break;
		case 8: System.out.print("Prepaid credit");
		break;
		}
		break;
 	case 5: System.out.println("Tones\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and games tones\n8. Vibrating alert\n9. Screen saver");
		int tones = input.nextInt();
		switch(tones){
		case 1: System.out.print("Ringing tone");
		break;
		case 2: System.out.print("Ringing volume");
		break;
		case 3: System.out.print("Incoming call alert");
		break;
		case 4: System.out.print("Composer");
		break;
		case 5: System.out.print("Message alert tone");
		break;
		case 6: System.out.print("Keypad tones");
		break;
		case 7: System.out.print("Warning and games tones");
		break;
		case 8: System.out.print("Vibrating alert");
		break;
		case 9: System.out.print("Screen saver");
		break;
		}
	break;
	case 6: System.out.println("Settings\n1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
	int settings = input.nextInt();
		switch(settings){
		case 1: System.out.println("Call settings\n1. Automatic redial\n2. Speed dialing\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer");
		int callSettings = input.nextInt();
			switch(callSettings){
			case 1: System.out.print("Automatic redial");
			break;
			case 2: System.out.print("Speed dialing");
			break;
			case 3: System.out.print("Call waiting options");
			break;
			case 4: System.out.print("Own number sending");
			break;
			case 5: System.out.print("Phone line in use");
			break;
			case 6: System.out.print("Automatic answer");
			break;
			}
		break;
		case 2: System.out.println("Phone settings\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions");
	int phoneSettings = input.nextInt();
			switch(phoneSettings){
			case 1: System.out.print("Language");
			break;
			case 2: System.out.print("Cell info display");
			break;
			case 3: System.out.print("Welcome note");
			break;
			case 4: System.out.print("Network selection");
			break;
			case 5: System.out.print("Lights");
			break;
			case 6: System.out.print("Confirm SIM service actions");
			break;
			}
		break;
		case 3: System.out.println("Security settings\n1. PIN code request\n2. Call barring service\n3. Fixed dialing\n4. Closed user group\n5. Phone security\n6. Change access codes");
	int securitySettings = input.nextInt();
			switch(securitySettings){
			case 1: System.out.print("PIN code request");
			break;
			case 2: System.out.print("Call barring service");
			break;
			case 3: System.out.print("Fixed dialing");
			break;
			case 4: System.out.print("Closed user group");
			break;
			case 5: System.out.print("Phone security");
			break;
			case 6: System.out.print("Change access codes");
			break;
			}
		break;
		case 4: System.out.print("Restore factory settings");
		break;
		}
	break;
	case 8: System.out.print("Games");
	break;
	case 9: System.out.print("Calculator");
	break;
	case 10: System.out.print("Reminders");
	break;
	case 11: System.out.println("Clock\n1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time");
	int clock = input.nextInt();
		switch(clock){
		case 1: System.out.print("Alarm clock"); 
		break;
		case 2: System.out.print("Clock settings");
		break;
		case 3: System.out.print("Date setting");
		break;
		case 4: System.out.print("Stopwatch");
		break;
		case 5: System.out.print("Countdown timer");
		break;
		case 6: System.out.print("Auto update of date and time");
		break;
		}
	break;
	case 12: System.out.print("Profiles");
	break;
	case 13: System.out.print("SIM services");
	break;


 

	}
} 
}