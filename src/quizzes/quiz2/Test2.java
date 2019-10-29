package quizzes.quiz2;

import java.util.ArrayList;
import java.util.List;

class Test22{
	public Test22(int num1) {
		System.out.println("Hello");
	}
}

public class Test2 {
	public static void main(String[] args) {
		List<Test2> strList = new ArrayList<>();
		strList.add(new Test2());
		
		List<Test22> strList2 = new ArrayList<>();
		strList2.add(new Test22(2));		
	}
}
