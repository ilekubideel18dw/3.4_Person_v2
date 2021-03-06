package com.zubiri.agenda;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Agenda {
		
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	/** @author Iosu 
	 * An index to link a person with a phone and an address with the position.
	 * 
	 * @param name
	 * @return An index
	 */
		
	public int index(String name) {
		
		int index = 0;
			
		for (int x = 0; x < contacts.size()-1; x++) {
				
			if (contacts.get(x).getPerson().getName().matches(name)) {
					
				index = x;
				break;
				
			}
			
		}

		return index;
		
	}
	
	/** @author Iosu 
	 * A method to take the information in the index
	 * 
	 * @param index
	 * @return contact from the index
	 */
	
	public Contact takeContact(int index) {
		
		 
		return contacts.get(index);

	}
	
	/** @author Iosu 
	 * A method to view the information of one contact.
	 * 
	 *  @param data
	 *  @return Return the information about a contact
	 */
		
	public String viewContact(String name) {
			
		return contacts.get(index(name)).getPerson().toString() + contacts.get(index(name)).toString2();
		
	}
	
	/** @author Iosu 
	 * A method to add new contact.
	 * 
	 * @param data
	 */
		
	public void addContact(Contact contact) {
			
		contacts.add(contact);
			
	}
	
	/** @author Iosu 
	 * A method to delete a contact.
	 * 
	 * @param data
	 */
		
	public void deleteContact(String name) {
			
		contacts.remove(index(name));
			
	}
	
	/** @author Iosu 
	 * A method to modify the information about a contact.
	 * 
	 * @param contact
	 * @param index
	 */
		
	public void modifyContact(Contact contact, int index) {
		
		contacts.set(index, contact);
		
	}
	
	/** @author Iosu 
	 * A method to delete all the information in the agenda.
	 * 
	 */
	
	public void deleteAllContacts() {
		
		contacts.clear();
		
	}
	
	/** @author Iosu
	 * A method to see how many contacts are in your agenda.
	 * 
	 * @return The quantity of contacts.
	 */
	
	public int dataSize() {
		
		return contacts.size();
		
	}
	
	/** @author Iosu
	 * A method to add notes to your contacts.
	 * 
	 * @param note
	 */
	
	/*
	
	public void addNotes(Contact note) {
		
		contacts.add(note);
			
	}
	
	public void deleteNotes(Contact note) {
		
		
		
	}
	
	*/
	
	/** @author Iosu
	 * A method to see a contact is favorite or not.
	 * 
	 * @param name
	 * @return A contact is in your favorite list or not.
	 */
	
	public String isFav(String name) {
		
		if (contacts.get(index(name)).getFav() == true) {
		
			return "This contact is in your favorite list";
		
		}
		
		else {
			
			return "This contact is not in your favorite list";
			
		}
		
	}
	
	public ArrayList viewNotes(String name) {
		
		return contacts.get(index(name)).getNotes();
		
	}
	
	public String orderedList() {
		
		Collections.sort(contacts);
		
		for(Contact aux: contacts){
            System.out.println(aux);
        }
		
		// https://www.javamexico.org/blogs/nomarlegnar/ordenar_un_listltgt_arraylist_de_objetos
		// http://www.forosdelweb.com/f45/como-ordenar-arraylist-objetos-914181/
		// https://programacion.net/articulo/ordenar_alfabeticamente_un_array_de_textos_con_java_1178
		
		return "a";
		
	}
	
}