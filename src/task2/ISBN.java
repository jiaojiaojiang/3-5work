package task2;
import java.util.Scanner;
import java.util.Arrays;
public class ISBN {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int sum=0,s=0;
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String x=input.next();
		char [] strArr1 = x.toCharArray();
		 for (int i = 0; i < strArr1.length; i++) {

			 sum+=((int)strArr1[i]-48)*(i+1);
		
		 }
		
		if(sum%11==10)
		{
			System.out.print("The ISBN-10 number is ");
			System.out.print(x);
			System.out.println("X");
		}else{
			System.out.print("The ISBN-10 number is ");
		    System.out.print(x);
		    System.out.println(sum%11);
		}
	}
	}
