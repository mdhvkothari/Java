
public class Main {

	public static void main(String[] args) {
		
		Human human = new Human("Madhav");
		human.person();
		
		
		Car car = new Car();
		car.machine();
		
		Info infoHuman = human;
		infoHuman.showInfo();
		
		Info infoCar = car;
		infoCar.showInfo();
		
	}

}
