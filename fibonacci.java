package logicalprogram;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,temp=0;
		int second=1;
		
		System.out.println("Enter number of terms");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(first+"\n"+second+" ");
		for(int i=0;i<num;i++) {
			temp=first+second;
			first=second;
			second=temp;
			System.out.println(temp+" ");
		}
	}

}
