package task2;
import java.util.Scanner;
public class circumference {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("�������������֣�");
	    double a=input.nextDouble();
	    double b=input.nextDouble();
	    double c=input.nextDouble();
		if(a+b>c&&a+c>b&&b+c>a){
			System.out.print("�����ε��ܳ�Ϊ��");
			System.out.println(a+b+c);
			
		}
		else{
			System.out.println("�޷����������Ρ�");
		}
	}
}
