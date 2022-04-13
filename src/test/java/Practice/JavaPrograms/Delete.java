package Practice.JavaPrograms;


public class Delete {
    public static void main(String[] args) {
        for (int num=2; num<=20; num++){
            if(isPrime(num)){
                System.out.println(num + " ** is a prime number**");
            }
        }
    }

    public static boolean isPrime(int j){
        boolean prime=true;

        int i=2;
        while(i<=j/2){
            if(j%i==0){
                return false;
            }
            i++;
        }
        return prime;
    }
}
