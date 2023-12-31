package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //float num = scanner.nextFloat();
        //System.out.println(num * num);
        
        /*int i = 1234;
        int j = 56;
        int k = 999;
        
        int total = i + j + k;
        System.out.println("The sum = " + (i+j+k));
        System.out.println("The sum = " + total); */
        
        /*==========================================================================================================*/
        //Lec04 P.27 Ex1
        /*String  text = JOptionPane.showInputDialog("What's your age?");
        int num = Integer.parseInt(text);
           
        if (num<=5 && num>=-5)
            {JOptionPane.showMessageDialog(null, "True", "Inside the range?", JOptionPane.PLAIN_MESSAGE);}
            else
            {JOptionPane.showMessageDialog(null, "False", "Inside the range?", JOptionPane.PLAIN_MESSAGE);} */
            
        /*==========================================================================================================*/
        //double x = (int)3.4;
        //System.out.println(x);
        
        /*==========================================================================================================*/
        //char c = 'S';
        //System.out.println((char)(c-'A'+'a'));
        /*==========================================================================================================*/
        // Tutorial 5 Ex2 MPF
        /* String text = JOptionPane.showInputDialog("What is your salary?");
        int salary = Integer.parseInt(text);
        double mpf;
        
        if (salary < 7100)
            mpf = 0;
        
        else if (salary>7100 && salary<30000)
            mpf = salary * 5/100;
        
        else 
            mpf = 1500;
        
        System.out.println("Your mpf = " + mpf); */
        
        /*==========================================================================================================*/
        // Tutorial 5 Ex3 Accumulating
        /*int sum = 0 , num;
        Scanner scanner = new Scanner (System.in);
        
        do{
        System.out.println("Please enter number. (Enter 0 to exit)");
        num = scanner.nextInt();
        sum += num;
        } while(num!=0);
        
        System.out.println("SUM = " + sum);*/
        
        /*==========================================================================================================*/
        /*String text = JOptionPane.showInputDialog(null, "Give me a number");
        int num = Integer.parseInt(text);
        System.out.println(num); */
        
        /*==========================================================================================================*/
        JOptionPane.showMessageDialog(null,"Do you want to build a snowman","QUESTION",JOptionPane.QUESTION_MESSAGE);
        

        
          
    }
}