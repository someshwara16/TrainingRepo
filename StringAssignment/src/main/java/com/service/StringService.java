package com.service;

import com.model.StringModel;

public class StringService {

	public String stringMod(StringModel mod) {
		return mod.getStr1().toLowerCase();
	}

	public String stringReplace(StringModel mod, String oldChar, String newChar) {
		return mod.getStr1().replace(oldChar, newChar);

	}

	public String subString(StringModel mod) {

		return mod.getStr1().substring(2, 5);

	}

	public void palindrom(StringModel mod, String pali) {
		String reverseStr = "";
		int strLength = pali.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + pali.charAt(i);
		}

		if (pali.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(pali + " is a Palindrome String.");
		} else {
			System.out.println(pali + " is not a Palindrome String.");
		}

	}
}