// we can't override private method from another class we can override it with in a same class
//An inner class can access private members of its outer class.

public class Main {

	private String name = "Madhav";
	
	private void fun(){
		System.out.println("Outer fun()");
	}
	
	class inner extends Main{
		private void fun(){
			System.out.println("Override"+name);
		}
	}
	
	
	public static void main(String[] args) {
		
		Main main = new Main();
		inner i = main.new inner();
		main.fun();
		i.fun();
	}

}
