import  java.util.ArrayList;

class Machine{
	public String toString(){
		return "I am Machine";
	}
}

class Camera extends Machine{
	public String toString(){
		return "I am Camera";
	}
}


public class Main {
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();		
		list.add("one");
		list.add("two");
		showList(list);
		
		ArrayList<Camera> list1 = new ArrayList<Camera>();
		list1.add(new Camera());
		showList(list1);
		
		ArrayList<Machine> list2 = new ArrayList<Machine>();
		list2.add(new Machine());
		showList(list2);
	
	}
	//we use ? because we don't know which type to array list we have ? is called wildcard
	// and instead of String value:list we use Object value:list
	public static void showList(ArrayList<?> list){
		for(Object value:list){
			System.out.println(value);
		}
	}
}
