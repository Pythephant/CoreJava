package v1ch03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.print("What do you want to echo(q to quit):");
			String msg = in.nextLine();
			if (msg.equals("q")){
				break;
			}
			System.out.println("Echo:"+msg+"...");
		}
		System.out.println("Echo sytem exit!");
		in.close();
	}
}
