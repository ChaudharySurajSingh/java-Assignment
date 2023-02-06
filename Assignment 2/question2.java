/*Q2 - Input two different string and print them in same line.*/

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str1,str2;
		System.out.println("enter the strings:");
		str1 = scn.nextLine();
		str2 = scn.nextLine();
		System.out.println(str1 + str2);
	}
}
