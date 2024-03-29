class Machine {
	public void start() {
		System.out.println("Form machine");
	}
}

interface Plant {
	public void grow();
}

public class Main {
	public static void main(String[] args) {

		Machine machine = new Machine() {
			@Override
			public void start() {
				System.out.println("Override start method");
			}
		};
		machine.start();

		Plant plant = new Plant() {
			@Override
			public void grow() {
				System.out.println("From plant");
			}
		};
		plant.grow();

	}

}
