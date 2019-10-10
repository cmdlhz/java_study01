package study01.test11;

// Click "Add unimplemented methods".
public class TvRemoteCon02 implements Remote02 {
	public int volume = 0;
	@Override
	public void on() {
		System.out.println("Turn on the TV.");
	}

	@Override
	public void off() {
		System.out.println("Turn off the TV.");
	}
	
	public void volumeUp() {
		volume++;
	}
	public void volumeDown() {
		if(volume != 0) {
			volume--;
		}
	}
	
	public static void main(String[] args) {
		TvRemoteCon02 r = new TvRemoteCon02();
		r.volumeUp();
		System.out.println(r.volume);
		r.volumeDown();
		System.out.println(r.volume);
	}
}
