package tw.kc.chang.apps.javase.basic.implement;

public abstract class text1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 15; i<=5; i=i-2) {
			System.out.println(i);
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(sum);

	}

}
