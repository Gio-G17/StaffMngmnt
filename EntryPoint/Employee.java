import java.util.Scanner;
import doc.AdvancedWeek;

public class Employee {
    
  Scanner scan = new Scanner(System.in); 
 
    public String toString() {
        
      
            System.out.print("Please input the employee's first name: ");  
            String FirstName= scan.next();  
            
            
            System.out.print("Please input the employee's last name: ");  
            String LastName= scan.next();
            
            System.out.print("Please input the employee's age: ");  
            int Age= scan.nextInt();
            
            System.out.print("Please input the employee's Monthly Salary: ");  
            double MonthlySalary= scan.nextDouble();
            
           System.out.println("Employee information:" + FirstName + ", " + LastName + ", " + Age + ", " + MonthlySalary +".");
            return null;
                    
                    
                  
                        
    }
}