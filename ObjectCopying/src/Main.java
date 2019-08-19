class A{
	int i,j;
	public String toString(){
		return i + " " +j;
	}
}


public class Main {

	public static void main(String[] args) {
		//Shallow copying
		A obj = new A();
		obj.i =5;
		obj.j = 6;
		A obj1 = obj;
		obj1.i = 10;
		System.out.println("Here in shallow we make two instace of same of object");
		System.out.println(obj);
		System.out.println(obj1);
		
		//Deep copying
		
		A obj2 = new A();
		obj2.i =5;
		obj2.j = 6;
		
		A obj3 = new A();
		obj3.i = obj2.i;
		obj3.j = obj2.j;
		System.out.println(obj3);
		System.out.println("After update");
		obj3.i=10;
		System.out.println(obj3);
		System.out.println(obj2);
		
		//cloning
		
		
	}

}
