package task2;
import java.util.Scanner;
import java.util.Random;
public class poker {
	public static void main(String args[]){
		Random r = new Random();
	    int ran1 = r.nextInt(13);
	    int ran2 = r.nextInt(4);
		String[] strArray1={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] strArray2={"Clubs","Diamonds","Hearts","Spades"};
		System.out.print("The card you picked is "+strArray1[ran1]+" of "+strArray2[ran2]);
	}
}
