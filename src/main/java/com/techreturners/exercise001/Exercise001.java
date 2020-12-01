package com.techreturners.exercise001;

import java.util.List;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Exercise001 {
	public String capitalizeWord(String word) {
		return Character.toUpperCase(word.charAt(0)) + word.substring(1);
	}

	public String generateInitials(String firstName, String lastName) {
		return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));

	}

	public double addVat(double originalPrice, double vatRate) {
		double cal = (originalPrice * vatRate) / 100;
		cal += originalPrice;
		BigDecimal bd = new BigDecimal(cal).setScale(2, RoundingMode.HALF_UP);

		return bd.doubleValue();
	}

	public String reverse(String sentence) {
		StringBuilder reverseStr = new StringBuilder();
		reverseStr.append(sentence);
		reverseStr = reverseStr.reverse();

		return reverseStr.toString();
	}

	public int countLinuxUsers(List<User> users) {

		int count = 0;
		for (User userObj: users) {
			if (userObj.getType().equals("Linux")) {
				count++;
			}
		}

		return count;
	}
}