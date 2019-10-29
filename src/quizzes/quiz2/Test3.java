package quizzes.quiz2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test3 {
	public static void main(String[] args) {
		List<Integer> lottos = new ArrayList<>();
		Random r = new Random();
		while(lottos.size() <= 6) {
			int rNum = r.nextInt(45) + 1;
			lottos.add(rNum);
		}
		System.out.println(lottos);
	}
}

// [28, 1, 43, 18, 3, 21, 1]