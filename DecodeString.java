package string;
import java.util.*;
public class DecodeString {
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("enter the string");
				String input =s.nextLine();
				String output=decodeString(input);
				System.out.println(output);
			}
			public static String decodeString(String input) {
				StringBuilder sb=new StringBuilder();
				int i=0;
				while(i<input.length()) {
					char c=input.charAt(i);
					if(Character.isLetter(c)) {
						sb.append(c);
						i++;
					}else if(Character.isDigit(c)) {
						int numStart=i;
						while(i<input.length()&&Character.isDigit(input.charAt(numStart))) {
							numStart++;
						}
						int num=Integer.parseInt(input.substring(i, numStart));
						for(int j=0;j<num;j++) {
							sb.append(input.charAt(i-1));
						}
						i=numStart;
					}else {
						i++;
					}
				}
				return sb.toString();
			}
}
