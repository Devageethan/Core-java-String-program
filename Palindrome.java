package string;

public class Palindrome {
		public static void main(String[] args) {
				String a="malayalam";
				String rev="";
				for(int i=a.length()-1;i>=0;i--) {
					rev+=a.charAt(i);
				}
				if(a.equals(rev)) {
					System.out.println("PALINDROME");
				}
				else {
					System.out.println("not palindrome");
				}
				
		}	
}
