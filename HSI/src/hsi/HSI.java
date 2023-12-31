/** 
 * CSCI1530 Assignment HSI 
 * 
 * I declare that the assignment here submitted is original 
 * except for source material explicitly acknowledged, 
 * and that the same or closely related material has not been 
 * previously submitted for another course. 
 * I also acknowledge that I am aware of University policy and 
 * regulations on honesty in academic work, and of the disciplinary 
 * guidelines and procedures applicable to breaches of such 
 * policy and regulations, as contained in the website. 
 * 
 * University Guideline on Academic Honesty: 
 * http://www.cuhk.edu.hk/policy/academichonesty/ 
 * 
 * Student Name: Lam Hoi Chun
 * Student ID : 1155102755 
 * Date : 30-04-2023
 */

package hsi;

import java.util.Scanner;
import java.io.File;

public class HSI {

    public static void main(String[] args) throws Exception {
        String filename = "HSI.txt"; 
        File dataFile = new File(filename); 
        Scanner dataStream = new Scanner( dataFile ); 
        String header = dataStream.nextLine(); 
    
        int n = 0; 
        int recordNum;
        String yearStr;
        double high = 0;
        double sum = 0;
        double total = 0;
        double avg = 0;
        double low = Double.MAX_VALUE;
        int [] date = new int [4000];
        double [] hsi = new double [4000];
    
        while (dataStream.hasNextInt() || dataStream.hasNextDouble() || dataStream.hasNext())
        {
            date [n] = dataStream.nextInt();
            hsi [n] = dataStream.nextDouble();
            n++;
        }    
     
        System.out.println(header); 
        System.out.printf("Read %d records\n",n);
        System.out.println("First: " + date[0] + " closed at " + hsi[0]);
        System.out.println("Last: " + date[n-1] + " closed at " + hsi[n-1]);
        
        for (int i = 0; i < date.length; i++) 
        {
            System.out.printf("Input record number [0-%d]: ", n-1);
            Scanner userInput = new Scanner(System.in); 
            recordNum = userInput.nextInt();   
         
            if (recordNum < 0 || recordNum >= date.length) 
                break;

            System.out.println("record #" +  recordNum + ": " + date[recordNum] + " close at " + hsi[recordNum]);  
        }
        
        System.out.print("Input year [2000-2017]: ");
        Scanner userInput = new Scanner(System.in); 
        yearStr = userInput.nextLine();   
           
        for (int i = 0; i < date.length; i++) 
        {
            if (String.valueOf(date[i]).startsWith(yearStr)) 
            {
                if (hsi[i] > high) 
                    high = hsi[i];
                if(hsi[i] < low)
                    low = hsi[i];
            sum += hsi[i];
            total++;
            }
        }
        
        avg = sum / total;
        int year = Integer.parseInt(yearStr);
        
        if ((year>=2000 && year<=2017))
        {
            System.out.println("Year " + year + " closed high at " + high);
            System.out.println("Year " + year + " closed average " + avg);     
            System.out.println("Year " + year + " closed low at " + low);
        }    
        else
        {
            System.out.printf("Year %d closed high at NaN\n", year);
            System.out.printf("Year %d closed average NaN\n", year);
            System.out.printf("Year %d closed low at NaN\n", year);            
        
        }

        dataStream.close();
    }
}