//another method to implements thread with the help of interface

class First implements Runnable {
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("From First");
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
	public static void main(String[] args) {
		First obj1 = new First();
		Second obj2 = new Second();
		
		//if we use Runnable then we have to make object of thread
		Thread t1  = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try{Thread.sleep(100);}catch (Exception e) {};
		t2.start();

	}

}
