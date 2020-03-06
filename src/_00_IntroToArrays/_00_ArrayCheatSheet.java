package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] a = {"cat", "dog", "bird", "lizard", "frog"};
		//2. print the third element in the array
		System.out.println(a[2]);
		//3. set the third element to a different value
		a[2]="pig";
		//4. print the third element again
		System.out.println(a[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < a.length; i++) {
			a[i]="dragon";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//7. make an array of 50 integers
		int[] a2 = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < a2.length; i++) {
			int random = new Random().nextInt(50);
			a2[i]=random;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int min = 100;
		for(int i = 0; i < a2.length; i++) {
			if(a2[i]<min) {
				min = a2[i];
			}
		}
		System.out.println("Minimum : "+min);
		//10 print the entire array to see if step 8 was correct
		for(int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
		//11. print the largest number in the array.
		int max = 0;
		for(int i = 0; i < a2.length; i++) {
			if(a2[i]>max) {
				max = a2[i];
			}
		}
		System.out.println("Maximum : "+max);
		//12. print only the last element in the array
		System.out.println("Last element: "+a2[a2.length-1]);
	}
}
