package Programs;

import java.util.Scanner;
// Make Me Big Num
public class ConvertGvnNumToBigNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers");
		int n=sc.nextInt();
		int n1=n,c=0;
		while(n1!=0) {
			n1=n1/10;
			c++;
		}
		int arr[]=new int[c];
		int k=0;
		while(n!=0) {
			arr[k]=n%10;
			n=n/10;
			k++;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int ans=0;
		for(int ele: arr) {
			ans=ans*10+ele;
		}
		System.out.println(ans);
	}
}
