package Programs;

import java.util.Scanner;

public class FindNumPositiveOrNegetive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=sc.nextInt();
		
		if(n>0) {
			System.out.println(n+" Is Positive Number");
		}else {
			System.out.println(n+" Is Negetive Number");
		}
	}
}
