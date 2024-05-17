import java.util.Scanner;
public class squareroot {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the n value : ");
    int n=sc.nextInt();
    System.out.print(sqr(n));
        
    }
    static int sqr(int x){
        int start=1;
        int end=x/2;
        while(start <=end){
            int mid=start+(end-start)/2 ;
            if(mid ==x/mid) return mid;
            else if (mid< x/mid) start=mid+1;
            else end=mid-1;
        }
        return end;
    }
    
}
