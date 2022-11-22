import java.util.Scanner;
import java.lang.String;
public class DaysOfMonth {  
  public static void main(String[] args) {

    try (Scanner keyboard = new Scanner(System.in)) {

        String[] MonthArray = { "jan", "feb", "mar","apr", "may", "jun", "jul", "aug", "sep","oct", "nov", "dec", "january", "february", "march","april", "may", "june", "july", "august", "september","october","november", "december", "jan.", "feb.", "mar.","apr.", "may.", "jun.", "jul.", "aug.", "sep.","oct.", "nov.", "dec.", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        int DaysInMonth = 0; 
        int j = 0;
        String NameOfMonth = "Unknown";

        System.out.print("Enter a month in its full name, abbreviation, in 3 letters, or in number: ");
        String month = keyboard.nextLine();

        for (int i = 0; i < 48; i++){
            if (month.equals(MonthArray[i])){
            j = i + 1;
            if (j > 12 && j < 25){
                j = j - 12;
            } else if (j > 24 && j < 37) {
                j = j - 24;
            } else if (j > 36) {
                j = j - 36;
            }
            }
        }

        System.out.print("Enter a year: ");
        int year = keyboard.nextInt();

        switch (j) {
            case 1:
                NameOfMonth = "January";
                DaysInMonth = 31;
                break;
            case 2:
                NameOfMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    DaysInMonth = 29;
                } else {
                    DaysInMonth = 28;
                }
                break;
            case 3:
                NameOfMonth = "March";
                DaysInMonth = 31;
                break;
            case 4:
                NameOfMonth = "April";
                DaysInMonth = 30;
                break;
            case 5:
                NameOfMonth = "May";
                DaysInMonth = 31;
                break;
            case 6:
                NameOfMonth = "June";
                DaysInMonth = 30;
                break;
            case 7:
                NameOfMonth = "July";
                DaysInMonth = 31;
                break;
            case 8:
                NameOfMonth = "August";
                DaysInMonth = 31;
                break;
            case 9:
                NameOfMonth = "September";
                DaysInMonth = 30;
                break;
            case 10:
                NameOfMonth = "October";
                DaysInMonth = 31;
                break;
            case 11:
                NameOfMonth = "November";
                DaysInMonth = 30;
                break;
            case 12:
                NameOfMonth = "December";
                DaysInMonth = 31;
        }
        System.out.print(NameOfMonth + " " + year + " has " + DaysInMonth + " days\n");
    }
    }
}