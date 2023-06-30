package thread;

public class Temp extends Thread {
	@Override
	public void run() {
	}

	public static void main(String[] args) {
		Thread thread = new Thread() {

			@Override
			public void run() {
			}
		};
		thread.start();
	}
}
