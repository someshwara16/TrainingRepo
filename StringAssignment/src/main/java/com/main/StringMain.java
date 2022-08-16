package com.main;

import com.model.StringModel;
import com.service.StringService;
import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {

		Scanner string = new Scanner(System.in);
		StringModel mod = new StringModel();

		StringService stringService = new StringService();

		System.out.print("Enter the String: ");

		String str = string.next();
		mod.setStr1(str);
		System.out.println("\nEquivalent in Lowercase: " + stringService.stringMod(mod));

		System.out.println("*********************************");

		System.out.println("Replace Value   :");
		String rep = string.next();
		String oldChar = string.next();
		String newChar = string.next();
		mod.setStr1(rep);
		System.out.println("\n The Replaced Value    :" + stringService.stringReplace(mod, oldChar, newChar));

		System.out.println("************************************");

		System.out.println("The Substring   :");
		String sub = string.next();
		mod.setStr1(sub);
		System.out.println("The Value is  :" + stringService.subString(mod));
		System.out.println("****************************************************");

		System.out.println("Enter a string as an input to check whether it is palindrome or not");
		System.out.print("Enter  string you want to check:");

		String pali = string.next();
		mod.setStr1(pali);
		stringService.palindrom(mod, pali);

	}
}
