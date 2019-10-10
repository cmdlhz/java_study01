package study01.test11;

public class AirConRemoteCon implements Remote02 {

	@Override
	public void on() {
		System.out.println("Turn on the air conditioner.");
	}

	@Override
	public void off() {
		System.out.println("Turn off the air conditioner.");
	}

}
