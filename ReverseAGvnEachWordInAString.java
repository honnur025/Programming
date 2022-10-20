package Programs;

public class ReverseAGvnEachWordInAString {
	public static void main(String[] args) {
		String s1="Hello Word Hi bye";
		String[] s2=s1.split(" ");
		
		for(int i=0;i<s2.length;i++) {
			//System.out.print(s2[i]+" ");
			String s=s2[i];
			String rev="";
			for(int j=s.length()-1;j>=0;j--) {
				rev=rev+s.charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
}
