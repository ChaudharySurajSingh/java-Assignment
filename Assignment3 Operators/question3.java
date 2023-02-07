/*Q3 - Write a program to calculate the sum of the digits of a (3-digit) number.*/
import java.util.Scanner;
public class question3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("inter the number: ");
		int num = scn.nextInt();
		scn.close();
		int sum=0,rem;
		while(num!=0){
			rem = num%10;
			sum += rem;
			num/=10;
		}
		System.out.println("sum of the digit of your input is:: "+ sum);
	}
}
