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
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.io.IOException;
import java.io.FileNotFoundException;
public class User {
    String name;
    Double balance;
    public User(String n, Double i){
        name = n;
        balance = i;
    }
    
    /**
     * Sets the user's name
     * @pre name not null
     * @param n The name to be set
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
    
    public void setDetails(int type, Double value, int interval) throws IOException{
        assert type == 0 || type == 1;
        if(interval == 0){
            if(type == 0){
                balance += value;
            }else{
                balance -= value;
            }
        }else{
            LocalDate dueDate = LocalDate.now();
            switch (interval) {
            case 1:
                dueDate = dueDate.plusDays(1);
                break;
            case 2:
                dueDate = dueDate.plusWeeks(1);
                break;
            case 3:
                dueDate = dueDate.plusMonths(1);
                break;
            default:
                break;
            }
            try {
                PrintWriter printWriter = new PrintWriter("file.txt");
                printWriter.println(dueDate + "," + interval + "," + type + "," + value);
                printWriter.close(); 
            }
            catch(IOException e){
                System.out.println("File not found");
            }
        }         
    }
    
    public void update() throws FileNotFoundException, IOException{
        File tempRead = new File("temp.txt");
        File fileRead = new File("file.txt");
        Scanner file = new Scanner(fileRead);
        file.useDelimiter(",");
        LocalDate currentDate = LocalDate.now();
        while(file.hasNextLine()){
            LocalDate tempDate = LocalDate.parse(file.next());        
            int interval = Integer.parseInt(file.next());
            int type = Integer.parseInt(file.next());
            Double value = Double.parseDouble(file.next());
        
            LocalDate newDueDate = tempDate;
            switch (interval) {
                case 1:
                    if(tempDate.getDayOfMonth() <= currentDate.getDayOfMonth()
                            || tempDate.getMonthValue() < currentDate.getMonthValue()){
                        newDueDate = tempDate.plusDays(1);
                        System.out.println("yes");
                        if(type == 0){
                            balance += value;
                        }else{
                            balance -= value;
                        }
                    }
                    break;
                case 2:
                   if(tempDate.getDayOfMonth() <= currentDate.getDayOfMonth()
                           || tempDate.getMonthValue() < currentDate.getMonthValue()){
                        newDueDate = tempDate.plusWeeks(1);
                        if(type == 0){
                            balance += value;
                        }else{
                            balance -= value;
                       }
                    }
                    break;
                case 3:
                    if(tempDate.getDayOfMonth() <= currentDate.getDayOfMonth()
                           || tempDate.getMonthValue() < currentDate.getMonthValue()){
                        newDueDate = tempDate.plusMonths(1);
                        if(type == 0){
                          balance += value;
                        }else{
                            balance -= value;
                        }
                    }
                    break;
                default:
                    break;
            }        
            PrintWriter printWriter = new PrintWriter(tempRead);
            printWriter.println(newDueDate + "," + interval + "," + type + "," + value);
            printWriter.close(); 
            }      
        file.close();
        fileRead.delete();
        boolean success = tempRead.renameTo(fileRead);
        System.out.println(success);                
    }
    
    /**
     * Retrieves the user's income
     * @return the user's income
     */
    public Double getBalance(){
        return balance;
    }  
    
    /**
     * Retrieves the user's income
     * @return the user's income
     */
    public void setBalance(Double b){
        balance = b;
    } 
    
    /**
     * Saves name, income and expenses to a text file
     */
    public void save() throws IOException{        
        try {
            PrintWriter printWriter = new PrintWriter("file.txt");
            //printWriter.println(getName() + "," + getIncome() + "," + getExpenses());
            printWriter.close (); 
        }
        catch(IOException e){
            System.out.println("File not found");
        }        
          
    }
}
