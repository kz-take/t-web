package javaTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class FileTest {
	public static void main(String... args) {
		try {
			File inFile = new File("D:\\desk\\test.txt");
			FileWriter outFile = new FileWriter("D:\\desk\\out.txt");

			BufferedReader br = new BufferedReader(new FileReader(inFile));
			PrintWriter pw = new PrintWriter(new BufferedWriter(outFile));

			String str = br.readLine();
			while (str != null) {
				pw.println(str);
				LocalDate ldate = LocalDate.now();
				pw.println(ldate);

				str = br.readLine();
			}

			br.close();
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
