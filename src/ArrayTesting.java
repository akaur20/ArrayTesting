/*
 * Avleen Kaur Period 7
 */
public class ArrayTesting 
{

	public static void main(String[] args) 
	{
		int[] myArray = new int[20];
		
		for(int i = 0; i < myArray.length; i++)
			myArray[i] = (int)(Math.random()*20 + 1);

	}
	
	private static double average(int[] arr)
	{
		double sum = 0;
		for(int num : arr)
		{
			sum += num;
		}
		
		return sum/arr.length;
	}
	
	private static boolean isPresent(int[] arr, int target)
	{
		for(int num : arr)
		{
			if( num == target)
			{
				return true;
			}
			
		}
		
		return false;
	}
}
