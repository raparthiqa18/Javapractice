package Practice.JavaPrograms;

public class recursionex {
    public static void main(String[] args) {
        //Sum of a range of numbers
        System.out.println(Sum(10));
        //Sum of starting to ending range
        System.out.println(Sum(1,10));
        //Factorial of a number
        System.out.println(Factorial(5));
        System.out.println(Factorial(0));
    }

    public static int Sum(int k){
        if (k>0){
            return k + Sum(k-1);
        }else{
            return 0;
        }
    }

    public static int Sum(int start, int end){
        if (end>=start){
            return end + Sum(start, end-1);
        }else{
            return 0;
        }
    }
    public static int Factorial(int k){
        int factorial=k;
        if(k>1){
            factorial= factorial * Factorial(k-1);
        }
        return factorial;
    }

}
