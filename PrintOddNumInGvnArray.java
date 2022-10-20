package Programs;

import java.util.Scanner;

public class PrintOddNumInGvnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
