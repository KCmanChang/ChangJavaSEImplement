package tw.kc.chang.apps.javase.basicimplement;

public class Implement09IfElse2 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		if (a++ <=10 && b-- >=3) {
			System.out.printf("OK: a = %d, b = %d\n", a, b);
		}else {
			System.out.printf("XX: a = %d, b = %d\n", a, b);
		}
		
		if (a++ <=10 || b-- >=3) {
			System.out.printf("OK: a = %d, b = %d\n", a, b);
		}else {
			System.out.printf("XX: a = %d, b = %d\n", a, b);
		}
		
		if (++a <=10 && --b >=3) {
			System.out.printf("OK: a = %d, b = %d\n", a, b);
		}else {
			System.out.printf("XX: a = %d, b = %d\n", a, b);
		}
		
		if (++a <=10 || --b >=3) {
			System.out.printf("OK: a = %d, b = %d\n", a, b);
		}else {
			System.out.printf("XX: a = %d, b = %d\n", a, b);
		}

	}

}