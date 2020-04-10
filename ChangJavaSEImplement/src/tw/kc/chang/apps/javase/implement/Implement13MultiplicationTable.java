package tw.kc.chang.apps.javase.implement;

public class Implement13MultiplicationTable {

	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 5; i++) {
				int r = i * j;
				System.out.print(i + " x " + j + " = " + r + "\t");
			}
			System.out.println();
		}
	}

}
