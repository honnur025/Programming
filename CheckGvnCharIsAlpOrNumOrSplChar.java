package Programs;

import java.util.Scanner;

public class CheckGvnCharIsAlpOrNumOrSplChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		char c=sc.next().charAt(0);
		if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
			System.out.println("Alphabet Char");
		}else if(c>='0' && c<='9') {
			System.out.println("Number Char");
		}else {
			System.out.println("Special Char");
		}
	}
}
