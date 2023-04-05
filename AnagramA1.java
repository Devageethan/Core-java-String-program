package string;

import java.util.Arrays;

public class AnagramA1 {
		public static void main(String[] args) {
			String s1="aevd";
			String s2="deva";
			s1.toLowerCase();
			s2.toLowerCase();
			char[]ch1=s1.toCharArray();
			char[]ch2=s2.toCharArray();
			Arrays.sort(ch2);
			Arrays.sort(ch1);
			boolean res=Arrays.equals(ch1, ch2);
			if(res) {
				System.out.println("is anagram");
			}else {
				System.out.println("is not anagram");
			}
			}
}
