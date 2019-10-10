package study01.test11;

// Interface : 설계서(specifications)
// Class : 구현(realization)

// ENum?! (For now, pass)

interface Promise {
	// Java 1.8부터는 자기 영역을 가질 수 있지만, 일단은 없는 것으로 간주하세요~
	// Cares about the final quality of a product.
	// Doesn't care about how you made a product.
	void test();
	// Doesn't have a scope.
}

class ParentClass{
	// Must have a scope.
	void test() {
		
	}
}

public class Interface01 implements Promise {
	
	// Interface : Must override!!!
	// Method : Overriding is an optional.
	public void test() {
		
	}
}

