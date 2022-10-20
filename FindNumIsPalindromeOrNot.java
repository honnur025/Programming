package Programs;

import java.util.Scanner;

public class FindNumIsPalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt(),n1=n;
		int rem=0,rev=0;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==n1) {
			System.out.println(n1+" Is Palindrome");
		}else {
			System.out.println(n1+" Is Not Palindrome");
		}
	}
}
