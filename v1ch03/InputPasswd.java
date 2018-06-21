package v1ch03;

import java.io.Console;

public class InputPasswd {
	public static void main(String[] args) {
		Console cons = System.console();
		String usrName = cons.readLine("UserName:");
		char[] passWord = cons.readPassword("PassWord:");
		System.out.println("User:"+usrName);
		System.out.println("Passwd:"+passWord.toString());
	}
}
