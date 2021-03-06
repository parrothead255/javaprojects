package Chap1004;

public class Student extends Person {
	private int grade;
	public Student(int grade,int age) {
		super(age);
		System.out.println("Student Constructor");
		this.grade=grade;
		
	}
	public int getGrade() {
		return grade;
	}
}

