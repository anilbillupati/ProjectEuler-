import java.util.Scanner;
public class Perfect {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n value : ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(isPerfect(i)) {
                System.out.println(i);
            }
      if(isPerfect2(i)) {
                System.out.println(i);
            }
		}
	}
	//brute force
	static boolean isPerfect(int n) {
		int sum=0,duplicate=n;
		for(int i=1;i*i<=n/2;i++) {
			if(n%i ==0) sum+=i;
		}
		return duplicate==sum;
	}
//better 
	static boolean isPerfect2(int n) {
		int sum=1,duplicate=n;
		for(int i=n;i>=2;i--) {
			if(n%i ==0) sum +=i;
			if(sum>duplicate) return false;
		}
		return sum==duplicate;
	}
}
