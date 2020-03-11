package javatutorial.class7to8;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 11, 2020 10:55:35 AM
* 
* a first class
* 
*/
public class Person {
	// fields
	private String name;
	private String email;
	private String phoneNumber;
	private int age;
	
	
	public Person(String name, String email, String phoneNumber, int age) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	public void study(String course) {
		System.out.println(name + " is studying " + course);
	}
	
	public void work(String topic) {
		System.out.println(name + " is working on " + topic);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
