package tw.kc.chang.apps.javase.basic.implement;

public class interview {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,3,5,7,9,8,6,4,2};
		int n = 9, tmp;
		
		for (int i = 0; i<n; i = i+1) {
			tmp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = tmp;
		}
		
		for (int i = 0; i<n/2; i = i+1) {
			System.out.printf("%d %d\n", a[i], a[n-i-1]);
		}
	}
}
