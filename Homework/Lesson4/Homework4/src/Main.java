import java.util.Scanner;

import java.io.*;

public class Main {


	public static void main(String[] args) {
		// Create scanner from input path to folder with test cases
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input path to folder with tests: ");
		String path = scan.nextLine();
		File file = new File(path);
		//check availability files in folder
		if (file.exists() && file.isDirectory()){
			try {
				TestProcessor testProc = new TestProcessor(path);
				testProc.parseTest();
				testProc.executeAllTests();
				testProc.generateReport();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else{
			System.out.println("Path is not valid!");
		}
		scan.close();
	}

}
