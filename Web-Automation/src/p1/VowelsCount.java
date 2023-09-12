package p1;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaa aaa aaa";
		str=str.toUpperCase();
		char [] ch=str.toCharArray();
		int count=0;
		for(char c:ch)
		{
			if(c!=' ')
			{
				switch(c)
				{
				case 'A': case'E': case 'I': case 'O': case 'U':
				count++;
				break;
				}
			}
		}
			System.out.println("num of vovals:"+count);
				
			}
		}
				

	


