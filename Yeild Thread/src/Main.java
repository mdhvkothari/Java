//Output may vary in machine to machine but chances of execution of yield() 
//thread first is higher than the other thread because main thread is always
//pausing its execution and giving chance to child thread(with same priority).


class thread extends Thread{
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class Main {
	public static void main(String[] args) {

		thread t = new thread();
		t.start();
		
		for(int i =0;i<5;i++){
			
			// Control passes to child thread 
			Thread.yield();
			 // After execution of child Thread 
            // main thread takes over 
			System.out.println(Thread.currentThread().getName());
			
		}
		
	}

}
