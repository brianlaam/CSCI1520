package firstprogram; 
/**
 * First Program in Java
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
 * Date : 17 Jan 2023
*/

public class FirstProgram { 
 public void welcomeMessage() { 
 // TODO: write your own statements to show your GIVENNAME in ALL CAPS without space 
 System.out.println("My Given Name is HOICHUN"); 
 // TODO: write your own statements to show your GIVENNAME letter-by-letter in Morse Code 
 System.out.println("Morse Code is H....O---I..C-.-.H....U..-N-."); 
 // TODO: write your own statements to display your Last Name in BIG LETTERS (ASCII Art)! 
 // if your Last Name has more than 7 characters, you may shorten it to 7. 
 // Note: altogether there shall be NINE lines in the Output window, see sample below 
  System.out.println("My Last Name is"); 
  System.out.println(" _          ___     ___  ___"); 
  System.out.println("| |        / _ \\    |  \\/  |"); 
  System.out.println("| |       / /_\\ \\   | .  . |"); 
  System.out.println("| |       |  _  |   | |\\/| |"); 
  System.out.println("| |____   | | | |   | |  | |"); 
  System.out.println("\\_____/   \\_| |_/   \\_|  |_/"); 
 }
/** 
 * Starting point of your Java program, the main() method of your class, do NOT modify 
 */ 
 public static void main(String[] args) { 
 // declare an object variable 
 FirstProgram myObject; 
 // create a new object and assign it to a variable 
 myObject = new FirstProgram(); 
 // send message to your object 
 myObject.welcomeMessage(); 
 } 
}