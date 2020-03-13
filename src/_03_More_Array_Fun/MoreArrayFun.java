package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] a = {"cat", "dog", "bird"};
		printAllRand(a);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printAll(String[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void printAllR(String[] a) {
		for(int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void printAllO(String[] a) {
		for(int i = 0; i < a.length; i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
	}
	
	 //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printAllRand(String[] a) {
		boolean[] printed = new boolean[a.length];
		for(int i = 0; i < a.length; i++) {
			int rand = new Random().nextInt(a.length);
			if(!printed[rand]) {
				printed[rand] = true;
				System.out.println(a[rand]);
			}
			else {
				i--;
			}
			
	        
	    }
	    
	    
	}
	

	
}
