package day4;

//BluePrint
public class Person {

	// state
	// Object ;;p1 /object : p2
	// name="Urgyen" name="Shreejan"
	String name;
	int age;
	String address;
	
	//Object ;. p1;
	//oldOrNot == Young
	String oldOrNot;

	
	// behaviour
	void eat() {
		System.out.println("Eating");
	}

	void sleep() {
		System.out.println("Sleep");
	}

	void printName(int loops) {
		for (int i = 0; i < loops; i++) {
			System.out.println(name);
		}
	}
	
	void areYouOld() {
		if(age>20) {
			//System.out.println("Old");
			oldOrNot="Old";
		}
		else {
			oldOrNot="Young";
		}
	}
	
	
	
	
	
}
