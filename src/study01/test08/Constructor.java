package study01.test08;

class Father{
	//	STEP 3
	int a;
	// STEP 4
	Father(){
		System.out.println("I'm a constructor in Father Constructor!");
	}
}

// Constructor = 생성자
public class Constructor extends Father {
	// STEP 5	
	int b = 10;
	
	// STEP 2
	Constructor(){
		System.out.println(b);
		// STEP 6
		System.out.println(a);
		// STEP 7
		System.out.println("I'm a constructor in Class Constructor!");
	}
	
	public static void main(String[] args) {
		// STEP 1
		Constructor c = new Constructor();
	}
}

/*
 * I'm a constructor in Father Constructor!
 * 10
 * 0
 * I'm a constructor in Class Constructor!
 */