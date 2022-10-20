package Programs;

public class CountNumOfWordsInAString {
	public static void main(String[] args) {
		String s1="Hello hi Jspiders Bye gn gm";
		int c=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				c++;
			}
		}
		System.out.println(c+1);
	}
}
