//The statement �Thread.currentThread().join()�, will tell Main thread to wait 
//for this thread (i.e. wait for itself) to die. Thus Main thread wait for itself to die,
//which is nothing but a deadlock.


public class Main {
	public static void main(String[] args) {
		try{
			System.out.println("Entering into deadlock");
			Thread.currentThread().join();
			System.out.println("This statement will not execute");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		

	}

}
