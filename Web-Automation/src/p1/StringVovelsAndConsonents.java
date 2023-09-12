package p1;

public class StringVovelsAndConsonents {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="arifkolkar";
		int vovels=0;
		int consonents=0;
		int l=str.length();
		str=str.toUpperCase();
		try {
		for(int i=0;i<=l;i++)
		{
			char ch=str.charAt(i);
	        if(ch!=' ')
			{
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			
				vovels++;
				else
				
				consonents++;
			System.out.println("total volvels="+vovels+" "+"total cons="+consonents);
					
				}
		}
		}
		catch (StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
			
		//System.out.println("total volvels="+vovels+" "+"total cons="+consonents);
		}
		
			
			

}
