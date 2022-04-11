package JavaBasicCoding;

public class StaticBlockQuestion5 {
	
	//05. Is it possible to compiler and run a java program with writing main() method?
	static int age = 20; 
	static {
		System.out.println("Static 1");
		
	}
	static {
		System.out.println("Static 2");
		
	}
	static {
		System.out.println("Static 3");
		
	}

}
