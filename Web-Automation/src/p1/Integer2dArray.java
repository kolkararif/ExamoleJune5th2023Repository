package p1;

public class Integer2dArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3,4},{5,6,7,8}};

		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j]);
				j++;
			}
			System.out.println();
			i++;

		}
	}

}
