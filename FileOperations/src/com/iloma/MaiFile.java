package com.iloma;

import java.util.Scanner;

public class MaiFile {

	public static void main(String[] args) {
		FileProgram a = new FileProgram();
		int loop=6,i = 1;
		while(i<=loop) {
		System.out.println(
					
				"Select Options: \n 1 for Add Data\n 2 for View Data  \n 3 for Add More data \n 4 for clean \n 5 for Replace \n 6 for None: ");
		
		Scanner sc = new Scanner(System.in);
		
		String menu = sc.next();
		a.setMenu(menu);
		
		}

		/*System.out.println(
				"Select Options: \n 1 for AddName in file\n 2 for ListName\n 3 for clean \n 4 for Search \n 5 for Replace: \n 6 for None:  ");
		Scanner sc1 = new Scanner(System.in);
		String menu1 = sc.next();
		a.setMenu(menu1);
*/
	}

}
