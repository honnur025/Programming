package Programs;

import java.util.Scanner;

public class FindNumOfAlpNumSpl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		int a=0,n=0,s=0;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='a' && str.charAt(i)<='z') ||(str.charAt(i)>='A' && str.charAt(i)<='Z')) {
				a++;
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				n++;
			}else {
				s++;
			}
		}
		System.out.println("\nAlphabet :"+a+"\nNumaric :"+n+"\nSpecial Char :"+s);
	}
}
