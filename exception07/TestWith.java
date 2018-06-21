package exception07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestWith {
	public static void main(String[] args) throws FileNotFoundException {
		try(Scanner in = new Scanner(new MyFileInputStream(args[0]),"UTF8")){
			while(in.hasNextLine())
				System.out.println(in.nextLine().toUpperCase());
			throw new IllegalArgumentException();
		}catch(Exception e) {
			System.out.println("in catch clause");
		}finally {
			System.out.println("in the finally clause");
		}
	}
}

class MyFileInputStream extends FileInputStream{

	public MyFileInputStream(String name) throws FileNotFoundException {
		super(name);
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("closing MyFileInputStream!");
		super.close();
	}
	
}
