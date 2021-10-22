package task2;
import java.util.Scanner;
public class circle {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		if(a*a+b*b>100){
		System.out.print("Point ("+a+","+b+")"+" is not in the circle");}
		else{
		System.out.print("Point ("+a+","+b+")"+" is in the circle");}

	}
}
