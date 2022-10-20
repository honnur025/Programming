package Programs;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1:Addition\n2:Substraction\n3:Multiplication\n4:Division\n5:Modulus\n6:exit");
			int choice=sc.nextInt();
			int n1=0,n2=0;
			if(choice<=5 && choice!=0) {
				System.out.println("Enter 1st Number");
				 n1=sc.nextInt();
				System.out.println("Enter 2st Number");
				 n2=sc.nextInt();
			}
			switch(choice) {
			case 1:System.out.println("Add ="+(n1+n2)+"\n");
			break;
			case 2:System.out.println("Sub ="+(n1-n2)+"\n");
			break;
			case 3:System.out.println("Mult ="+n1*n2+"\n");
			break;
			case 4:System.out.println("Div ="+n1/n2+"\n");
			break;
			case 5:System.out.println("Mod ="+n1%n2+"\n");
			break;
			case 6:System.out.println("Thank You");
					System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
