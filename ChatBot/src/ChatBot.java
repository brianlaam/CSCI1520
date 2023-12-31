/**
* CSCI1530 Assignment 3 ChatBot
* Aim: Build a ChatBot with Java using branching and repetition statements
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
 * Date : 17 Feb 2023
 **/

import javax.swing.JOptionPane;  

public class ChatBot 
{
    public static void main(String[] args) 
    {   String name = JOptionPane.showInputDialog("Hello. I am a BOT. What is your name?");
        String ans = JOptionPane.showInputDialog("How old are you? [1-120]");
        int age = Integer.parseInt(ans);

        while (age>120 || age<1)
        {   System.out.println("Your age input is invalid, try again!");
            ans = JOptionPane.showInputDialog("How old are you? [1-120]");
            age = Integer.parseInt(ans);
        }
            
        if (age<18)
        {   System.out.println(name + ", you will be " + (age+1) + " next year." );
            System.out.println("Hello kid, guess age of CUHK!");
            String guess = JOptionPane.showInputDialog(name + " , how old is CUHK?");
            int CUage = Integer.parseInt(guess);
            
            while (CUage!=60)
                {System.out.println("Your guess = " + CUage);
                guess = JOptionPane.showInputDialog(name + " , how old is CUHK?");
                CUage = Integer.parseInt(guess);}
            
            System.out.println("Your guess = " + CUage);
            System.out.println("Bingo!!");
            System.out.println("Bye " + name);
        }
            
        
        if (age>=18)
        {   System.out.println(name + ", you will be " + (age+1) + " next year." );
            System.out.println("Dear friend, experience black magic!");
            
            int Ccount = 0;
            int Gcount = 0;
                
            while(Ccount<5) 
            {   String guess = JOptionPane.showInputDialog(name + " , give me a number!");
                int num = Integer.parseInt(guess);
                
                if(num%2!=0)
                   {    Ccount = 0;
                        System.out.println("Your guess: " + num);
                        System.out.println("Correct Count: 0 / Guess Count: " + (Gcount+1));
                        Gcount++;
                   }
                    
                    if(num%2==0)
                    {   System.out.println("Your guess: " + num);
                        System.out.println("Correct Count: " + (Ccount+1) + "/ Guess Count: " + (Gcount+1));
                        Gcount++;
                        Ccount++;
                    }
                }            
        System.out.println("Bingo!");
        System.out.println("Bye, " + name);
        }
    }            
}
