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
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        String initstr = Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
        return initstr;
    }

    public double addVat(double originalPrice, double vatRate) {
        double cal = (originalPrice * vatRate) / 100;
        cal += originalPrice;
        BigDecimal bd = new BigDecimal(cal).setScale(2, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }

    public String reverse(String sentence) {
        StringBuilder reversestr = new StringBuilder();
        reversestr.append(sentence);
        reversestr = reversestr.reverse();

        return reversestr.toString();
    }

    public int countLinuxUsers(List < User > users) {

        int count = 0;
        for (User userObj: users) {
            if (userObj.getType().equals("Linux")) {
                count++;
            }
        }

        return count;
    }
}