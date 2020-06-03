package tw.kc.chang.apps.javase.basic.implement;

import java.util.Scanner;

public class Implement02Arithmetic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int resultplus = x + y;
		int resultminus = x - y;
		int resultmult = x * y;
		int resultdivision = x / y;
		int resultremaind = x % y;
		System.out.printf("%d + %d = %d\n", x, y, resultplus);
		System.out.printf("%d - %d = %d\n", x, y, resultminus);
		System.out.printf("%d * %d = %d\n", x, y, resultmult);
		System.out.printf("%d / %d = %d......%d\n", x, y, resultdivision, resultremaind);
	}

}
