//we use static only with the class name not able to use with the instance like not things1

class thing{

	public String name;

	public static String description;

	public static int count =0;

	public  thing	(){
		count++;
	}
}



public class staticandfinal {

	public static void main (String[] args) {
		System.out.println(thing.count);

		thing thing1 = new thing();

		System.out.println(thing.count);

		thing1.name ="Madhav";

		thing.description = "I am an app developer";

		System.out.println(thing.description);
	}

}
