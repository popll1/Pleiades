package thread;

public class BeepPrintEx {
	public static void main(String[] args) {
		
//		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(new BeepTask());
		thread.start();
		
	}
}
