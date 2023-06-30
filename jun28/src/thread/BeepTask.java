package thread;

import java.awt.Toolkit;

//쓰레드를 상속받기
public class BeepTask implements Runnable {
// 실제 작업은 런에 적어줍니다. 실행은 start()
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
		}
}
