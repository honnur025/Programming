package Programs;

import java.util.Scanner;

public class FindMaxOfTwoNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Elements");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2) {
			System.out.println(n1+" Is Greter Than "+ n2);
		}else {
			System.out.println(n2+" Is Greter Than "+ n1);
		}
	}
}
