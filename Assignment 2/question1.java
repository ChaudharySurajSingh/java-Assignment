/*Q1 - Input name, roll number and field of interest from user and print in the format below :
Name: xyz, Roll number: xyz, Field of interest: xyz*/

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name; int rollNo;String fieldOfInterest;
		System.out.println("please enter your name:");
		name = scn.nextLine();
		System.out.println("enter your field of intrest:");
		fieldOfInterest = scn.nextLine();
		System.out.println("please enter your roll no:");
		rollNo = scn.nextInt();
		scn.close();
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNo);
		System.out.println("Field of interest: "+fieldOfInterest);
	}
}
