package study01.test11;

public interface Remote02 {
	public void on();
	public void off();
	
	/*
	 * Interface doesn't have a scope.
	 * ('constructor' : declare a variable & define a scope)
	 * ==> Interface can't create a memory with a constructor.
	 *********** ERROR **********
	 * Remote(){
	 * 
	 * }
	 */
}
