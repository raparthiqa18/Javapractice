package Practice.JavaPrograms;

public class reversenumber {
    public static void main(String[] args) {
        int x=10202;
        int rev=0;

//        System.out.println(x%10);
//        System.out.println(x/10);
         while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }

        System.out.println(rev);

    }
}
