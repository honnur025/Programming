package Programs;

import java.util.Scanner;

public class FindGvnNumIsPrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println(n+" Is A Prime Num");
		}else {
			System.out.println(n+" Is A Not Prime Num");
		}
	}
}
