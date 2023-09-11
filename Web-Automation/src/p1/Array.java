package p1;

public class Array {

	public static void main(String[] args) {
		String str="prabhakarsir";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			char ch1=ch[i];
			System.out.println("reverse of string is:"+ch1);
		}
	

	}

}
