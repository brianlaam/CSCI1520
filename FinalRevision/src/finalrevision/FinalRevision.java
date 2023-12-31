package finalrevision;

import java.io.PrintStream;
import java.util.Scanner;

public class FinalRevision {
    
    private int i = 0;
    
    public boolean contains123 ( String s ) //Q1
    {
        if (s.isEmpty() || s.contains("123"))
            return true;
        else
            return false;
    }

    public static long calSum (int a, int n)  //Q14
    {
        long sum = 0;
        for (int i = n; i >= 1; i--) 
            sum += Math.pow(a, i);
        return sum;
    }
    
    FinalRevision increment() //Q19
    {
        i++;
        return new FinalRevision();
    }

	void print() //Q19
        {
            System.out.println("Output i = " + i);
	}
    
        public static void printPattern(int N) 
        {
            if (N < 0)  return;
            if (N == 0) 
            {
                System.out.println('M'); 
                return;
            }
            for (int y = 0; y < N; y++) {         // N lines, y-axis
                for (int x = 0; x <2*N+2; x++) { // 2*N+1 symbols@line
                    if (x == 0 || x == 2*N+1) // vertical | | lines
                       System.out.print('|');
                    else if (x == y + 1)   // y grows as x grows
                       System.out.print('\\');
                    else if (x == 2*N - y) // y shrinks as x grows
                       System.out.print('/');
                    else
                       System.out.print(' ');
                    }
                System.out.println(); 
            }
        }

        private String prepare(char c, int n)
        {
            String s = "";
            for (int i = 0; i<n; i++)
                s += c;
            return s;
        }

        private String prepare(char c1, int n1, char c2, int n2, char c3, int n3)
        {
            return prepare(c1,n1) + prepare(c2,n2) + prepare(c3,n3);
        }
        

        public void a(PrintStream out) 
        {
            for (int i = 1; i <= 5; i++)
            {    out.print(i);
                for (int j = i+1; j < i+10; j++) 
                    out.print("," + j);
                out.println();            
            }
        }        

        public void c(PrintStream out) 
        {
            int i = 1;
            while (i <= 5)
            {
                out.print(i);
                for (int j = i+1; j < i+10; j++) 
                    out.print("," + j);
                out.println();
                i++;
            }
        }
                
        public int method(int x, int y)
        {
            y--;
            if (x + y > 3) 
                return x * 2;
            else
                if (x - y < 0)
                    return y-5;
            x++;
            return x * y;
        }





        
        
    public static void main (String[] args) 
    {   // Q1
        /*FinalRevision obj = new FinalRevision();
        
        String testString = "abc123def";
        boolean result = obj.contains123(testString);
        
        System.out.println(result);  */
        
        //===================================================
        //Q5         
        /*String s1 = "ABC"; 
        String s2 = "A" + "BC";
        String s3 = "A";
        s3 = s3 + "BC";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3); */
        
        //===================================================
        //Q6
        /*String s1 = "ABC"; 
        String s2 = "ABC"; 
        if (s1 == s2)
            System.out.println("same");
        else 
            System.out.println("different"); */
        
        //===================================================
        // Q7
        /*int i = 3/2; 
        switch (i) 
        { 
            case 0: System.out.println("aaa"); 
                break;
            case 1: System.out.println("bbb");
            case 2: System.out.println("ccc");
                break;
        } */
        
        //===================================================
        //Q8
	/*int i = 3%2; 
	do 
        { 
	    i--; 
	} while (i > 2); 
	System.out.println(i); */
        
        //===================================================
        //Q9
        /* int i; 
	double d = 3.7; 
	i = ((int) d ) * ((int)Math.round(d)); 			
        System.out.println(i); */
	
        //===================================================
        //Q10
        /*int count = 1; 
        while ( count != 10 )
            count = count + 2; 
        System.out.println(count); */
        
        //===================================================
        //Q11     
	/*int max = 5; 
	for (int row = 1; row <= max; row++) { 
            for (int star = 1; star <= row; star++) 					
                System.out.print("*");
        System.out.println();
        } */
        /*
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int star = 0; star <= i; star ++) {
                System.out.print("*");
            } 
            System.out.println();
        }
        */

        //===================================================
        //Q12
        //char myChar;
        //int number;
        
        /* if (number == 5)
            myChar = 'A';
        else
            if (number == 6)
                myChar = 'B' ;
        else
                myChar = 'C' ; */
            
        /* Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        switch(number)
        {
            case 5: myChar = 'A'; break;
            case 6: myChar = 'B'; break;
            default: myChar = 'C';
        }
        System.out.println(myChar); */
        
        //===================================================
        //Q13        
        /*int[] array = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = array.length - 1; i >= 0; i--) 
            System.out.println(array[i]); */
        
        //===================================================
        //Q14
        //long sum = FinalRevision.calSum(2, 5);
        //System.out.println(sum);
        
        //===================================================
        //Q15
        //FinalRevision.printPattern(5);
        
        //===================================================
        //Q16
        
        
        //===================================================
        //Q17
        /* double x = 50;
        double y = 20;
        double z = x + y;
        System.out.println("z is " + z); //70.0
        x = y; 
        y = x;
        System.out.println("x is " + x); //20.0
        System.out.println("y is " + y); //20.0
        z = z + y;
        System.out.println("z is " + z); //90.0 */
     
        //===================================================
        //Q18
        /* String S1 = "Computer Principles";
        String S2 = "and";
        String S3 = "Java Programming";
        
        char cChar = S3.charAt(10); //Count from 0
	System.out.println(cChar); //a 
        
        int iIndex = S2.indexOf("p");
	System.out.println(iIndex); //-1 == S2 does not contain "p"
        
        String sSubstr = S3.substring(1,7); // 7 is exclusive
	System.out.println(sSubstr); //ava Pr

        boolean bEquals = S2.equals("and");
	System.out.println(bEquals); */

        //===================================================
        //Q19
        //FinalRevision x = new FinalRevision();
    	//x.increment().increment().increment().print();
        
        //===================================================

        //FinalRevision p = new FinalRevision();
        //for (int h = 1; h <= 5; h++)
            //System.out.println(p.prepare('<', 5-h, '*', 2*h, '>', 3));
                  
        //===================================================
        //FinalRevision x = new FinalRevision();
        //x.a(System.out);
        
        //===================================================

        /*int[][] data = { {1, 2, 3}, {-9}, null, {-1, -1}, {2, 3, 5, 7} };
        System.out.print("Number of rows: "); 
        System.out.println(data.length); 
        System.out.print("Number of int elements on last row: "); 
        System.out.println(data[4][3]);

        data[2] = data[0] ; 
        data[0][2] = -data[0][2];
        System.out.println(data[2][1]); 
        System.out.println(data[2][2]); 


        data[0] = new int[10]; 
        System.out.println(data[2].length); */
    
        //===================================================        
        /*System.out.println("A" + 1 + 2); 
        System.out.println(1 + 2 +"B"); 
        System.out.println(1 + 2 + '\\'); 
        System.out.println((char)("AAA".length() + 'A')); 
        System.out.println("APPLICATION".substring(5, 8)); */
    
        //===================================================          
        
        FinalRevision x = new FinalRevision();
        System.out.println(x.method(4, -1)+7);
        System.out.println();
        System.out.println();

        
    }
}