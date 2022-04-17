package logicalprogram;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class stopwatch {
	public static void main(String[] args) {
		LocalTime time1=java.time.LocalTime.now();
		Scanner sc = new Scanner(System.in);
		LocalTime time2 = null;
		int i=1;
		while(i!=0) {
			i++;
			System.out.println("To stop the stop watch press 0");
			i=sc.nextInt();
			if(i==0) {
				time2=java.time.LocalTime.now();
			}

		}
		long diffhr = ChronoUnit.HOURS.between(time1,time2);
		long diffmin = ChronoUnit.MINUTES.between(time1,time2);
		long diffsec = ChronoUnit.SECONDS.between(time1,time2);
		diffsec=diffsec%60;
	System.out.println("Start time = "+ time1 + " End time = "+time2+" Difference = "+diffhr+" Hr "+diffmin+" min "+diffsec+ " sec");
	}
}
