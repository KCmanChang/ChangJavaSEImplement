package tw.kc.chang.apps.javase.basicimplement;

import java.util.Collections;
import java.util.LinkedList;

public class Implement24ShufflePoker4 {

	public static void main(String[] args) {
		// 炫技用洗牌
		LinkedList<Integer> poker = new LinkedList<Integer>();
		for(int i = 0; i<50; i++) {
			poker.add(i);
		}
		Collections.shuffle(poker);
		
		for (Integer v : poker) {
			System.out.println(v);
		}
				
	}

}
