package tw.kc.chang.apps.javase.basic.implement;

public class Implement23VaribleExchang {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int c = a;
		a = b;
		b = c;
		System.out.printf("a = %d, b = %d", a, b);

	}

}
