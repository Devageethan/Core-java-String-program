package string;

public class Reverse {
		public static void main(String[] args) {
			
		
			String s="devageethan";
			String rev="";
			for(int index=s.length()-1;index>=0;index--) {
					rev+=s.charAt(index);
			}
			System.out.println(rev);
		}
}
