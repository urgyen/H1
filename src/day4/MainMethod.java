package day4;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// object initialization
		Person p1 = new Person();
		// instance variable
		
		// dot opertor
		p1.name = "Urgyen";
		p1.age = 15;
		p1.address = "NEpal";
		//p1.oldOrNot="asdasdad";
		
		p1.eat();
		p1.sleep();
		p1.areYouOld();
		
		System.out.println("Status: " + p1.oldOrNot);
		
		p1.printName(10);

		System.out.println("----");

		Person p2 = new Person();
		p2.name = "Shreejan";
		p2.age = 25;
		p2.address = "USA";
		p2.sleep();
	//	p2.printName(15);

//		
//		System.out.println(p1.address);
//		System.out.println(p2.name);
		
		System.out.println("----");
//
//		Person p3 = new Person();
//		p3.name = "Wriha";
//		p.age = 25;
//		p3.address = "USA";
//		p3.sleep();
//
//		System.out.println("----");
//
//		Person p4 = new Person();
//		p4.name = "Mamta";
//		p4.age = 25;
//		p4.address = "USA";
//		p4.sleep();
//		
//		System.out.println("----");
//
//		Person p5 = new Person();
//		p5.name = "Sreya";
//		p5.age = 25;
//		p5.address = "USA";
//		p5.sleep();



	}

}
