package Pactice2.hackerrank;

public class fizzbizz {
    public static void main(String[] args) {
        for (int i=1; i<=25; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%3==0 && i%5!=0){
                System.out.println("Fizz");
            }else if(i%3!=0 && i%5==0){
                System.out.println("Buzz");
            }else if(i%3!=0 && i%5!=0){
                System.out.println(i);
            }
        }


    }

}
