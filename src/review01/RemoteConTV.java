package review01;

public class RemoteConTV implements RemoteCon {
	public int volume = 0;
	
	public void on() {
		System.out.println("Turn on the TV.");
	}
	public void off() {
		System.out.println("Turn off the TV");
	}
	
	public void volumnUp() {
		volume ++;
	}
	public void volumnDown() {
		if(volume != 0) {
			volume --;
		}
	}
	public static void main(String[] args) {
		RemoteConTV rTV = new RemoteConTV();
		rTV.volumnUp();
		System.out.println(rTV.volume);
		rTV.volumnDown();
		System.out.println(rTV.volume);
		
		rTV.on();
	}
}
