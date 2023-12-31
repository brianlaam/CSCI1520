package datematching;

import datetool.DateTool;

/**
 * DateClientExample to show case and to test class DateYMD.
 * Before you can compile successfully and run this as Main class correctly,
 * you need completed classes datetool.DateTool AND datematching.DateYMD.
 * DO NOT MODIFY THIS CLASS!
 * @author pffung
 */
public class DateClientExample {

    public static void main(String[] args) {
        
        System.out.println("1900 is a leap year: " + DateTool.isLeapYear(1900));
        System.out.printf("Feb 1900 has %2d days\n", DateTool.determineMonthLength(1900, 2));
        System.out.println("2000 is a leap year: " + DateTool.isLeapYear(2000));
        System.out.printf("Feb 2000 has %2d days\n", DateTool.determineMonthLength(2000, 2));
        System.out.println("2020 is a leap year: " + DateTool.isLeapYear(2020));
        System.out.printf("Dec 2020 has %2d days\n", DateTool.determineMonthLength(2020, 12));
        System.out.println("2023 is a leap year: " + DateTool.isLeapYear(2023));
        System.out.printf("%s 2023 has %2d days\n", 
            DateTool.determineMonthName(4), DateTool.determineMonthLength(2023, 4));

        System.out.println("Let's try month 13:");
        System.out.printf("%s 2099 has %2d days\n", 
            DateTool.determineMonthName(13), DateTool.determineMonthLength(2099, 13));
        System.out.println("===");

        
        // create new object with default constructor, i.e., no parameters
        DateYMD NewYearEve = new DateYMD();
        NewYearEve.setYear(2020);
        NewYearEve.setMonth(12);
        NewYearEve.setDay(31);
        
        System.out.println("New Year Eve on ");
        NewYearEve.displayYYYYMMDD();
        System.out.println(" (YYYYMMDD)");
        NewYearEve.displayDayMonthNameYYYY();
        System.out.println(" (DD-MMM-YYYY)");
        System.out.println("Day " + NewYearEve.getDayOfTheYear() + " of the year " + NewYearEve.getYear());
        System.out.println("===");
        
        
        // create new object with default constructor, assumed to be 1980-1-1
        DateYMD NewYear = new DateYMD();
        // just change the year
        NewYear.setYear(2023);
        
        System.out.println("New Year on");
        NewYear.displayYYYYMMDD();
        System.out.println(" (YYYYMMDD)");
        NewYear.displayDayMonthNameYYYY();
        System.out.println(" (DD-MMM-YYYY)");
        System.out.println("Day " + NewYear.getDayOfTheYear() + " of the year " + NewYear.getYear());
        System.out.println("===");

        
        // create new object with 3 arguments using constructor bearing 3 parameters
        DateYMD Christmas = new DateYMD(2023, 12, 25);
        
        System.out.println("Christmas on ");
        Christmas.displayYYYYMMDD();
        System.out.println(" (YYYYMMDD)");
        Christmas.displayDayMonthNameYYYY();
        System.out.println(" (DD-MMM-YYYY)");
        System.out.println("Day " + Christmas.getDayOfTheYear() + " of the year " + Christmas.getYear());
        System.out.println("===");

        System.out.println("END OF DEMONSTRATION EXAMPLES");
        
        System.out.println("END OF DEMONSTRATION EXAMPLES");
    }
}