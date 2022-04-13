package Practice.Interview;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cloverdemo2 {
    public static void main(String[] args)  {

        System.out.println(Solution("10:00" , "13:21"));
        System.out.println(Solution("09:42" , "11:42"));
        System.out.println(Solution("09:42" , "09:55"));
    }


    public static  int Solution(String E, String L)  {
        int totalFee=0;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        try{
            Date date1 = format.parse(E);
            Date date2 = format.parse(L);
            long difference = date2.getTime() - date1.getTime();
//        System.out.println(difference);
            long diffHours = difference / (60 * 60 * 1000) % 24;
//        System.out.println(diffHours);
            long diffMinutes = difference / (60 * 1000) % 60;
//        System.out.println(diffMinutes);
            if (diffHours>0){
                totalFee=5;
                for (int i=2; i<=diffHours; i++){
                    totalFee=totalFee+4;
                }
                if (diffMinutes>0){
                    totalFee=totalFee+4;
                }
            }else{
                if (diffMinutes>0){
                    totalFee=5;
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }


        return totalFee;

    }
}
