package day2;

public class Functions11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//argument
//		int response= sum(25,30);
//		int response1 = response-10;
//		
//		System.out.println("The added Value is : "+  response1);
//		
		//System.out.println(sum(55,55));
		
		//arguments
//		printName(1);
		
		//calculateAvergare(100, 50, 20, 30);
		
		String response= isOddOrEven(0);

		System.out.println(response);
	}
	
	
	static String isOddOrEven(int numberToCheck) {
		
		if(numberToCheck %2 == 0 ) {
			return "Even";
		}
		else {
			return "Odd";
		}
		
	}
	
	
	//4 type of function
	//return type type
		//void
			//String??
	//Argument type
	
	//A . Function with argument and no return type
	
		//parameter;
		static void printName(int loops) {
			for(int i=0; i<loops; i++) {
				System.out.println("NAMEEEEEE");
			}
		}
		
		//
		static void calculateAvergare(double x1, double x2, double x3, double x4) {
			double average= (x1+x2+x3+x4)/4;
			System.out.println("Average is : " + average);	
		}
		
	
	//B.  ok Function with argument and return type
		
		
		
	//c. Function with no argument and no return type
		
		static void welcomePeople() {
			System.out.println("Welcome");
		}
		
	//D. ok  Function with no argument and return type
	
	static int sum(int num1, int num2) {
			int sum = num1+num2;
			return sum;
	}
	
}
