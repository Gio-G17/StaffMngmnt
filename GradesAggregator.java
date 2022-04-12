import java.util.Scanner;

public class GradesAggregator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		double arr[] = new double[5];
		double grdsum = 0;

        	for(int i=1; i<=5; i++) {
        System.out.println("Input the grade of assignment " + i);
        	arr[i-1]=scan.nextDouble();

		if (arr[i-1] < 0 || arr[i-1] > 100) {
			System.out.println("Please enter a valid grade!");
			i--;
		}else { 
			continue;
		}
	}

			for(int i=0; i<5; i++){
            			grdsum += arr[i];}

	System.out.println("Input number of attended labs");
        double atnd = scan.nextInt();

	while (atnd < 0 || atnd > 7){
		System.out.println("Please enter a valid number!");
		System.out.println();
		System.out.println("Input number of attended labs");
		double newval = scan.nextInt();
		atnd = newval;
	}

        System.out.println("Input the midterm grade");
        double mid = scan.nextDouble();

	while (mid < 0 || mid > 100){
		System.out.println("Please enter a valid grade!");
		System.out.println();
		System.out.println("Input the midterm grade");
		double newval = scan.nextInt();
		mid = newval;
	}

        

        System.out.println("Assignments (30%):" + grdsum/5*0.3);
        System.out.println("Attendance (5%):" + atnd/7*100*0.05);
        System.out.println("Midterm (30%):" + mid*0.3);

        
    }
}