//Getter use for ritevring some data
class Person{
	public String name;
	public int age;
	
	public void speak(){
		System.out.println("My name is :"+name);
	}
	
	int getAge(){
		return age;
	}
}



public class getter {
	public static void main(String[] args) {
		
		Person person = new Person();
		person.age =19;
		person.name ="Madhav";
		int age = person.getAge();
		System.out.println(age);

	}

}
