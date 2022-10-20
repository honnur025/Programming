package Programs;

import java.util.Scanner;

public class FindNumEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" Is Even Number");
		}else {
			System.out.println(n+" Is Odd Number");
		}
	}
}
