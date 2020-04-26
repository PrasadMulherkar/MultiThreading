package session1;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		System.out.println("Hello in Main");
		System.out.println("Main thread starts");
		
		//Task1
		TaskTPrint task1 = new TaskTPrint();
		task1.start();
		task1.join();
		//Task2
		TaskEPrint task2 = new TaskEPrint();
		task2.start();
		task2.join();
		System.out.println("Main thread ends");
		System.out.println("Time needed :- "+(System.currentTimeMillis() - start)/1000);
	}

}
