package Pactice2.javapractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePractice {

    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMMM dd");
        String formattedDate = myObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        String[] datearr=formattedDate.split(" ");
        System.out.println(datearr[2] + " " + datearr[1]);
    }
}
