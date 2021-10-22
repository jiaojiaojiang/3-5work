package task2;
import java.util.Scanner;
public class rectangle {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		if(a<=5.0&&b<=2.5){
		System.out.print("Point ("+a+","+b+")"+" is in the rectangle");}
		else{
		System.out.print("Point ("+a+","+b+")"+" is not in the rectangle");}
	}
}
