package Programs;

import java.util.Scanner;

public class FactOfGivenNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=sc.nextInt(),fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Of Given Number : "+fact);
	}
}
