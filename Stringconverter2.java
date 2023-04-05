package string;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringconverter2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the String");
		String input = s.nextLine();
		String output = expandString(input);
		System.out.println(output);

	}

	public static String expandString(String input) {
		StringBuilder result = new StringBuilder();
		Pattern pattern = Pattern.compile("(\\D+)(\\d+)");
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			String letter = matcher.group(1);
			int count = Integer.parseInt(matcher.group(2));
			result.append(letter.repeat(Math.max(0, count)));
		}
		return result.toString();
	}
}
