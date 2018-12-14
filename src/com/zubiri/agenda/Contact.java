package com.zubiri.agenda;
import java.util.ArrayList;

public class Contact {
	
	private Person person;
	private int phone = 000000000;
	private String address = "";
	private boolean fav = false;
	private ArrayList<Notes> notes = new ArrayList<Notes>();
	
	public Contact (Person person, int phone, String adress) {
		
		this.person = person;
		this.phone = phone;
		this.address = adress;
		
	}
	
	public Person getPerson() {
		
		return person;
		
	}
	
	public void setPerson(Person person) {
		
		this.person = person;
		
	}
	
	public int getPhone() {
		
		return phone;
		
	}
	
	public void setPhone(int phone) {
		
		this.phone = phone;
		
	}
	
	public String getAddress() {
		
		return address;
		
	}
	
	public void setAddress(String address) {
		
		this.address = address;
		
	}
	
	public boolean getFav() {
		
		return fav;
		
	}
	
	public void setFav(boolean fav) {
		
		this.fav = fav;
		
	}
	
	public ArrayList getNotes() {
		
		return notes;
		
	}
	
	public void setNotes(ArrayList notes) {
		
		this.notes = notes;
		
	}
	
	/** @author Iosu 
	 * A method to see data
	 * 
	 * @return info
	 */
	
	public String toString2() {
		
		return ", Phone: " + phone + ", Address: " + address + ".";
		
	}
	
	/*
	public void addAL(Notes note) {
		
		notes.add(note);
		
	}
	*/
	
}