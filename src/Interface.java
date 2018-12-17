import java.util.Scanner;
import java.util.ArrayList;

import com.zubiri.agenda.Agenda;
import com.zubiri.agenda.Contact;
import com.zubiri.agenda.Notes;
import com.zubiri.agenda.Person;

public class Interface {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Agenda myContacts = new Agenda();
		
		ArrayList<String> notes = new ArrayList<String>();
		
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
			System.out.println("7.- Add a note to a contact.");
			System.out.println("8.- Delete a note.");
			System.out.println("9.- View a contacts notes.");
			System.out.println("10.- Add a contact to favorite list.");
			System.out.println("11.- Delete a contact from favorite list.");
			System.out.println("12.- See a contact is favorite or not.");
			System.out.println("13.- View all contacts of the agenda ordered alphabetically.");
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
				notes.add(sc.next());
				
				noteContact.setNotes(notes);
				
				myContacts.modifyContact(noteContact, myContacts.index(noteName));
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue7 = sc.nextInt();
        		if (continue7 < 1) {
        			loop = 1;
        		}
				break;
				
			case 8: // Delete notes
				
				System.out.println("To which contact do you want to add a note?");
				String delNoteName = sc.next();
				Contact delNoteContact = myContacts.takeContact(myContacts.index(delNoteName));
				
				System.out.println("The note of what position do you want to delete?");
				notes.remove(sc.nextInt() + 1);
				
				myContacts.modifyContact(delNoteContact, myContacts.index(delNoteName));
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue8 = sc.nextInt();
        		if (continue8 < 1) {
        			loop = 1;
        		}
				break;
				
			case 9:	// View notes.
				
				String notesFrom = sc.next();
				myContacts.viewNotes(notesFrom);
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue9 = sc.nextInt();
        		if (continue9 < 1) {
        			loop = 1;
        		}
				break;
				
			case 10: // Add favorite
				
				System.out.println("Enter the name of the contact you want to add to favorites:");
				String favName = sc.next();
				Contact modifiedFav = myContacts.takeContact(myContacts.index(favName));
				modifiedFav.setFav(true);
				
				myContacts.modifyContact(modifiedFav, myContacts.index(favName));
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue10 = sc.nextInt();
        		if (continue10 < 1) {
        			loop = 1;
        		}
				break;
				
			case 11: // Delete favorite
				
				System.out.println("Enter the name of the contact you want to add to favorites:");
				String notFavName = sc.next();
				Contact modifiedNotFav = myContacts.takeContact(myContacts.index(notFavName));
				modifiedNotFav.setFav(false);
				
				myContacts.modifyContact(modifiedNotFav, myContacts.index(notFavName));

				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue11 = sc.nextInt();
        		if (continue11 < 1) {
        			loop = 1;
        		}
				break;
				
			case 12: // View favorite
				
				System.out.println("Enter a name to see its favorite or note:");
				String favorite = sc.next();
				
				myContacts.isFav(favorite);

				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue12 = sc.nextInt();
        		if (continue12 < 1) {
        			loop = 1;
        		}
				break;
				
			case 13: // All contacts ordered alphabetically	
				
				System.out.println("These are all the contact you have in your agenda:");
				
				
				
				// Another option?
				System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
        		int continue13 = sc.nextInt();
        		if (continue13 < 1) {
        			loop = 1;
        		}
				break;
			
			default:
				
				System.out.println("You don't enter a valid option, please try again.");
				break;
				
			}
			
		}
		
		System.out.println("Thank you! Bye!");
		
	}
	
}