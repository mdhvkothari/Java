class First extends Thread{
	//we use always run as a name to get output
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("From first");
			try{Thread.sleep(1000);}catch (Exception e) {};
		}
		
	}
}

class Second extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("From Second");
			try{Thread.sleep(1000);}catch (Exception e) {};

		}
		
	}
}


public class Main {
	public static void main(String[] args) {
		First obj1 = new First();
		Second obj2 = new Second();
		
		//we have to first invoke thread
		obj1.start();
		//we use this sleep because if we don't use it both thread are collapse and give not expected output
		try{
			Thread.sleep(500);
		}
		catch(Exception e){
			
		}
		obj2.start();
		

	}

}
