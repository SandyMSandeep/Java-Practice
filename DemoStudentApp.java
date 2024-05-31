package com.personal.demo;
import java.util.Scanner;
 class DemoStudentApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter place:");
		String place=sc.next();
		System.out.println("Enter gender:");
		char gender=sc.next().charAt(0);
		System.out.println("Enter marks:");
		Float marks=sc.nextFloat();
		
		Student s1 = new Student(name,age,id,place,gender,marks);
		System.out.println(s1.name+" "+s1.age+" "+s1.id+" "+s1.place+" "+s1.gender+" "+s1.marks);
	}

}
