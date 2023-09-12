package p1;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="siruguppa taluk bellary distic";
		str=str.toUpperCase();
		int vovalcount=0;
		try
		{
			for(int i=0;i<=str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch!=' ')
				{
					if(ch=='A' && ch=='E' && ch=='I' && ch=='O' && ch=='U')
					vovalcount++;
					System.out.println("total volvels="+vovalcount);
					}
				//System.out.println("total number of vovals:"+vovalcount);
				}
			}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}

	}

}
