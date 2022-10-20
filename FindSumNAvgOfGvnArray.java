package Programs;

import java.util.Scanner;

public class FindSumNAvgOfGvnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+a.length+" Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum Of Array "+sum);
		System.out.println("Avarage Of Array "+sum/a.length);
	}
}
