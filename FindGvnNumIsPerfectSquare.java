package Programs;

import java.util.Scanner;

public class FindGvnNumIsPerfectSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				c++;
				break;
			}
		}
		if(c==1) {
			System.out.println(n+" Is A Perfect Square");
		}else {
			System.out.println(n+" Is A Not Perfect Square");
		}
	}
}
