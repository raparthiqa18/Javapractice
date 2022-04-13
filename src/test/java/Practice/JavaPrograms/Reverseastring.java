package Practice.JavaPrograms;

public class Reverseastring {
    public static String revstring="";
    public static void main(String[] args) {
        //Using java
        String str="Rakesh";
        String revstr="";
        for (int i=str.length()-1; i>=0; i--){
            revstr=revstr+str.charAt(i);
        }
        System.out.println(revstr);

        //String methods
        StringBuilder stb=new StringBuilder(str);
        System.out.println(stb.reverse());
        //String methods
        StringBuffer stbf=new StringBuffer(str);
        System.out.println(stbf.reverse());

        System.out.println("Using recursive : " + revst(str));

        System.out.println("Reverse String Express VPN Style"+ revString(str));


    }

    //Recursion
    public static String revst(String str){
        if (str.isEmpty()){
            return str;
        }else{
            return revst(str.substring(1)) + str.charAt(0);
        }
    }

    //Reverse a string ExpressVPN
    public  static  String revString(String str){
//        int l=0;
//        int r=str.length()-1;
//        while(l<r){
//            System.out.println(str.charAt(r));
////            System.out.println(str.charAt(l));
//            l+=1;
//            r-=1;
//        }

        return str;
    }

}
