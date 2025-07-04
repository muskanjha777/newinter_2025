package day17;

public class ArrayIndex {

	public static void main(String[] args) 
	{
		int[]arr= {1,2,3,4,5};
		try
		{
			System.out.println("6th Element"+arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
