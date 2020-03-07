package _01_Simple_Array_Algorithms;

import javax.swing.JOptionPane;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	int[] a = {1, 2, 3, 4};
	
	
	public static int sumIntArray(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum = sum + values[i];
		}
		return sum;
	}
	
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	
	public static double averageIntArray(int[] values) {
		int sum2 = 0;
		for(int i = 0; i < values.length; i++) {
			sum2 = sum2 + values[i];
		}
		int average = 0;
		average = sum2/values.length;
		System.out.println(average);
		return average;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] a, int value) {
		boolean check = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i]==value) {
				check = true;
			}
		}
		return check;
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] a, int value) {
		int loc = -1;
		for(int i = 0; i < a.length; i++) {
			int instance = 0;
			if(a[i]==value && instance == 0) {
				loc = i;
			}
			
		}
		return loc;
		
	}
}
