package task2;
import java.util.Random;
import java.util.Scanner;

public class caipiao {
	public static void main(String args[]){
		Random r = new Random();
		int count=0;
	    int ran = r.nextInt(1000)+100;
	    System.out.println(ran);
	    Scanner input = new Scanner(System.in);
	    System.out.print("请输入一个三位无重复数字：");
	    int x=input.nextInt();
	    String str1 = String.valueOf(ran);
	    String str2 = String.valueOf(x);
		char[] arry1 = str1.toCharArray();
		char[] arry2 = str2.toCharArray();
		if(ran==x){
			System.out.println("恭喜你，奖金是10000美元！");
		}
		else{
		for (int i = 0; i < 3; i++) {
			for(int j=0;j<3;j++)
			{
				if(arry2[i]==arry1[j]){
				count++;
				break;
				}
			}
				
			}
		if(count==3)
		{
			System.out.println("恭喜你，奖金是3000美元！");
		}
		else if(count==2)
		{
			System.out.println("恭喜你，奖金是2000美元！");
		}
		else if(count==1)
		{
			System.out.println("恭喜你，奖金是1000美元！");
		}
		else
		{
			System.out.println("很遗憾，你没能中奖。");
		}
		}
	}
}
