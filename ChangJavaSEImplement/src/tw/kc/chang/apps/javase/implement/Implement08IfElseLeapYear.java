package tw.kc.chang.apps.javase.implement;

import java.util.Scanner;

public class Implement08IfElseLeapYear {

	public static void main(String[] args) {
		System.out.println("Input year: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 4 == 0) {
			 if (year % 100 == 0) {
				 if (year % 400 == 0) {
					 System.out.println("閏年");
				 }else {
					 System.out.println("平年");
				 }
			 }else {
				 System.out.println("閏年");
			 }
		}else {
			System.out.println("平年");
		}
	}

}
