package Function;

public class check_number_is_prime_or_not {
    public static boolean  primeNumber(int n){
        boolean primeNumber = true;
        for(int i = 2; i<=n-1; i++){
            if(n%i==0) {
               primeNumber = false;
                break;
            }
        }
        return primeNumber;
    }
    public static void main(String[] args){
        System.out.println(primeNumber(3));

    }
}
