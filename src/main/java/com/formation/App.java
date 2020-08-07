package com.formation;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("Please provide an input");
			System.exit(0);
		}
		System.out.println(sha256(args[0]));
	}
	
	public static String sha256(String input) {
		return DigestUtils.sha256Hex(input);
	}
	
	public static String f(int a) {
		if (a < 18) {
			return "Hello";
		} else {
			return "Bye";
		}
	}
}
