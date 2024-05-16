public class prime{
    public static void main(String[] args) {
    
        int count=0;
        int number=1;
        while(count <10001 ){
            number++;
            if(isPrime(number)) count++;
        }
        System.out.println(number);    
}
    static boolean isPrime(int n){
        for(int i=n/2;i<=2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
