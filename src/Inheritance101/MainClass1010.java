package Inheritance101;

public class MainClass1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PArent p1= new PArent();
//		p1.age=50;
//		p1.name= "AA";
//		p1.eyeColor="Brown";
//		
//		p1.goToWork();
//		p1.cookFood();
//		p1.lookAfterKids();
//				
//		
//		System.out.println(p1.age);
//				
		//Single Level Inheritance;
		
		
		Child c1= new Child();
		c1.age=12;
		c1.name="BB";
		c1.eyeColor= "Black";
		
		c1.goToWork();
		System.out.println("-----");
		c1.cookFood();
		
		
		GrandChild g1= new GrandChild();
		g1.age=1;
		g1.name="CC";
		g1.eyeColor="Green";
		g1.cookFood();
		
		
		
		
		
		
	}

}
