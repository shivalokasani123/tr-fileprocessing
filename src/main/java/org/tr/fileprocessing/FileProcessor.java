package org.tr.fileprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;

public class FileProcessor {

	public static void main(String[] args) {
		if (args.length < 1) {
			throw new IllegalArgumentException("Invalid input args !!!!");
		}

		File file = new File(args[0].trim());
		System.out.println(args[0]);
		System.out.println(file.canRead());
		System.out.println(file.length());
		if (!file.exists()) {
			throw new RuntimeException("Input file doesn't exists !!!");
		}

		printFileData(file);
	}

	public static void printFileData(File file) {
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			StringWriter writer = new StringWriter();

			String line = "";
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.write("\n");
			}
			System.out.println(writer.toString());
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
