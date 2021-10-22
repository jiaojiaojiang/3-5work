package task2;
import java.util.Scanner;
public class triangle2 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double a1=input.nextDouble();
		double b1=input.nextDouble();
		double c1=input.nextDouble();
		double d1=input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double a2=input.nextDouble();
		double b2=input.nextDouble();
		double c2=input.nextDouble();
		double d2=input.nextDouble();
		if(Math.abs(a1-a2)<c1+c2&&Math.abs(a1-a2)<c1-c2)
		{
		System.out.print("r2 is inside r1");}
		else if(Math.abs(a1-a2)<c1+c2&&Math.abs(a1-a2)>c1-c2){
		System.out.print("r2 overlaps r1");}
		else{
			System.out.print("r2 does not overlap r1");
		}
	}
}
