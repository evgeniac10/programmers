package 프로그래머스_알고리즘;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class 프로그래머스_1단계_두개뽑아서더하기 {
	public int[] solution(int[] numbers) {
		int[] answer = {};
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				hs.add(numbers[i] + numbers[j]);
			}
		}
		Iterator<Integer> it = hs.iterator();
		list.add(it.next());
			
		return answer;
	}
	
}
