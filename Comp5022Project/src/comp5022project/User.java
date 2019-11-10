/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp5022project;

/**
 *
 * @author Jacob
 */
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
public class User {
    String name;
    Double income;
    Double expenses;
    public User(String n, Double i, Double e){
        name = n;
        income = i;
        expenses = e;
    }
    
    /**
     * Sets the user's name
     * @pre name not null
     */
    public void setName(String n){
        name = n;
    }
    
    /**
     * Retrieves the user's name
     * @return the user's name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Sets the user's income
     */
    public void setIncome(Double i){
        income = i;
    }
    
    /**
     * Retrieves the user's income
     * @return the user's income
     */
    public Double getIncome(){
        return income;
    }    
    
    /**
     * Sets the user's expenses
     */
    public void setExpenses(Double e){
        expenses = e;
    }
    
    /**
     * Retrieves the user's expenses
     * @return the user's expenses
     */
    public Double getExpenses(){
        return expenses;
    }
    
    /**
     * Adds the specified amount to the user's income
     */
    public void addIncome(Double i){
        income += i;
    }
    
    /**
     * Adds the specified amount to the user's expenses
     */
    public void addExpenses(Double e){
        expenses += e;
    }
    
    /**
     * Saves name, income and expenses to a text file
     */
    public void save() throws IOException{        
        try {
            File file = new File("file.txt");
            PrintWriter printWriter = new PrintWriter("file.txt");
            printWriter.println(getName() + "," + getIncome() + "," + getExpenses());
            printWriter.close (); 
        }
        catch(IOException e){
            System.out.println("File not found");
            e.printStackTrace();
        }        
          
    }
}
