package Programs;

import java.util.Scanner;

public class FindDuplicateElementInAGvnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c>0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
