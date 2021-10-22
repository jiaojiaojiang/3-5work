package task2;
import java.util.Scanner;
public class triangle {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double s1=a*50;
		double s2=b*100;
		double s3=(Math.abs(a+2*b-200))/(Math.sqrt(5))*Math.sqrt(50000)/2;
		if(s1+s2+s3==10000){
		System.out.print("Point is in the triangle");}
		else{
		System.out.print("Point is not in the triangle");}
	}
}
