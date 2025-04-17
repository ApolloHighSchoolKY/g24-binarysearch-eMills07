import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		
		int low = 0;
		int high = ray.length - 1;
		int mid = 0;
		
		while(low <= high)
		{
			mid = low + (high - low)/2;

			if(ray[mid] < item)
			{
				low = mid;
			}
			else if(ray[mid] == item)
			{
				return mid;
			}
			else
			{
				high = mid;
			}
		}
	return mid;
	}
}
