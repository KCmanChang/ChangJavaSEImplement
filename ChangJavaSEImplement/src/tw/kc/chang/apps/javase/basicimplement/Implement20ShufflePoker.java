package tw.kc.chang.apps.javase.basicimplement;

public class Implement20ShufflePoker {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		// 洗牌
		int[] poker = new int[52];
		// for(int i = 0; i<poker.length; i++) poker[i] = i;
		
		for (int i = 0; i < poker.length; i++) {
			int rand = (int) (Math.random() * 52); // 0 - 51
			// 檢查機制，不重複
			boolean isRepeat = false;
			for (int j = 0; j < i; j++) {
				if (rand == poker[j]) {
					// 重複了
					isRepeat = true;
					break;
				}
			}
			if (!isRepeat) {
				poker[i] = rand;
				System.out.println(poker[i]);
			}else {
				i--;
			}
		}
		System.out.println(System.currentTimeMillis() - now);
	}

}
