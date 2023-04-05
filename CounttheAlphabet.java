package string;
import java.util.*;
public class CounttheAlphabet {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the String");
			String s1=s.nextLine();
			int count =1;
			for(int index=0;index<s1.length()-1;index++) {
				if(s1.charAt(index)==s1.charAt(index+1)) {
					count++;
					
				}else {
					System.out.println(s1.charAt(index)+"-"+count);
					count=1;
				}
			}
			System.out.println(s1.charAt(s1.length()-1)+"-"+count);
		}
}
