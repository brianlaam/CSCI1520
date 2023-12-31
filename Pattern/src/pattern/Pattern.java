package pattern;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Size: ");
        int n = scanner.nextInt();
        
        //===============================================
        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("A");
            for (int k = 0; k <= i; k++)
                System.out.print("*");
            System.out.println("#"); }
        */
        //===============================================
        /*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=i; j++)
                System.out.print(i);
            System.out.println();
        }
        */
        //===============================================
        /*
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) 
                System.out.print(" ");
            for (int k = 1; k <= i; k++) 
                System.out.print(k);
            for (int l = i - 1; l >= 1; l--)
                System.out.print(l);
            System.out.println();
        } 
        */

        //===============================================
        /*  Printing V
        int side = n;
        for(int i = 1; i < side; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("\\");
            for(int j = 0; j < (side-i-1)*2+1; j++)
                System.out.print("#");                
            System.out.println("/");
        }
        
        for (int i = 0; i < side-1; i++)
            System.out.print("\\");
        
        System.out.println("V");        
        System.out.printf("Side is %d\n", side);
        */
        //===============================================        
        /* Printing W
        if (n==0)
            System.out.println("W");
        else
        {
            for (int i = 1; i <= n; i++) 
            {
                System.out.print("|");
                for (int space = 0; space < n-i ; space++)
                    System.out.print(" ");
                System.out.print("/");
                for (int space = 0; space < (i-1) ; space++)
                    System.out.print("  ");        
                System.out.print("\\");
                for (int space = 0; space < n-i ; space++)
                    System.out.print(" ");
                System.out.print("|");            
                System.out.println();        
            } 
        }
        */
        //===============================================        
        /* Printing V
        for (int i = 0; i < n-1; i++) {
            for (int slash = 0 ; slash <= i; slash++)
                System.out.print("\\");
            for (int star = 0; star < (n-i-2) * 2 + 1; star++)
                System.out.print("#");
            System.out.print("/");
            System.out.println();    
        }
        
        for (int k = 0 ; k < n-1; k++)
            System.out.print("\\");
        System.out.println("V");            
        */
        
        //===============================================        
        /* Printing M
        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int space = 0; space <= i-1; space++)
                System.out.print(" ");
            System.out.print("\\");
            for (int sp = 0; sp < (n-i)*2-2; sp++)
                System.out.print(" ");
            System.out.print("/");
            for (int space = 0; space <= i-1; space++)
                System.out.print(" ");            
            System.out.println("|");
        } 
        */
    }         
}