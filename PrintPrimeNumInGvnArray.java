package Programs;

import java.util.Scanner;

public class PrintPrimeNumInGvnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter "+a.length+" Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=1;j<=a.length;j++) {
				if(a[i]%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(a[i]+" ");
				c=0;
			}
		}
	}
}
