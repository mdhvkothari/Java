import java.lang.annotation.*;


//meta annotation
//these two are used to access the os and version
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
	String os();
	int version();
}


@SmartPhone(os="Android",version =5)
class NokiaPhone{
	String model;
	int size;
	public NokiaPhone(String model,int size) {
		this.model = model;
		this.size = size;
	}
}

public class Main {
	public static void main(String[] args) {
		NokiaPhone p1 = new NokiaPhone("K", 6);
		//now we want to os and version of Smart Phone annotation
		
		Class c = p1.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());
	}

}
