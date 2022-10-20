package Programs;

import java.util.Scanner;

public class CheckGvnStringIsAnagramOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s1=sc.next();
		System.out.println("Enter 2st String");
		String s2=sc.next();
		if(s1.length()==s2.length()) {
			int c=0;
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						c++;
					}
				}
			}
			if(c==s1.length()) {
				System.out.println(s1+" Is A Anagram");
			}else {
				System.out.println(s1+" is not Anagram");
			}
		}else {
			System.out.println(s1+"Not A Anagram");
		}

	}
}
