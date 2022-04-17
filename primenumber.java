package logicalprogram;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to check if the number is prime or not ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		if(num>0) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				++count;
			}
		}}
		if(count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("Not prime number");
		}
		System.out.println();
	}

}
