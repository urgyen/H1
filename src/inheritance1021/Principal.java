package inheritance1021;

public class Principal {
	
	//state
	String name;
	int age;
	String address;
	String subject;
	
	//behaviour

	void paystoTeachers() {
		System.out.println("Pays to Rich");
	}
	
	void teaches() {
		//switch
		switch(subject) {
		case "Maths":
			System.out.println("Teaches  Maths");	
			break;
		
		case "Science":
			System.out.println("Teaches  Science");	
			break;
			
		case "Nepali":
			System.out.println("Teaches  Nepali");	
			break;
		
		default:
			System.out.println("-----");
		}
		

		
		
		
	}
	
	

}
