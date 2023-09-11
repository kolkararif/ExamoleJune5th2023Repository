package p1;



 class NumberDemo {
	static int count=1;
	static void displayNumbers()
	{
		if (count<=10)
		{
			System.out.println(count);
			count+=1;
			displayNumbers();
			
		}
	}

}
public class SampleDemo
{
	public static void main(String str[])
	{
		NumberDemo.displayNumbers();
	}
}
