package task2;
import java.util.Scanner;
public class circle2 {
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
	double a1=input.nextDouble();
	double b1=input.nextDouble();
	double c1=input.nextDouble();

	System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
	double a2=input.nextDouble();
	double b2=input.nextDouble();
	double c2=input.nextDouble();

	if(Math.abs(a1-a2)<c1+c2&&Math.abs(a1-a2)<c1-c2)
	{
	System.out.print("circle2 is inside circle1");}
	else if(Math.abs(a1-a2)<c1+c2&&Math.abs(a1-a2)>c1-c2){
	System.out.print("circle2 overlaps circle1");}
	else{
		System.out.print("circle2 does not overlap circle1");
	}
}
}
