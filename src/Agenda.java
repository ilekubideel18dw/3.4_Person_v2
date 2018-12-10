import java.util.ArrayList;

public class Agenda {
		
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	/** @author Iosu An index to link a person with a phone and an address with the position.
	 * 
	 * @param data
	 * @return An index
	 */
	
	int index = 0;
		
	private int Index(String data) {
			
		for (int x = 0; x < contacts.size(); x++) {
				
			if (contacts.get(x).getPerson().getName().matches(data)) {
					
				index = x;
				
			}
			
		}

		return index;
		
	}
	
	/** @author Iosu A method to take the information in the index
	 * 
	 * @param index
	 * @return contact from the index
	 */
	
	public Contact takeContact(int index) {
		
		 
		return contacts.get(index);

	}
	
	/** @author Iosu A method to find a contact with an index
	 * 
	 * @param data
	 * @return An index
	 */
	
	public int find(String data) {
		
		return Index(data);
			
	}
	
	/** @author Iosu A method to view the information of one contact.
	 * 
	 *  @param data
	 *  @return Return the information about a contact
	 */
		
	public String viewData(String data) {
			
		return contacts.get(Index(data)).getPerson().toString() + contacts.get(Index(data)).toString2();
		
	}
	
	/** @author Iosu A method to add new contact.
	 * 
	 * @param data
	 */
		
	public void addData(Contact data) {
			
		contacts.add(data);
			
	}
	
	/** @author Iosu A method to delete a contact.
	 * 
	 * @param data
	 */
		
	public void deleteData(String data) {
			
		contacts.remove(Index(data));
			
	}
	
	/** @author Iosu A method to modify the information about a contact.
	 * 
	 * @param contact
	 * @param index
	 */
		
	public void modifyData(Contact contact, int index) {
		
		contacts.set(index, contact);
		
	}
	
}