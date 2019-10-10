package study01.test11;

public class Execute {
	public static void main(String[] args) {
		// Can use "Remote02" interface
		Remote02 r = new TvRemoteCon();
		r.on();
		Remote02 r2 = new AirConRemoteCon();
		r2.on();
	}
}

/*
 * Interface : must use 'public."
 */