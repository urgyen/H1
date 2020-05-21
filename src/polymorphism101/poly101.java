package polymorphism101;

public class poly101 {
	
	
	//Poly Morphism
	//euta method name le different approach
	
	//no of arguments
	//data type
	
	
	//method or Function
	//Method Overloading
	
	
	//Method Overiding?
		//Inheritance
	
	public static void main(String[] args) {
//		
//		sum(1,2);
//		sum(1.1,2.1);
//		sum(7,8,9,10,11);
//		
//		printNames("Apple");
//		System.out.println("-----");
//
//		String nameList[]= {"Urgyen", "Mamta", "Shreejan" , "Shreya", "Wrriha"};
//		printNames(nameList);
		
		Dog d1= new Dog();
		d1.feature();
		
	}
	
	static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	static void sum(double a, double b) {
		System.out.println(a+b);
	}
	
	static void sum(int a, int b, int c, int d, int e) {
		System.out.println(a+b+c+d+e);
	}
	
	//String print name only  and group of name??
	//printNames();
	
	static void printNames(String name) {
		System.out.println(name);
	}
	
	static void printNames(String nameList[]) {
		for(String name : nameList) {
			System.out.println(name);
		}
	}
	
}