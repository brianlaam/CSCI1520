package student;

import java.io.*;

public class Student {

    private String name;
    private int age;
    private String major;
    private long SID;
    
    public Student(String nameInput, long SIDInput)
    {
        name = nameInput;
        SID = SIDInput; 
    }        
    
    public Student (Student s)
    {
        age = s.age;
    }        
    
    public void setMajor(String majorInput)
    {
        major = majorInput;
    }
    
    public void setAge(int ageInput)
    {
        age = ageInput;
    }        

    public void printDetails()
    {
        System.out.println(name +", who has a SID of " + SID + ", is aged " + age + ", and major in " + major);
    }        
    
    public String displayMajor()
    {
        return major;
    }        
    

    
    public static void main(String[] args) {

    Student stu1 = new Student("Brian", 6222);
    stu1.setAge(19);
    stu1.setMajor("Statistics");
    
    stu1.printDetails();
    
    Student stu2 = new Student("Nicole", 6212);
    stu2.setAge(18);
    stu2.setMajor("Marketing");
    stu2.printDetails();

    System.out.println(stu2.displayMajor());    
      
    Student stu3 = stu1;
    stu3.printDetails();
    
    stu1.setAge(20);
    stu1.printDetails();
    stu3.printDetails();
   
    try {
    File file = new File("sample1.data");
    FileOutputStream out = new FileOutputStream(file);

    byte[] b = {11, 22, 33, 44};
    out.write(b);
    out.close();   
    }  catch ( FileNotFoundException e ) {
        System.out.println("File cannot be opened!");
    } catch ( IOException e ) {
        System.out.println("I/O error! Program exit.");
    }


    
    }   
}
