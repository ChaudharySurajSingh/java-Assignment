import java.util.Scanner;
/*Q2 - Swap two numbers without the use of third variable*/
public class question2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter first number:");
		int num1 = scn.nextInt();
		System.out.print("enter second number:");
		int num2 = scn.nextInt();
		System.out.println("before swapping the first number is "+num1);
		System.out.println("before swapping the second number is "+num2);
		num1+=num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("*****************************************");
		System.out.println("after swapping the first number is "+num1);
		System.out.println("after swapping the second number is "+num2);
	}
}