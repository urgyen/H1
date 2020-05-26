package day8;


import java.util.*;

public class Collection1 {

	//ArrayList
	//size of array static --dyanamic
	//insertion order maintain garxa
	//duplicate data halna payinxa
	
	//array list not good for constant addition and removal
	
	
	
	
	//HashSet
	//HashMap
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	<>
		
//		int[] a= new int[10];
//		
//		System.out.println(a);
//		
//		System.out.println("-----");
		
		ArrayList<String> al= new ArrayList();
		//[0]= "Apple";
		
		al.add("Urgyen");
		al.add("Mamta");
		al.add("Shreejan");
		al.add("Shreya");
		al.add("Wriha");
		al.add("Urgyen");

		//System.out.println(al);
		
		for(String data : al) {
			System.out.println(data);
		}
//		
//		//update
//		al.add(1, "Mamata Shrestha");
//		System.out.println(al);
//		al.remove(0);
//		System.out.println(al);
//			
//
////				index 0= ab
////				index 1= aa
////				index 2= ac
////				index 3= ad
////				index 4= ae
////			
////			
//		al.set(3,"Shreya Acharya");
//		
//		System.out.println(al);
		
		
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		for(int i=0; i<101;i++) {
//			list.add(i);
//		}
//		
//		list.add(null);
//		System.out.println(list);
//		
		
		//data insertion : Hashing 
		//only unique elemsts
		//inseryion order maintain gardain
		
//		HashSet<String> set1= new HashSet<>();
//		set1.add("Alan");
//		set1.add("Bob");
//		set1.add("John");
//		set1.add("MArk");
//	
//		
//		System.out.println(set1);
//		
	
		//HashMap : dictionary
		
	//Key and value pair
		HashMap<Integer, String>  hashmap1= new HashMap<>();
		
		hashmap1.put(101, "Urgyen");
		hashmap1.put(102, "Shreejan");
		hashmap1.put(103, "Mamta");
		hashmap1.put(104, "Mamta");
		
		//key 
		for(Map.Entry m : hashmap1.entrySet()) {
			
			System.out.println(m);
			System.out.println(m.getValue());
			
		}
		//value
		
		
		
		
	}

	
	
}
