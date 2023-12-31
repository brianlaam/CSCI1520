// Tutorial 3
package javaapplication2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication2 {
    public static void main(String[] args) {
        // Calculating circumference
        /*double pi = Math.PI;
        
        System.out.println("Enter the radius");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        
        double circumference = 2 * pi * radius;
        System.out.println("Circumference = " + circumference);*/
        
        //========================================================
        // Exchange rate calculator (JPY & USD)
        
        /* String  ans = JOptionPane.showInputDialog("JPY or USD?: ");
        
        if (ans.equals("JPY"))
            {   String amount1 = JOptionPane.showInputDialog("What is the amount of JPY?: ");
                    float x = Float.parseFloat(amount1);  
                    JOptionPane.showMessageDialog(null, "The corresponding amount of HKD = " + x * 0.06 , "JPY to HKD", JOptionPane.PLAIN_MESSAGE);}
        
        else
            if (ans.equals("USD"))
            {   String amount2 = JOptionPane.showInputDialog("What is the amount of USD?: ");
                    float y = Float.parseFloat(amount2);  
                    JOptionPane.showMessageDialog(null, "The corresponding amount of HKD = " + y * 7.84 , "USD to HKD", JOptionPane.PLAIN_MESSAGE);}      
        
            else
            {   JOptionPane.showMessageDialog(null, "ONLY JPY and USD are availiable!", "title", JOptionPane.ERROR_MESSAGE);} */
        
        
        //========================================================
        // Tutorial 4 Ex1 Delivery Fee Calculator
        /*
        int pa = 5, pb = 7, pc= 10;
        double total;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many set A?");
        int na = scanner.nextInt();
        System.out.println("How many set B?");
        int nb = scanner.nextInt();
        System.out.println("How many set C?");
        int nc = scanner.nextInt();
        
        total = pa*na + pb*nb + pc*nc;
        if (total<20)
            {total = total+0;}
        
        if (total>20 && total <50)
            {total = total*0.9;}
    
        if (total>50 && total <100)
            {total = total*0.8;}
       
        if (total>100)
        {total = total*0.7;}
        
        total = Math.round(total*10);
        total = total / 10;
        
        String  ans = JOptionPane.showInputDialog("Do you want to takeaway?");
        if (ans.equals("Yes"))
        {total+=2;
        System.out.println("The total fee is $" + total);}
            else
            {System.out.println("The total fee is $" + total);}*/
        
        //========================================================
        // Tutorial 4 Ex3 Calculating Sum
        /*int sum = 0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input value for calculating sum. (Input 0 to exit)");
        
        while(i!=0)
            {   i = scanner.nextInt();
                sum = sum + i;}
        
        System.out.println("The sum = " + sum); */
        
        //========================================================
        // Lec5 Nested Loops
        
        /* Scanner inputObj = new Scanner(System.in);

        System.out.print("Size = ? ");
        int size = inputObj.nextInt();

        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= (size - i); j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();*/

        //========================================================
        //Tutorial 6 Nested Loops Exercise
        /* int a,b,c,d, no_sol = 0;
        for (a=1; a<=4; a++)
            {for (b=1; b<=4; b++)
                {if(a!=b)
                    {for(c=1; c<=4; c++)
                        if(c!=b && c!=a)
                            {for(d=1; d<=4; d++)
                                if(d!=a && d!=b && d!=c)
                                    {if(((c==2)^(a==3)) && ((a==2)^(c==4)) && ((b==2)^(d==4)) && ((c==4)^(b==1)))
                                        System.out.println(a + " " + b + " "+ c + " " + d);
                                            no_sol++;
                                    }
                            }
                    }
                }
            } */
        //========================================================
        //Tutorial 6 Nested Loops Example

        int a,b,c,d,e;
        for (a=1; a<=5; a++){
            for (b=1; b<=5; b++){
                for (c=1; c<=5; c++){
                    for (d=1; d<=5; d++){
                        for (e=1; e<=5; e++)
                            if((a+b+c+d+e==15) && (a*b*c*d*e==120) && ((a==3)^(b==2)) && ((b==2)^(e==4)) && ((c==1)^(d==2)) && ((d==3)^(c==5)) && ((e==4)^(a==1)))
                               System.out.println(a + " " + b + " "+ c + " " + d + " " + e);
                    }
                } 
            }
        }
    }
}