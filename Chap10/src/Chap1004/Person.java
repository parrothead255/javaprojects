package Chap1004;

public class Person {
	private int age;
	public Person(int age) {
		System.out.println("Person Constructor");
		this.age=age;
	}
	public int getAge() {
		return age;
	}
}

