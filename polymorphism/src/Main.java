
public class Main {

	public static void main(String[] args) {
		Plant plant = new Plant();
		Tree tree = new Tree();
		//this will give the plant output because plant2 is the object of tree 
		Plant plant2 = tree;
		plant2.grow();
		//now if we user plant2.leaveSheading it will give an error because plant2 is the Plant type variable
	}

}
