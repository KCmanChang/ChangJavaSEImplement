package tw.kc.chang.apps.javase.basic.implement;

public class Implement26While {

	public static void main(String[] args) {
		/* int a = 1;
		while (a<10) {
			System.out.println(a++);
		}
		a = 1;
		for (;a<10;) {
			System.out.println(a++);
		} */
		
		int i = 0, sum = 0, last = 10;
		while (i<=last) {
			sum += i++;
			
			// sum +=i;
			// i++;
			
			// sum = sum + i;
			// i = i+1;
		}
		System.out.printf("1 + 2 + 3 + ...... + %d = %d", last, sum);

	}

}
