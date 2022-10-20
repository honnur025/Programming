package Programs;

public class AmstrongNum {
	public static void main(String[] args) {
		int n=153,n1=n,n2=n;
		int rem=0,sum=0,c=0;
		while(n1!=0) {
			n1=n1/10;
			c++;
		}
		while(n!=0) {
			rem=n%10;
			n=n/10;
			sum+=(int) Math.pow(rem, c);
		}
		if(n2==sum) 
			System.out.println(n+" Amstrong Number");
		else 
			System.out.println(n+" Not A Amstsrong Number");
	}
}
