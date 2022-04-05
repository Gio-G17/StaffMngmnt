import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;


public class ExpensesTracker{
	public static void main(String[] args) throws IOException{
		FileWriter writer = new FileWriter("expenses.txt");
		Scanner scan = new Scanner(System.in);

		String name;
		String item;
		double cost;
		String decision = "";

		do{
			System.out.println("Enter your name: ");
		name = scan.next();
			System.out.println("What did you purchase? ");
		item = scan.next();
			System.out.println("How much did you pay? ");
		cost = scan.nextDouble();

			writer.write( name + " purchased " + item + " for " + cost + " US Dollars.");
      
			System.out.println("Would you like to log another purchase? (y/n)");
		decision = scan.next();
		   }

		while(decision.equals("y"));

		if(decision.equals("n")){
      			System.out.print("Get off of ZoodMall!");
		   }

      writer.close();
      scan.close(); 
  }
}