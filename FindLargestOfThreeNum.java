package Programs;

import java.util.Scanner;

public class FindLargestOfThreeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Num");
		int n1=sc.nextInt();
		System.out.println("Enter 2st Num");
		int n2=sc.nextInt();
		System.out.println("Enter 3st Num");
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" Is The Largest");
		}else if(n2>n1 && n2>n3) {
			System.out.println(n2+" Is The Largest");
		}else {
			System.out.println(n3+" Is The Largest");
		}
		// Using ternary Oparetor
		//int max=n1>n2&&n1>n3?n1:(n2>n3 && n2>n1)?n2:n3;
		//System.out.println(max+" Is The Largest");
	}
}
