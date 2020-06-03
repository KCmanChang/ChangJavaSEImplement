package tw.kc.chang.apps.javase.basic.implement;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class interview2 {

	public static void main(String[] args) {
		int[] ai = new int[10], ti = null;
		int cnt, more, less, tmp;
		String input;
		cnt = more = less = 0;

		for (int i = 0; i < 10; i++) {
			input = JOptionPane.showInputDialog("輸入整數 ： " + "第" + (i + 1) + "次");
			if (input != null) {
				ai[cnt] = Integer.valueOf(input);
				cnt++;
				ti = new int[cnt];
			} else {
				break;
			}
		}
		System.out.println(Arrays.toString(ai));
		System.out.println(cnt);

		for (int i = 0; i < cnt; i++) {
			ti[i] = ai[i];
			if (ti[i] > 60) {
				more++;
			} else if (ti[i] < 50) {
				less++;
			}
		}

		System.out.println(Arrays.toString(ti));

		for (int i = 0; i < cnt; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (ti[i] > ti[j]) {
					tmp = ti[i];
					ti[i] = ti[j];
					ti[j] = tmp;
				}
			}
		}

		System.out.println(Arrays.toString(ti));
		System.out.println("大於60 : " + more);
		System.out.println("小於50 : " + less);

	}

}
