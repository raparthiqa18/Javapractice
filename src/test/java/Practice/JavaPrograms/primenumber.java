package Practice.JavaPrograms;

public class primenumber {
    public static void main(String[] args) {
        String flag;
        for (int i=2; i<20; i++){
            if (isPrimenum(i)){
                System.out.println(i + " is a prime number ");
            }

        }

    }

    public static boolean isPrimenum(int x){

        for (int j=2;j<=x/2; j++ ){
            if (x%j==0){
                return false;
            }
        }

        return true;
    }
}
