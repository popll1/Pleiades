package thread;

import java.awt.Toolkit;

// P.520
public class Thread01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(3000);//1000 = 1초
			
			
		}
	}

}
