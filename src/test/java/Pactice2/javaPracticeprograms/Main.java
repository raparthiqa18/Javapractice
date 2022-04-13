package Pactice2.javaPracticeprograms;

public final class Main {
    int x;
    String s="dbaf";
    static int wheels=4;
    public Main(int y){
        x=y;
    }
    public Main(int y, String str){
        x=y;
    }

    public static void myMethod(){
        System.out.println("My method");
    }

    public static void main(String[] args) {
        Main myobj=new Main(11);
        Main myobj1=new Main(12);
        Main myobj2=new Main(13, "22737");
        myobj.x=7;
        System.out.println(myobj.s);
        System.out.println(myobj.x);
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);

        myMethod();
        System.out.println(wheels);
    }

}
