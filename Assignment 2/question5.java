/*Q5 - Given few lines of input(number of lines unknown) where each line has two
strings, concatenate the strings.*/
import  java.util.Scanner;
public class question5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(scn.hasNextLine()){
			String str1 = scn.next();
			String str2 = scn.next();
			System.out.println(str1+str2);
		}
	}
}

