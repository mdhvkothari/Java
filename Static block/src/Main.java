//this static block is called only once time not like initialized block

class Static {
	static{
		System.out.println("From static block");
	}
	public Static() {
		System.out.println("From constructor");
	}
	public Static(int x) {
		System.out.println("From parameterized constructor");
	}
}



public class Main {

	public static void main(String[] args) {
		Static static1 = new Static();
		Static static2 = new Static();
		

	}

}
