package logicalprogram;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int temp=0,res=0;
		
		int num=sc.nextInt();
		while(num!=0) {
			res=res*10;
			temp=num%10;
			num=num/10;
			res=res+temp;
		}
		System.out.println(res);
	}

}
