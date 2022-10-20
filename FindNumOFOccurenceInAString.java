package Programs;

import java.util.Scanner;

public class FindNumOFOccurenceInAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1[]=s.split("");
		for(int i=0;i<s1.length;i++) {
			int c=0;
			for(int j=0;j<s1.length;j++) {
				if(s1[i].equals(s1[j])) {
					c++;
				}
			}
			System.out.println(s1[i]+" "+c);
		}
	}
}
