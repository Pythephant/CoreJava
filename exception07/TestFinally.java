package exception07;

import java.io.IOException;

public class TestFinally {
	public static void main(String[] args) throws Exception {
		boolean toThrow = true;
		try {
			System.out.println("before exception!");
			if(toThrow)
				throw new IOException("To throw the original exception");
			System.out.println("after exception!");
		}catch(IOException e) {
			System.out.println("before catch exception!");
			if(toThrow)
				throw new Exception("The Exception in catch!");
			System.out.println("after catch exception!");
		}finally {
			System.out.println("In the finally!");
		}
		System.out.println("the code just out and after the finally clause");
	}
}
