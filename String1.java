package string;

public class String1 {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s3);
		System.out.println(s1.toString());
		System.out.println(s1.equals(s3));
		System.out.println(s3.hashCode());
		System.out.println(s2.hashCode()==s3.hashCode());
	}
}
