/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp5022project;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Jacob
 */
public class Comp5022Project {

    /**
     * @param args the command line arguments
     */
    void Inc_Exp() throws IOException {
        boolean menuActive = true;
        Date date = new Date();
        Scanner in = new Scanner(System.in);  
        User user = new User("Test", 0.0);
        user.update();
        System.out.println("To add income type 'AddInc'. To add expenses type 'AddExp'."
                + "To set balance type 'SetBal'. To show balance type 'GetBal'.");
        while(menuActive){
            System.out.println("Please enter a command.");
            String input = in.nextLine();
            switch(input){
                case "AddInc":
                    System.out.println("How much money is being added?");
                    Double inc = new Double(in.nextLine());
                    System.out.println("How often is it being added?\n"
                            + "Type 0 for a one-off income, 1 for daily, 2 for weekly, and 3 for monthly");
                    
                    user.setDetails(0, inc, Integer.parseInt(in.nextLine()));
                    break;
                case "AddExp":
                    System.out.println("How much money is being spent?");
                    Double exp = new Double(in.nextLine());
                    System.out.println("How often is it being spent?\n"
                            + "Type 0 for a one-off expense, 1 for daily, 2 for monthly, and 3 for yearly");
                    
                    user.setDetails(1, exp, Integer.parseInt(in.nextLine()));
                    break;
                case "SetBal":
                    System.out.println("Enter the balance to set");
                    user.setBalance(new Double(in.nextLine()));
                    break;
                case "GetBal":
                    System.out.println("Balance: "+user.getBalance());
                    break;
                default:
                    break;
            }
        } 
    }
    
    public static void main(String[] args) {
        ExpenseManager em = new ExpenseManager();
        em.setVisible(true);
    }
           
}
