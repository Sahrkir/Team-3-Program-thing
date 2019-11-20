/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp5022project;
import java.util.Scanner;

/**
 *
 * @author Jacob
 */
public class Comp5022Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        boolean menuActive = true;
        Scanner in = new Scanner(System.in);  
        User user = new User("Test", 0.0, 0.0);
        System.out.println("To set income type 'SetInc'. To set expenses type 'SetExp'."
                + "To add to income type 'AddInc'. To add to expenses type 'AddExp'."
                + "To show income type 'GetInc'. To show expenses type 'GetExp'.");
        while(menuActive){
            System.out.println("Please enter a command.");
            String input = in.nextLine();
            switch(input){
                case "SetInc":
                    System.out.println("Enter your income");
                    user.setIncome(new Double(in.nextLine()));
                    break;
                case "SetExp":
                    System.out.println("Enter your expenses");
                    user.setExpenses(new Double(in.nextLine()));
                    break;
                case "AddInc":
                    System.out.println("Enter the income to add");
                    user.addIncome(new Double(in.nextLine()));
                    break;
                case "AddExp":
                    System.out.println("Enter the expenses to add");
                    user.addExpenses(new Double(in.nextLine()));
                    break;
                case "GetInc":
                    System.out.println("Income: "+user.getIncome());
                    break;
                case "GetExp":
                    System.out.println("Expenses: "+user.getExpenses());
                    break;
                default:
                    break;
            }
        } 
    }    
}
