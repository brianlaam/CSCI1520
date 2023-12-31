package mid.term.revision.exercises;
import java.util.Scanner;

public class MidTermRevisionExercises {
    public static void main(String [] args){
    // Q1
    // If i is 3 and j is 6, what are the values of i, j, and k after execution of the following statement?
    // k = ++i * j--;
    // k = 24 ; i = 4 ; j = 5 (ANS)
    /*int i = 3, j = 6;
    int k = ++i * j--;
    System.out.println(i);
    System.out.println(j);
    System.out.println(k); */
        
    // ============================================================= //    
    // Q2
    //Assume x is an integer variable, what is the value of x after executing the following statements. a and b are integer type variables and s is double.
    /*int a = 9 , b = 5 , x = 10;
    x += a += b; */
    // b = 5 , a = 14 , x = 24
    /*System.out.println(a);
    System.out.println(b);
    System.out.println(x);*/

    /*int a = 9 , x = 10;
    double s = 9.99;
	if (a >= s)
		x = a + 2;
	else
		x = a + 3;
    // a = 9 , x = 12
    System.out.println(a);
    System.out.println(x); */

    // ============================================================= //    
    // Q3
    // Determine how many times the body of the loop will execute (value of ‘count’ = ?), m and n are integer type variables:
    /*int m = 8;
    int n = 16;
    int count = 0;
	while (m % n != 0) {
		m += 3;
		n++;
		++count;
                System.out.println("HI");
	} */
    // 8,16 ; 11,17 ; 14,18 ; 17,19 ; 20,20;     
    
    // ============================================================= //    
    // Q4
    /*Scanner scanner = new Scanner(System.in);
    System.out.print("Value of n? ");
    int n = scanner.nextInt();
    while (n>0) {
         System.out.println(n);
         n--;
    }   */
    
    //For Loop  
    /*Scanner scanner = new Scanner (System.in);
    System.out.print("Value of n? ");
    int n = scanner.nextInt();
    int count = n;
    for ( int i = 0 ; i < count ; i++)
        {System.out.println(n);
        n--;}*/
    
    // ============================================================= //    
    // Q5
    // Assume x is an integer variable, what is the value of x after executing the following statements. a is an integer variable.
    /*int a = 5 , x = 0;
    while (a > 0)
        {a--;
         x += 2;
            if (a >= 2)
                x += 3;	}
    System.out.println(a);
    System.out.println(x); */

    // 5,0 ; 4,2 ; 4,5;     3,7 ; 3,10 ;    2,12 ; 2,15 ;   1,17 ;  0,19 ;
    // a = 0 ; x = 19
    
    // ============================================================= //    
    // Q6
    // Determine how many times (in terms of n) the body of the loop will be executed: 	(i is not modified inside the loop body) 	
    /*int i ;
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = scanner.nextInt();
    for (i = 0; i <= 3 * n + 1; i++) 
        count ++ ; 
    System.out.println(count); */
        
    // 0,3n+1 ; 1,3n+1
    // (3n+2) times
    
    // ============================================================= //    
    // Q7
    // Rewrite the following for-loop using “while”.
    /*int count = 0;
    int i , j = 0;
	for (i = 0; i < 7; i++) 
        {   for (j = 0; j < 5; j++) 
            {   count++;  }
	}
        
    System.out.println(count); */
    
    /*int i = 0 , j = 0, count = 0;
    while(i < 7)
        {while (j < 5)
            {
             count++;
             j++;}
        i++;
        j = 0;
        }
    
    System.out.println(count); */
    
    // ============================================================= //    
    // Q8
    // Determine the output
    /*int a=3, b=4, c=5, d=6, x=0;
    System.out.println(a > b && c < d);   //False
    System.out.println(a - x != 0 || b * c > 15 && b / a == 1);   //True
    System.out.println(b - a > 0 || ++a > 10 );   //True    */
    
    // ============================================================= //    
    // Q9 ******
    // Determine the output
    /*double incorrect_floating_point = 20.1 + 1 / 4;
    double correct_floating_point = 20.1 + 1.0 / 4;
        
    System.out.println("20.1 + 1 / 4 = " + incorrect_floating_point);   
    System.out.println("20.1 + 1.0 / 4 = " + correct_floating_point);   */
    
    // ============================================================= //    
    // Sample Questions
    // Q1
    

    // ============================================================= //    
    // Sample Questions
    // Q2
    
    /*for (int i = 1 ; i <= 10000; i++)
        { if (i%7 != 0 && (i-7)%10 != 0)
            System.out.println(i);
        } */
    
    int total = 0 ;
    boolean found = false; 
    for (int Jack = 2 ; Jack <= 5 ; Jack++)
        for (int Queen = 6 ; Queen<= 10 ; Queen++)
            for(int King = 11 ; King <= 20 ; King++)
            {   
                total ++;
                if ((King>Queen*2) && (Queen==Jack*3) && (King%3==1))
                    {if(!found)
                        {
                        System.out.println(Jack);
                        System.out.println(Queen);
                        System.out.println(King);
                        found = true;
                        }
                    } 
            }
    
    System.out.println(total);

    
    }
    
}