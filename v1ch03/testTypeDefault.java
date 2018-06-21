package v1ch03;

import java.util.Arrays;

public class testTypeDefault {
	public static void main(String[] args) {
//		String[] s = new String[4];
		int[] a = new int[5];
		System.out.println(Arrays.toString(a));
		boolean[] b = new boolean[5];
		System.out.println(Arrays.toString(b));
	}
	
	public static void printArray(int[] a){
		System.out.print("Array:");
		for (int i : a){
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}
