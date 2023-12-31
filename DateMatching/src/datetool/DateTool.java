package datetool;

/**
 * DateTool provides public static methods and services to other classes
 * @author pffung
 */
public class DateTool {
    
    /**
     * Determine if the given year is leap (a year with Feb 29 and 366 days.)
     * @param givenYear is assumed to be at least 1800, no checking needed
     * @return a boolean telling true if givenYear is a leap year
     */
    public static boolean isLeapYear(int givenYear) {
        boolean leapYear;
        leapYear = givenYear % 4 == 0 && givenYear % 100 != 0 || givenYear % 400 == 0;
        return leapYear;
    }
    
    /**
     * Determine number of days in the given year and given month.
     * @param givenYear is assumed to be at least 1800, no checking needed
     * @param givenMonth is expected to be in 1 – 12, range checking needed
     * @return number of days: 28, 29, 30 or 31;
     * return 30 if givenMonth is invalid
     */
    public static int determineMonthLength(int givenYear, int givenMonth) {
        int monthLength = 30;
        if (givenMonth >= 1 && givenMonth <= 12)
            switch (givenMonth) {
                case 4: case 6: case 9: case 11: monthLength = 30; break;
                case 2: 
                    if (DateTool.isLeapYear(givenYear))
                        monthLength = 29;
                    else
                        monthLength = 28;
                    break;
                default: monthLength = 31;
            }
        return monthLength;
    }

    /**
     * Determine a 3-letter month name of given month in 1 - 12.
     * @return String representation of month name in 3 letters;
     * return "???" if given month is invalid (out of range)
     */
    public static String determineMonthName(int givenMonth) {
        String monthName = "???";
        switch (givenMonth) {
            case  1: monthName = "Jan"; break;
            case  2: monthName = "Feb"; break;
            case  3: monthName = "Mar"; break;
            case  4: monthName = "Apr"; break;
            case  5: monthName = "May"; break;
            case  6: monthName = "Jun"; break;
            case  7: monthName = "Jul"; break;
            case  8: monthName = "Aug"; break;
            case  9: monthName = "Sep"; break;
            case 10: monthName = "Oct"; break;
            case 11: monthName = "Nov"; break;
            case 12: monthName = "Dec"; break;
            default: monthName = "???";
        }
        return monthName;
    }

    /* USAGE DEMO */  
    public static void main(String[] args) {
        
        System.out.println("1900 is a leap year: " + DateTool.isLeapYear(1900));
        System.out.printf("Feb 1900 has %2d days\n", 
            DateTool.determineMonthLength(1900, 2));

        System.out.println("2000 is a leap year: " + DateTool.isLeapYear(2000));
        System.out.printf("%s 2000 has %2d days\n", 
            determineMonthName(2), DateTool.determineMonthLength(2000, 2));

        System.out.println("2020 is a leap year: " + DateTool.isLeapYear(2020));
        System.out.printf("Dec 2020 has %2d days\n", 
            determineMonthLength(2020, 12));

        System.out.println("2023 is a leap year: " + DateTool.isLeapYear(2023));
        System.out.printf("%s 2023 has %2d days\n", 
            DateTool.determineMonthName(4), determineMonthLength(2023, 4));

        System.out.printf("Invalid month 17 test: %s 2023 has %2d days\n", 
            determineMonthName(17), determineMonthLength(2023, 17));

        System.out.println("===");
        System.out.println("END OF DEMONSTRATION EXAMPLES");

    }
}
