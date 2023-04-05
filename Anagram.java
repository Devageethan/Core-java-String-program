package string;

import java.util.Arrays;

public class Anagram {
			public static void main(String[] args) {
				String s1="egt";
				String s2="get";
				s1.toLowerCase();
				s2.toLowerCase();
				char[]ch1=s1.toCharArray();
				char[]ch2=s2.toCharArray();
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				if(isAnagram(ch1,ch2)) {
					System.out.println(ch1+"is anagram");
				}else {
					System.out.println(ch2+"is not anagram");
				}
			}
				public static boolean isAnagram(char ch1[],char ch2[]) {
					boolean res=false;
					if(ch1.length!=ch2.length) {
						return false;
					}else {
						for (int i = 0; i < ch2.length; i++) {
							if(ch1[i]==ch2[i]) {
								res=true;
							}
						}
					}
					return res;
					
				}
			}

