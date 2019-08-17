class Initalize{
	{
		System.out.println("Run before constructor");
	}
	public Initalize() {
		System.out.println("Default constructor invoke");
	}
	public Initalize(int x){
		System.out.println("Parameterized constructor");
	}
}


public class Main {
	public static void main(String[] args) {
		
		Initalize initalize1, initalize2;
		initalize1 = new Initalize();
		initalize2 = new Initalize(0);

	}

}
