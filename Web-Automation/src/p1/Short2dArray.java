package p1;

public class Short2dArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[][] s= {{1,2,3,4},{5,6,7,8}};
		for(int i=s.length-1;i>=0;i--)
		{
			for (int j=s[i].length-1;j>=0;j--)
			{
				System.out.print(" "+s[i][j]);
			}
			System.out.println();
		}

	}
}
