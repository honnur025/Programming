package Programs;

import java.util.Scanner;

public class FindSumNAvgOgGvnNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,c=0;
		while(n!=0) {
			sum+=n%10;
			n=n/10;
			c++;
		}
		System.out.println("Sum :"+sum);
		System.out.println("Avg :"+sum/c);
	}
}
