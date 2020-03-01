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
import java.io.FileWriter;
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
    
    /**
    *
    */
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
                FileWriter fileWriter = new FileWriter("file.txt", true);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.append(dueDate + "," + interval + "," + type + "," + value+"\n");
                printWriter.close(); 
            }
            catch(IOException e){
                System.out.println("File not found");
            }
        }         
    }
    
    /**
    *
    */
    public void update() throws FileNotFoundException, IOException{
        //Read in the user's balance
        File balRead = new File("balance.txt");
        Scanner balScan = new Scanner(balRead);
        Double tempBalance = Double.parseDouble(balScan.next());
        setBalance(tempBalance);
        
        //Add the user's income and expenses to the balance
        File tempRead = new File("temp.txt");
        File fileRead = new File("file.txt");
        try (Scanner file = new Scanner(fileRead);){
            file.useDelimiter(",|\\n");
            LocalDate currentDate = LocalDate.now();
            while(file.hasNext()){   
                LocalDate tempDate = LocalDate.parse(file.next());
                int interval = Integer.parseInt(file.next());
                int type = Integer.parseInt(file.next());
                Double value = Double.parseDouble(file.next());
                LocalDate newDueDate = tempDate;                
                //i don't know what the case switch actually does
                switch (interval) {
                    case 1:
                        if(tempDate.getDayOfMonth() <= currentDate.getDayOfMonth()
                                || tempDate.getMonthValue() < currentDate.getMonthValue()){
                            newDueDate = tempDate.plusDays(1);
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
                        System.out.println("no!!!");
                        break;
                }        
                FileWriter fileWriter = new FileWriter(tempRead, true);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.println(newDueDate + "," + interval + "," + type + "," + value);
                printWriter.close(); 
            }  
        }       
        fileRead.delete();
        saveBalance();
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
        saveBalance();
    } 
    
    /**
     * Saves balance to a text file
     */    
    public void saveBalance(){        
        try (PrintWriter printWriter = new PrintWriter("balance.txt")) {
            printWriter.println(String.valueOf(getBalance()));
        } 
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }                  
    }
}
