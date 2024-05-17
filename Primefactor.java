public class Primefactor{
    public static void main(String[] args) {
       long number=600851475143l;
       long maxprimefactor=0;
       for(long i=2;i<=Math.sqrt(number);i++){
        if(isPrime(i) && (number % i ==0) )maxprimefactor=Math.max(maxprimefactor, i);
       }
       System.out.println(maxprimefactor);
    }  

   static boolean isPrime(long n){
        for(long i=2;i<=Math.sqrt(n);i++){
         if(n % i ==0)  return false;
        }
        return true;
   }
}
