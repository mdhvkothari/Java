import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//serializable  is a marker class which is used to save the state of the object
//let suppose we have to save the value of the object in a file but java does not allow to save the object state
//so we use marker class

class Save implements Serializable{
	int i;
}

//if we use FileOutputStream we have to throw Exception in static void main

public class Main {
	public static void main(String[] args) throws Exception{
		Save obj = new Save();
		obj.i =5;
		
		//now we want to save the state of the obj.i
		
		File f = new File("Obj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		//we store object so we use ObjectOutputStream for data we use DataOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
		oos.close();
		
		
		//now if we want to read the save object
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		//now we retrive save object so we use save keyword and type cast into save because it will
		//give use the object of object
		Save ojb1 = (Save) ois.readObject();
		System.out.println(ojb1.i);
		ois.close();
		fis.close();
	}

}
