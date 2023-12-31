package cumulate;

public class Cumulate {

     static int [] cumulate (int [] data)
    {   
        int [] cumulate;
        int sum = 0;
        
        if (data == null)
            return null;
        else
        {
            cumulate = new int [data.length];
        
            for (int i = 0 ; i < data.length  ; i++) {
                sum += data[i];
                cumulate[i] = sum;                
                }
            }
        return cumulate;
    }

    public static void main(String[] args) 
    {
        //Cumulate obj = new Cumulate();
        
        int [] rainfall = {6, 23, 45, 34, 56, 78, 102, 203, 167, 90, 86, 20};
        int [] result = cumulate(rainfall);
        System.out.println(result[11]);
        System.out.println(cumulate(null));
        
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + "  ");
        


    }           
}
