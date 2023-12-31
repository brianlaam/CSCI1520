package datematching;

import datetool.*;

/**
 * DateYMD class is providing a blueprint for creating DateYMD objects.
 * year range: at least 1800
 * month range: 1 - 12
 * day range: 1 - 31, depending on year and month
 * @author pffung
 */
public class DateYMD {
    private int year;
    private byte month;
    private byte day;

    public DateYMD() 
    {   // default constructor, rather than DOING NOTHING, set the DateYMD to be 1980-01-01   
        year = 1980; 
        month = 1; 
        day = 1; 
    } 
    
    public DateYMD(int Y, int M, int D)
    {   // define ANOTHER constructor that takes three int parameters Y, M, D 
        year = Y;
        month = (byte) M;
        day = (byte) D; 
    }
    
    
    public void setYear(int updatedYear)
    {   // method setYear(int updatedYear) sets field year to updatedYear , @param updatedYear should be at least 1800; otherwise, set year to 2023 
        if (updatedYear>=1800) 
            year = updatedYear;
        else 
            year = 2023; 
    }
    
    public void setMonth(int updatedMonth)
    {   // method setMonth(int updatedMonth) sets field month to updatedMonth, @param updatedMonth should be in 1 - 12; otherwise, set month to 12
        if ((updatedMonth>=1) && (updatedMonth<=12))
            month = (byte) updatedMonth;
        else
            month = 12;
    }

        public void setDay(int updatedDay)
    {   
        DateTool.isLeapYear(year);
        byte dayLimit = (byte) DateTool.determineMonthLength(year, month);       
        
        if ((updatedDay)>=1 && (updatedDay<=dayLimit))
            day = (byte) updatedDay;
        else 
            day = dayLimit;
    }
    
        
    public int getYear()
    {
        return year;
    }    
    
    public byte getMonth()
    {
        return month;  
    }    
        
    public byte getDay()
    {
        return day;
    }    
    
    
    public int getDayOfTheYear() 
    {   // define a public special method for calculating and returning day number 
        int dayOfYear = 0;
        for (int i = 1; i < month; i++)
            dayOfYear += DateTool.determineMonthLength(year,i);
        dayOfYear += day;
        return dayOfYear;
    }

    
    public void displayYYYYMMDD() 
    {    // GIVEN METHOD Display this DateYMD object in YYYYMMDD format with zero padding for MM and DD. 
        System.out.printf("%4d%02d%02d", getYear(), getMonth(), getDay()); 
    } 

    public void displayDayMonthNameYYYY()    
    { // Display this DateYMD object in Day-MMM-YYYY format where Day has NO zero padding and MMM is a 3-letter month name. 
        String monthName = DateTool.determineMonthName(month);
        System.out.print(getDay() + "-" + monthName + "-" + getYear());
    } 
} // end of class DateYMD