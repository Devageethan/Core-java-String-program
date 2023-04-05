package string;

public class Q {
			public static void main(String[] args) {
				String s1="HI how are you?";
				String rev="";
				String []res=s1.split("");
				for(int i=res.length-1;i>=0;i--) {
					rev+=res[i]+"";
				}
				System.out.println(rev);
			}
}
