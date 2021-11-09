package com.qa.community;

public class runner {

	public static void main(String[] args) {

		GettersSettersTask harry = new GettersSettersTask();

		// getters setters in runner
		System.out.println(harry.getBalance());
		System.out.println(harry.getFirstName());
		System.out.println(harry.getLastName());
		System.out.println(harry.getAge());

		// added new person to the bank
		GettersSettersTask James = new GettersSettersTask(33.77F, "James", "Smith", 35);
		System.out.println(James.getBalance());
		System.out.println(James.getAge());

		// static and non static method in class
		James.nameBalance();
		harry.nameBalance();

		greet("Harry");
	}

	public static void greet(String staticname) {
		System.out.println("Hello " + staticname);

	}

}
