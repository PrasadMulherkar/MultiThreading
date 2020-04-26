package session1;

public class TaskEPrint extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" starts");
		//Task2 E Print
		for(int j=0; j<5; j++) {
			System.out.println("E");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" ends");
	}
}
