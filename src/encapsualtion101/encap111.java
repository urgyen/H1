package encapsualtion101;

public class encap111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Encapsulation
		//1. data hide  "Private"
		//2. Logic check
		//3. dot operator _ getters and setters
		
		StudentsDetails s1= new StudentsDetails();
//		s1.name= "ABC";
//		s1.age=150;
		
		s1.setAge(15);
		s1.setFeesPayable(1500);
		
		System.out.println(s1.getAge());
		System.out.println(s1.getFeesPayable());
		
		}

}
