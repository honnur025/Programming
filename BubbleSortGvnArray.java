package Programs;

import java.util.Scanner;

public class BubbleSortGvnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter Element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//Ascendind Order 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				//for Descendind Order
				//chenge Relatinal Oparator by Greter than(>)
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
}
