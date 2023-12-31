package problemsolver;

import javax.swing.JOptionPane;

/**
* CSCI1530 Assignment 4 Animated Zoo Problem Solver
* Aim: problem solving with Java using branching and repetition statements 
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
 * Date : 10 Mar 2023
 **/


public class ProblemSolver {
    public static void main(String[] args) {
        ZooGarden zoo = new ZooGarden();

        int limit = 20;
        int again;
        
        System.out.println("*** ProblemSolver ***");
        System.out.println("There are at most " + limit + " animals.");
        System.out.println("No solution.");

	String answer;
	answer = JOptionPane.showInputDialog("Input an int:");

        zoo.setRabbits(-1);
        zoo.setOxen(-1);
        zoo.setDragons(-1);

        
        
        
        
        
        
        
        
        
        
        
    }
}
