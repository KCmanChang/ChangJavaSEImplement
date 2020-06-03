package tw.kc.chang.apps.javase.basic.implement;

public class Implement10SwitchCase {

	public static void main(String[] args) {
		int a = 10; final int b = 8;
		switch (a) { // switch可比對 int, byte, short, char, String, enum
			case 1:
				System.out.println("A");
				break;
			case b+2:
				System.out.println("B");
				break;
			case 100:
				System.out.println("C");
				break;
			default:
				System.out.println("X");
				break;
		}

	}

}
