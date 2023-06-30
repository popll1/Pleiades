package thread;

import java.awt.Toolkit;

//익명객체로 만들기
public class BeepPrintEx5 {
	Thread thread = new Thread() {
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
	};
}


	




