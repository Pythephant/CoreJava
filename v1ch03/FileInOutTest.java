package v1ch03;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInOutTest {
	public static void main(String[] args) throws IOException {
		Path fname = Paths.get("data/myFile.txt");
		Scanner in = new Scanner(fname,"UTF-8");
		PrintWriter out = new PrintWriter("data/myFile.copy", "UTF-32");
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(line);
			out.println("Copy:"+line+"+++++");
		}
		out.close();
		in.close();
	}
}
