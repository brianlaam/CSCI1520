package investmentplanner;

import java.util.Scanner;

/**
 * InvestmentPlanner
 * @author Lam Hoi Chun 
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
 * https://www.cuhk.edu.hk/policy/academichonesty/
 *
 * Student Name : Lam Hoi Chun
 * Student ID : 1155192755
 * Class/Section: CSCI1530
 * Date : 2 Feb 2023
*/

public class InvestmentPlanner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
         
        System.out.println("/--------------------\\");
        System.out.println("| Investment Planner |");
        System.out.println("\\--------------------/");

        System.out.print("Principal (round to the nearest HK$)   : ");
        float principal = keyboard.nextFloat();
        System.out.print("Duration of investment (number of year): ");
        int year = keyboard.nextInt();
        System.out.print("Annual interest rate, e.g., 3.75 (%)   : ");
        double rate = keyboard.nextDouble();
        
        principal = Math.round(principal);
        double rate1 = rate/100;
        double rate2 = Math.pow((1+rate1), year);
        double rate3 = Math.pow(1+(rate1/12), year*12);
        
        System.out.println("Fixed-term deposit options ");
        System.out.println("A) investing the principal once for the whole period (simple interest) ");
        System.out.println("   Net investment revenue = HK$" + Math.round(principal * year * rate));
        System.out.println("B) renewing principal+interest every year (annually compound interest) ");        
        System.out.println("   Net investment revenue = HK$" + Math.round(principal * rate2 - principal)); 
        System.out.println("C) renewing principal+interest every month (monthly compound interest) ");
        System.out.println("   Net investment revenue = HK$" + Math.round(principal * (rate3) - principal));
    } 
}