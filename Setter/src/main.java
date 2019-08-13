class Frog{
	String name;
	int age;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}



public class main {

	
	public static void main(String[] args) {
		
		Frog frog = new Frog();
		
		frog.setName("Kunal");
		System.out.println(frog.getName());

	}

}
