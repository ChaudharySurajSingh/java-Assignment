import java.util.Scanner;
/*Find the total number of bits needed to be flipped to convert x to y.*/
public class question5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x = scn.nextInt();
		int y = scn.nextInt();
		int n = x ^ y;
		int count = 0;
		while (n != 0){
			n = n & (n - 1);
			count++;
		}
		System.out.print("bit needed to be flipped to convert "+x+" to "+y +" are:: "+count);
	}
}