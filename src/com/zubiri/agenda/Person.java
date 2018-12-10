package com.zubiri.agenda;
import java.util.Random;

public class Person {
	
	private String name = "";
	private int age = 0;
	private int weight = 0;
	private String dni = "";
	
	public Person (String name, String dni){
		
		this.name = name;
		this.dni = dni;
		
	}
	
	public Person (String name, int age, int weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	public Person (String name, int age, int weight, String dni) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dni = dni;
		
	}
	
	public String getName() {
		
		return name;
		
    }

	public void setName(String name) {
		
		this.name = name;
		
	}

	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		
		if (age > 0 && age < 100) {
		
			this.age = age;
			
		}
		
	}

	public int getWeight() {
		
		return weight;
		
	}

	public void setWeight(int weight) {
		
		if (weight > 0 && weight < 200) {
		
			this.weight = weight;
		
		}	
			
	}

	public String getDNI() {
		
		return dni;
		
	}

	public void setDNI(String dni) {
		
		this.dni = dni;
		
	}
	
	/** @author Iosu If the weight of the person is between 50 and 90 is an ideal weight, if it's not, it's not ideal.
	 * 
	 * @return boolean
	 */
	
	public Boolean idealWeight() {
		
		if (weight > 50 && weight < 90) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	/** @author Iosu toString is going to return all the information of a person.
	 * 
	 * @return info 
	 */
	
	public String toString() {
		
		return "Name: " + name + ", Age: " + age + ", Weight: " + weight + ", DNI: " + dni;
		
	}
	
	/** @author Iosu If the person don't have saved its DNI, its DNI is going to be a default one.
	 * 
	 *  
	 */
	
	public void dniByDefault() {
		
		if (dni.matches("")) {
			
			String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
			
			Random surprise = new Random();
			
			int min = 00000000;
			
			int max = 99999999;
			
			this.dni = Integer.toString((int)Math.random() * ((max - min) + 1)) + abc.charAt(surprise.nextInt(abc.length()-1));
			
		}
		
	}
	
	/** @author Iosu If the age of the person is more than 17 is an adult, if it's not, it's not adult.
	 * 
	 * @return boolean 
	 */
	
	public Boolean isAdult() {
		
		if (age > 17) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
}