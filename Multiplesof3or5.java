import java.util.Scanner;

public class Multiples {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the n value :");
	int n =sc.nextInt();
	  System.out.println("the sum of multipes of 3 or 5 is :" +multiplesof3or5(n));
	}
	static int multiplesof3or5(int n) {
		int sum=0;
		for(int i=3;i<=n;i++) {
			if(i%3 ==0 || i%5==0 ) sum +=i;
		}
		return sum;
	}
}
