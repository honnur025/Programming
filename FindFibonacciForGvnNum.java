package Programs;

import java.util.Scanner;

public class FindFibonacciForGvnNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int n1=0,n2=1,sum=0;
		while(n1<=n) {
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}
}
