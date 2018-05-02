package edu.handong.csee.java.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileInputWithUserFileDemo {

	public static void main(String[] args) {
		TextFileInputWithUserFileDemo reader = new TextFileInputWithUserFileDemo();
		reader.run();

	}

	private void run() {
		System.out.print ("Enter file name: ");
        Scanner keyboard = new Scanner (System.in);
        String fileName = keyboard.next ();
		
		Scanner inputStream = null;
		System.out.println ("The file " + fileName + "\ncontains the following lines:\n");
		
		try {
			inputStream = new Scanner(new File(fileName));
		}  catch (FileNotFoundException e) {
			System.out.println ("Error opening the file " + fileName);
			System.exit (0);
		}
		
		while (inputStream.hasNextLine ()) {
			String line = inputStream.nextLine ();
			System.out.println (line);
		}
		inputStream.close ();
		keyboard.close();
	}

}
