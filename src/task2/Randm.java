package task2;
import java.util.Random;

public class Randm {
	public static void main(String args[]){
	Random r = new Random();
    int ran = r.nextInt(12);
    String[] strArray={"January","February","March","April","May","June","July","August","September","October","November","December"};
    System.out.println(ran+1);
    System.out.println(strArray[ran]);
	}
}
