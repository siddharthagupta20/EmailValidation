package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailValidation {

	Scanner in = new Scanner(System.in);

	public void emailValidator() {
		System.out.println("Enter your Email :");
		String email = in.next();
		Pattern pattern = Pattern
				.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]*(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
		Matcher matcher = pattern.matcher(email);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Email is Validated");
		else
			System.out.println("Please enter the correct mail id");
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to the page");
		EmailValidation emailValidation = new EmailValidation();
		emailValidation.emailValidator();
	}

}