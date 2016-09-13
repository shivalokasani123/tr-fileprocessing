package org.tr.fileprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;

public class FileProcessor {

	public static void main(String[] args) {
		
		File file = null;
		if (args.length > 0 && new File(args[0]).exists())
		{
			file = new File(args[0]);
		} 
		else if (System.getenv("input_file") != null && new File(System.getenv("input_file")).exists())
		{
			file = new File(System.getenv("input_file"));
		}
		else if (System.getProperty("input_file") != null && new File(System.getProperty("input_file")).exists())
		{
			file = new File(System.getProperty("input_file"));
		}

		if (file == null)
		{
			System.out.println("Input file doesn't exists !!!");
			System.exit(-1);
		} 
		else
		{
			printFileData(file);
		}
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
