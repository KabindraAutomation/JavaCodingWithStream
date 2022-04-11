package JavaBasicCoding;

public class StaticBlockQuestion3 {

	//* 04. How can we create objects it we make the constructor private?
	
	int age;
	
	static {
		
		StaticBlockQuestion3 obj1 = new StaticBlockQuestion3();
		
	}
	public static int CreateObject() {
		
		StaticBlockQuestion3 obj1 = new StaticBlockQuestion3();
		obj1.age = 40;
		return obj1.age;
		
	}
	private StaticBlockQuestion3() {
		
		age = 30; 
		
	}
	public static void main (String a[]) {
		
		StaticBlockQuestion3 obj = new StaticBlockQuestion3();
		System.out.println(obj.age);
	}
	
	
}
