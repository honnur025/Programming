package Programs;

import java.util.Scanner;

public class FindStringIsPalindromOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2+=s.charAt(i);
		}
		if(s.equals(s2)) {
			System.out.println(s+" Is Palindrom");
		}else {
			System.out.println(s+" Is Not Palindrom");
		}
	}
}
