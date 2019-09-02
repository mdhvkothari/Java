//Best example of inter thread communication is producer consumer problem

class Q{
	int num;
	boolean valueSet = false;

	public synchronized void setQ(int num){
		
		while(valueSet){
			
			try{wait();}catch(Exception e){};
			
		}
		System.out.println("Put: "+num);
		this.num = num;
		valueSet = true;
		notify();
		
	}
	public synchronized void getQ(){
		while(!valueSet){
			try{wait();}catch(Exception e){};
		}
		System.out.println("Get: "+num);
		valueSet = false;
		notify();
	}
}


//thread one
class Producer implements Runnable{
	Q q;
	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	public void run() {
		int i=0;
		while(true){
			q.setQ(i++);
			try{Thread.sleep(1000);} catch(Exception e){};
		}
	}
}

//thread second
class Consumer implements Runnable{
	Q q;
	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	public void run() {
		while(true){
			q.getQ();
			try{Thread.sleep(1000);}catch(Exception e){};
		}
		
		
	}
}




public class Main {
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}

}