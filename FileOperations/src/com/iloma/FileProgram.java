package com.iloma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram {
	String name;

	public FileProgram() {
		name = "Default";
	}

	public void setName(String nm) {
		this.name = nm;
	}

	public String getName() {
		return name;
	}

	public void setMenu(String menu) {
		if (menu.equals("1")) {
			/*
			 * File myfile= new File("C:\\Users\\\\Desktop\\ilomat.txt");
			 * System.out.println("Enter your NameAbc: "); Scanner sc= new
			 * Scanner(System.in); String name1=sc.nextLine(); boolean result;
			 * 
			 * try { result=myfile.createNewFile(); if(result) {
			 * System.out.println("File created at location: "+myfile.getCanonicalPath()); }
			 * else {System.out.println("File already exist: "+myfile.getCanonicalPath());}
			 * 
			 * } catch(IOException e) { System.out.println("An error occured");
			 * e.printStackTrace(); }
			 */
			try {
				Scanner sc = new Scanner(System.in);
				/*
				 * System.out.println("Enter the file name: ");
				 * 
				 * 
				 * String filename=sc.nextLine();
				 */

				FileOutputStream fos = new FileOutputStream("C:\\Users\\Abc\\Desktop\\iloma.txt");
				System.out.println("Add your Name : ");

				String file_content = sc.nextLine() + "\n";
				byte[] b = file_content.getBytes(); // convert string into bytes
				fos.write(b);
				fos.close();
				System.out.println("File Saved!");

			} catch (IOException e) {
				e.printStackTrace();

			}
		} else if (menu.equals("2")) {
			try {
				FileReader filer = new FileReader("C:\\Users\\Abc\\Desktop\\iloma.txt");
				int i;
				System.out.println("Your Data is :");
				while ((i = filer.read()) != -1)

					System.out.print((char) i);
				filer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (menu.equals("4")) {
			try {
				FileWriter file = new FileWriter("C:\\Users\\Abc\\Desktop\\iloma.txt");
				file.flush();
				file.close();
				System.out.println("Yours file content is deleted!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (menu.equals("3")) {

			try {
				FileOutputStream fos = new FileOutputStream("C:\\Users\\Abc\\Desktop\\iloma.txt", true);
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your information: ");
				String file_content = sc.nextLine() + "\n";
				byte[] b = file_content.getBytes();
				fos.write(b);
				fos.close();
				System.out.println("Content Added Successfully ");
			} catch (IOException e) {
				e.printStackTrace();

			}

		} else if (menu.equals("5")) {
			try {
				Scanner sc = new Scanner(System.in);
				File file = new File("C:\\Users\\Abc\\Desktop\\iloma.txt");
				System.out.println("Find:");
				String old = sc.nextLine();
				/* String old=""; */
				BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Abc\\Desktop\\iloma.txt"));
				String line = reader.readLine();
				while (line != null) {
					old = old + line + System.lineSeparator();
					line = reader.readLine();
					System.out.println("Replace with: ");
					String new_value = sc.nextLine();
					String new_content = old.replaceAll(old, new_value) + "\n";
					FileWriter writer = new FileWriter("C:\\Users\\Abc\\Desktop\\iloma.txt");
					writer.write(new_content);
					reader.close();
					writer.close();
					System.out.println("Data Updated Successfully !");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Thank you try again next time");
		}

	}

}
