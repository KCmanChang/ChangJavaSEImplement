package tw.kc.chang.apps.javase.basic.implement;

import java.util.Scanner;

public class Implement03VaribleType {

	public static void main(String[] args) {
		byte a = 10, b = 3;
		int c = a + b; // byte, short, int => int
		long d = 12;
		long e = c + d;
		System.out.println(c);
		System.out.println(e);
	}

}
