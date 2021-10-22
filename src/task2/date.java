package task2;
import java.util.Scanner;

public class date {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year(e.g.:2021): ");
		double k=input.nextDouble();
		System.out.print("Enter month(e.g.:1-12): ");
		double m=input.nextDouble();
		System.out.print("Enter the day of tje month(1-31): ");
		double q=input.nextDouble();
		double x;
		x=(q+((26*(m+1))/10)+k+k/4+k/400+k/20)%7;
		System.out.print("Day of the week is ");
		String[] strArray={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		System.out.print(strArray[(int)x]);
		
		
	}

}
