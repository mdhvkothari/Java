import java.util.LinkedList; 


class PC {
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity =2;
	int value=0;
	public synchronized void producer() throws InterruptedException{
		while(true){
			if(list.size()==capacity){
				wait();
			}
			System.out.println("Produce: "+value);
			list.add(value++);
			notify();
			Thread.sleep(1000);
		}
		
		
	}
	
	public synchronized void consumer() throws Exception{
		while(true){
			if(list.size()==0){
				wait();
			}
		int val = list.removeFirst();
		System.out.println("Consume: "+val);
		notify();
		Thread.sleep(1000);
		
		}
	}
}



public class Main {
	public static void main(String[] args) throws Exception {
		final PC pc = new PC();
		Thread t1 = new Thread(new Runnable() {
			
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
