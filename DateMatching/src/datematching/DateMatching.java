package datematching;

import datetool.DateTool;
import java.util.Random;
import java.util.Scanner;

/**
 * Java Assignment DateMatching.<br>
 * 1. Before start working on this class, students need completed classes
 *    datetool.DateTool AND datematching.DateYMD.<br>
 * 2. Then, test run class DateClientExample.<br>
 * 3. Finally, this is your Main program.<br>
 * @author pffung
 */

public class DateMatching {

    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print("Input my DoB (YYYY MM DD):");
        int yearA = kb.nextInt();
        int monthA = kb.nextInt();
        int dayA = kb.nextInt();
        
        DateYMD obj = new DateYMD();
        obj.setYear(yearA);
        obj.setMonth(monthA);
        obj.setDay(dayA);

        System.out.print("Born on " );        
        obj.displayDayMonthNameYYYY();
        System.out.print(" and my birthday is ");
        if ((monthA == 2) && (dayA==29))
            { obj.setDay(28);
              obj.setYear(2023);
              obj.displayDayMonthNameYYYY();
            }
        else
            {
            obj.setYear(2023);
            obj.displayDayMonthNameYYYY();
            }

        int dayNumA = obj.getDayOfTheYear();
        System.out.printf("%s %d %s\n"," and my birthday is (day", dayNumA,"\b) this year");

        // ===================================================================
        
        System.out.print("Input your DoB (YYYY MM DD):");
        int yearB = kb.nextInt();
        int monthB = kb.nextInt();
        int dayB = kb.nextInt();
               
        obj.setYear(yearB);
        obj.setMonth(monthB);
        obj.setDay(dayB);
        
        System.out.print("Born on " );        
        obj.displayDayMonthNameYYYY();
        System.out.print(" and my birthday is ");
        if ((monthB == 2) && (dayB==29))
            { obj.setDay(28);
              obj.setYear(2023);
              obj.displayDayMonthNameYYYY();
            }
        else
            {
            obj.setYear(2023);
            obj.displayDayMonthNameYYYY();
            }
        
        int dayNumB = obj.getDayOfTheYear();
        System.out.printf("%s %d %s\n"," and my birthday is (day", dayNumB,"\b) this year");        
        
        // ===================================================================

        Random rand = new Random();
        int randMonth = rand.nextInt(1, 13);
        int dayBound = DateTool.determineMonthLength(2023, randMonth);
        int randDay= rand.nextInt(1, dayBound);
        
        obj.setYear(2023);
        obj.setMonth(randMonth);
        obj.setDay(randDay);
        int dayNumC = obj.getDayOfTheYear();

              
        System.out.print("Lovely picked ");
        obj.displayDayMonthNameYYYY();
        System.out.printf("%s %d %s\n","(day", dayNumC,"\b) randomly this year");        
       
        // ===================================================================
        int dayDiffAC = Math.abs(dayNumA-dayNumC);
        int dayDiffBC = Math.abs(dayNumC-dayNumB);
        
        System.out.println("Difference between my birthday and choice of lovely is " + dayDiffAC + " days");
        System.out.println("Difference between your birthday and choice of lovely is " + dayDiffBC + " days");

        if(dayDiffAC>dayDiffBC)
             System.out.println("You are closer to lovely!");
        else if (dayDiffAC<dayDiffBC)
             System.out.println("I am closer to lovely!");
        else
             System.out.println("We are lovely!");    
    }
}
