package logicalprogram;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to check if the number is perfect or not");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int tem=0;
		int temp=num;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				tem=tem+i;
			}
		}
		if(temp==tem) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("Not perfect number");
		}
	}

}
