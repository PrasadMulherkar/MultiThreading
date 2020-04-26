package session1;

public class TaskTPrint extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		//Task1 T Print
		for(int i=0; i<5; i++) {
			System.out.println("T");
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
