package review01;

public class RemoteConAirCon implements RemoteCon {
	public void on() {
		System.out.println("Turn on the air conditioner.");
	}
	public void off() {
		System.out.println("Turn off the air conditioner");
	}
}
