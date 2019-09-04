//Singleton are those class which have only one instance
//In java singleton there is keyword so we have to follow three rules
//1. Make object of class inside class
//2. Make constructor private
//3. make a static method to pass static object which made in step in 1

class Singleton{
	// now it will take memory while we are not using the class
	//so we put into constructor and check where obj is created or not
	//public static Singleton obj = new Singleton();
	public static Singleton obj;
	private Singleton(){
		System.out.println("Constructor called");
	}
	public static Singleton getContructor(){
		if(obj == null){
			obj = new Singleton();
		}
		return obj;
	}
}



public class Main {

	public static void main(String[] args) {
		
		Singleton s1  = Singleton.getContructor();
		Singleton s2  = Singleton.getContructor();
	}

}
