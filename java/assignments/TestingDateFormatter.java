package Assignments;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestingDateFormatter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last start date (yyyy-MM-dd): ");
        String lastStartDateStr = input.nextLine();
        
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate lastStartDate = LocalDate.parse(lastStartDateStr, date);
        
        System.out.print("The date is : " + lastStartDate);
    }
}
