package string;
import java.util.*;
public class SortTheCharacter {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the String");
	String s1=s.nextLine();
	String temp=s1;
	//convert into char
	char ch[]=s1.toCharArray();
	String upper="",lower="";
	Arrays.sort(ch);
	for(int index=0;index<ch.length;index++) {
		if(ch[index]>='a'&&ch[index]<='z') {
			lower+=ch[index];
		}else {
			upper+=ch[index];
		}
	}
	String res="";
	for(int index=0,m=0,n=0;index<temp.length();index++) {
		if(temp.charAt(index)>='a'&&temp.charAt(index)<='z') {
			res+=lower.charAt(m++);
		}else {
			res+=upper.charAt(n++);
		}
	}
	System.out.println(res);
}
}
