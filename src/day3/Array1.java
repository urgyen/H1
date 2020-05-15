package day3;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array -- > collection;
		//Array has a fixed size?
		
		
//		//AAray Declare
//		int a[] = new int[5];
//		
//		
//		//Array Value add;
//		a[0] = 35;
//		a[1]= 5;
//		a[2]= 15;
//		a[3]= 20;
//		a[4]= 25;
//		
		
		
////		System.out.println(a[1]);
////		System.out.println(a[2]);
////		System.out.println(a[3]);
////		System.out.println(a[4]);
////		System.out.println(a[0]);
//		
//	//	System.out.println(a.length);
//		
////		for(int i=0; i<a.length; i++) {
////			System.out.println(a[i]);
////		}
//		
//		//for each
//		for( int data   : a ) {
//			
//			System.out.println(data);
//		
//		}
		
		//Strings in Array?
		
//		String nameList[] = {"Urgyen", "Sreya" , "Wriha" , "Mamta"};
//		
////		nameList[0]="Urgyen";
////		nameList[1]= "Sreya";
////		
//		//System.out.println(nameList.length);
//		
//		for(String data : nameList) {
//			System.out.println(data);
//		}
//		
				
		//Collections;
		//ArrayList
		//hashSet
		//HashMap
		
//		nameList[4]= "Shreejan";
//		System.out.println(nameList[4]);
		
		//	Scenario
		//	array list =10;
		//	function arrray pass;
		// 	10 numbers ma minumum ra maximum print
		
		int bunchOfNumbers[]= {1,2,3,4,5,6,7,8,9,10};
		
		findMinMaxOFArray(bunchOfNumbers);
			
	}

		static void findMinMaxOFArray(int a1[]) {
			
			//1
			//10
			int minimum = a1[9];
			int maximum = a1[0];
			
			for(int i=0; i<a1.length ; i++) {
				if(minimum>a1[i]) {
					//1
					minimum=a1[i];
				}
				if(maximum<a1[i]) {
					//1
					maximum=a1[i];
				}

			}
			System.out.println("Minimum VAlue is : "+ minimum);
			System.out.println("MAximum VAlue is : "+ maximum);

		}
	
		
		
		
		//Collections Framweork;
		// Array			fixed size			,length
		// ArrayList;		dyanamic			.size, .add .remove;
		
		
		//Object Oriented Concepts;
		//Java is an Object Oriented Language ??
		//Class 	--> 	object blueprint   Person  Student  Country  Animal  
		//Object 			
		
		//Research 
		
		
		String name= "ABC";
		//methods
		char firstchar ='A';
		
		firstchar == P --> 
		if yes it starts with P
		else doesnt starts with P
		
}
