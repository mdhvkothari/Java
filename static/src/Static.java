
// static variable have only one copy of itself

class Things{
	public String name;
	public static String description;
	
	//static class can access static variable but can't access non static variable
	
	public static void StaticMethod(){
		System.out.println(description);
	}
	
	//another example to use static in counting how many object have class
	//make a constructor and increase count by1
	public static int count;
	public Things(){
		count++;
	}
}



public class Static {

	/**
	 * @param args
	 */
	public static void main(String args[]){
		//if i want to access static variable we have to call it with 
		Things.description = "I am a programmer";
		Things.StaticMethod();
		System.out.println("Counter before creating object "+Things.count);
		Things things1 = new Things();
		Things things2   = new Things();
		System.out.println("Counter after creating object "+Things.count);
		
		things1.name ="Madhav";
		things2.name = "Kothari";
		
		System.out.println(things1.name);
	}
}
