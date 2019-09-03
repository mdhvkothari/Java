class DeamonTheread extends Thread{
	public DeamonTheread(String name){
		super(name);
	}
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println(getName()+" is a Deamon Thread");
		}
		else{
			System.out.println(getName()+" is User Thread");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		DeamonTheread d1 = new DeamonTheread("t1");
		DeamonTheread d2 = new DeamonTheread("t2");
		//if we use d1.setDeamon after starting the thread it will show an error
		d1.setDaemon(true);

		d1.start();
		
		d2.start();
	}

}
