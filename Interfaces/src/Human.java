
public class Human implements Info{
	private String name;
	
	public Human(String name){
		this.name = name;
	}
	
	public void person(){
		System.out.println("From Human");

	}
	
	public void showInfo() {
		System.out.println("Person name: "+ name);
		
	}

}
