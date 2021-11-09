package com.qa.community;

public class GettersSettersTask {

	private float balance = 1209.56F;
	private String firstName = "Harry";
	private String lastName = "Emmett";
	private int age = 27;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public GettersSettersTask() {
	}

	public GettersSettersTask(float balance, String firstName, String lastName, int age) {
		super();
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void nameBalance() {
		System.out.println("Name: " + firstName + "  " + lastName + " Balance: " + balance);
	}


}
