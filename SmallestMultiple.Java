public class smallestmultiple {
    public static void main(String[] args) {
        long n=1,count=1;
        while(count<=10){
            if(isDiv(n)) count++;
            n++;
        }
        System.out.println(n);
        // 232792560
    }

    static boolean isDiv(long n){
        for(int i=1;i<=10;i++)
        {
            if(n%i !=0) return false;
        } 
        return true;
    } 
}
