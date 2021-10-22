package task2;
import java.util.Scanner;
public class circumference {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三个数字：");
	    double a=input.nextDouble();
	    double b=input.nextDouble();
	    double c=input.nextDouble();
		if(a+b>c&&a+c>b&&b+c>a){
			System.out.print("三角形的周长为：");
			System.out.println(a+b+c);
			
		}
		else{
			System.out.println("无法构成三角形。");
		}
	}
}
