import java.util.Scanner;

/*Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
is taken with 5 and then multiply the resultant value by 5. Display the final result.*/
public class question1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter your number:");
		int x= scn.nextInt();
		int result = ((((x+8)/3)%5)*5);
		System.out.println("your result is: "+result);
	}
}
