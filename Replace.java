package string;

public class Replace {
				public static void main(String[] args) {
					String s1="I am Devageethan";
					String replace="Naveen";
					String []ref=s1.split(" ");
					String res="";
					for(int i=0;i<ref.length;i++) {
						if(ref[i].equals("Devageethan")) {
						 ref[i]=replace;
						} res+=ref[i]+" ";
					}
						System.out.println(res);
					
				}
}
