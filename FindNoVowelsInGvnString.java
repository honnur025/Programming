package Programs;

import java.util.Scanner;

public class FindNoVowelsInGvnString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				c++;
			}
		}
		System.out.println("Num Of Vowels :"+c);
	}
}
