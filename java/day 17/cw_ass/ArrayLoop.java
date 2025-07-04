package day17;

public class ArrayLoop {

	public static void main(String[] args) 
	{
		int[]arr= {1,2,3,4,5};
		try
		{
			for(int i=0;i<=arr.length;i++)
			{
			System.out.println(" Element at index"+i+":"+arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error:"+e.getMessage());
		}

		// TODO Auto-generated method stub

	}

}
