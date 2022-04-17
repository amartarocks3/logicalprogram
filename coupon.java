package logicalprogram;

import java.util.Random;
import java.util.Scanner;

public class coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Random rand = new Random();
		int random1 = rand.nextInt();
		int empCheck = (int) (random1%(Math.pow(10,n)));
		System.out.println(empCheck);
	}

}
