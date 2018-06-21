package exception07;

import java.util.Scanner;

public class AssertionTest {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		assert x >= 0 : "x must not less than 0:" + x;
		System.out.println(Math.sqrt(x));
	}
}
