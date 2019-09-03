class PC{
	public synchronized void producer() throws Exception {
		System.out.println("producer running thread");
		wait();
		System.out.println("Back to producer");
	}
	
	public synchronized void consumer() throws Exception {
		System.out.println("Consumer thread");
		notify();
		Thread.sleep(2000);

	}
}


public class Main {
	public static void main(String[] args) throws Exception {
		final PC pc = new PC();
		Thread t1 = new Thread( new Runnable() {
			
			public void run() {
				try{pc.producer();}catch(Exception e){};
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				try{pc.consumer();}catch(Exception e){};
				
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}
