import java.util.Scanner;

import com.zubiri.agenda.Agenda;
import com.zubiri.agenda.Contact;
import com.zubiri.agenda.Notes;
import com.zubiri.agenda.Person;

public class Interface {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Agenda myContacts = new Agenda();
		
		int loop = 0;
		
		while (loop != 1) {
			
			// Menu.
			System.out.println("Welcome to your agenda!");
			System.out.println("You can view, add, delete & modify contacts.");
			System.out.println("Select an option:");
			System.out.println("1.- View a contact.");
			System.out.println("2.- Add a new contact.");
			System.out.println("3.- Delete a contact.");
			System.out.println("4.- Delete all contacts.");
			System.out.println("5.- Modify a contact.");
			System.out.println("6.- See how many contacts are in the agenda.");
			System.out.println("0.- Exit.");
			
			int option = sc.nextInt();
			
			switch (option) { 
			
			case 0: // Exit.
				
				loop = 1;
				
				break;
			
			case 1: // View data.
				
				String view = sc.next();
				myContacts.viewContact(view);
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue1 = sc.nextInt();
        		if (continue1 < 1) {
        			loop = 1;
        		}
				break;
				
			case 2: // Add new data.
				
				System.out.println("Name:");
				String name = sc.next();
				
				System.out.println("Age:");
				int age = sc.nextInt();
				
				System.out.println("Weight:");
				int weight = sc.nextInt();
				
				System.out.println("DNI:");
				String dni = sc.next();
				
				System.out.println("Phone:");
				int phone = sc.nextInt();
				
				System.out.println("Address:");
				String address = sc.next();
				
				Person person = new Person(name, age, weight, dni);
				Contact contact = new Contact(person, phone, address);
				
				myContacts.addContact(contact);
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue2 = sc.nextInt();
        		if (continue2 < 1) {
        			loop = 1;
        		}
				break;
				
			case 3: // Delete data.
				
				String delete = sc.next();
				myContacts.deleteContact(delete);
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue3 = sc.nextInt();
        		if (continue3 < 1) {
        			loop = 1;
        		}
				break;
				
			case 4: // Modify data.
				
				System.out.println("Enter the name of the contact you want to modify");
				String data = sc.next();
				Contact modifiedData = myContacts.takeContact(myContacts.index(data));

				System.out.println("What do you want to change?");
				System.out.println("Enter an option:");
				System.out.println("1.- Name");
				System.out.println("2.- Age");
				System.out.println("3.- Weight");
				System.out.println("4.- DNI");
				System.out.println("5.- Phone");
				System.out.println("6.- Address");
				
				int modifyOption = sc.nextInt();
				
				switch (modifyOption) {
				
					case 1:
						
						System.out.println("Enter a new name:");
						modifiedData.getPerson().setName(sc.next());
						System.out.println("New name: " + modifiedData.getPerson().getName() + ".");
						break;
						
					case 2:
						
						System.out.println("Enter a new age:");
						modifiedData.getPerson().setAge(sc.nextInt());
						System.out.println("New age: " + modifiedData.getPerson().getAge() + ".");
						break;
						
					case 3:
						
						System.out.println("Enter a new weight:");
						modifiedData.getPerson().setWeight(sc.nextInt());
						System.out.println("New weight: " + modifiedData.getPerson().getWeight() + ".");
						break;
						
					case 4:
						
						System.out.println("Enter a new DNI:");
						modifiedData.getPerson().setDNI(sc.next());
						System.out.println("New DNI: " + modifiedData.getPerson().getDNI() + ".");
						break;
						
					case 5:
						
						System.out.println("Enter a new phone:");
						modifiedData.setPhone(sc.nextInt());
						System.out.println("New phone: " + modifiedData.getPhone() + ".");
						break;
						
					case 6:
						
						System.out.println("Enter a new address:");
						modifiedData.setAddress(sc.next());
						System.out.println("New address: " + modifiedData.getAddress() + ".");
						break;
				
				}
				
				myContacts.modifyContact(modifiedData, myContacts.index(data));
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue4 = sc.nextInt();
        		if (continue4 < 1) {
        			loop = 1;
        		}
				break;
				
			case 5: // Delete all

				myContacts.deleteAllContacts();
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue5 = sc.nextInt();
        		if (continue5 < 1) {
        			loop = 1;
        		}
				break;	
				
			case 6: // Contacts quantity

				System.out.println("Your agenda has " + myContacts.dataSize() + " contacts.");
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue6 = sc.nextInt();
        		if (continue6 < 1) {
        			loop = 1;
        		}
				break;	
			
			case 7: // Add notes
				
				System.out.println("To which contact do you want to add a note?");
				String noteName = sc.next();
				Contact noteContact = myContacts.takeContact(myContacts.index(noteName));
				
				System.out.println("Note:");
				String note = sc.next();
				
				//modifiedData.getPerson().setName(sc.next());
				//myContacts.addNotes(noteContact, note);
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue7 = sc.nextInt();
        		if (continue7 < 1) {
        			loop = 1;
        		}
				break;
				
			case 8: // Add favorite
				
				System.out.println("Enter the name of the contact you want to add to favorites:");
				String favName = sc.next();
				Contact modifiedFav = myContacts.takeContact(myContacts.index(favName));
				modifiedFav.setFav(true);
				break;
				
			case 9: // Delete favorite
				
				System.out.println("Enter the name of the contact you want to add to favorites:");
				String notFavName = sc.next();
				Contact modifiedNotFav = myContacts.takeContact(myContacts.index(notFavName));
				modifiedNotFav.setFav(false);
				break;
				
			case 10: // View favorite
				
				System.out.println("Enter a name to see its favorite or note:");
				String favorite = sc.next();
				break;
			
			default:
				
				System.out.println("You don't enter a valid option, please try again.");
				break;
				
			}
			
		}
		
		System.out.println("Thank you! Bye!");
		
	}
	
}