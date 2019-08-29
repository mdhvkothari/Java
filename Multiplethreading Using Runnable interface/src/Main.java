//another method to implements thread with the help of interface

class First implements Runnable {
	public void run(){
		for(int i=0;i<5;i++){
			//priority of thread
			//Range of priority is in between 1 to 10 1 is least priority
			System.out.println("From First " + Thread.currentThread().getPriority());
			try{Thread.sleep(1000);}catch(Exception e){};
		}
	}
}

class Second implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("From second");
			try{Thread.sleep(1000);}catch(Exception e){};
		}
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		Runnable obj1 = new First();
		Runnable obj2 = new Second();
		
		//if we use Runnable then we have to make object of thread
		Thread t1  = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		//we can change priority of thread
		t1.setPriority(1);
		//we can check the priority of thread
		System.out.println("Priority of thread t1 is: " + t1.getPriority());
		
		//we can give a name to thread
		//t1.setName("hi");
		
		t1.start();
		try{Thread.sleep(100);}catch (Exception e) {};
		t2.start();
		
		//if we want to print anything it will give mixed with above result so we use join which
		// join both t1  and t2 thread with main thread it throws exception so we use in main method 
		t1.join();
		t2.join();
		System.out.println("bye");
		
		

	}

}
