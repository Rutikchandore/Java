import java.util.*;

class Displays
{
	public void dis(int arr[],int iValue)
	{
		for(int iCnt = 0; iCnt < iValue; iCnt++)
		{
			System.out.println(arr[iCnt]);
		}
	}
}

class Sorting1 
{
	public void sorting(int arr[], int iValue)
	{
		for(int i = 0; i < iValue; i++)
		{
			for(int j = i + 1; j < iValue; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
}

public class BubbleShort1 {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array : ");
		int iValue  = sc.nextInt();
		
		int[] arr = new int [iValue];
		
		System.out.println("Enter the array Element : ");
		for(int iCnt = 0; iCnt < iValue; iCnt++)
		{
			arr[iCnt] =sc.nextInt();
		}
		
		System.out.println("Before Array Sorting : ");
		Displays ds = new Displays();
		ds.dis(arr, iValue);
		
		Sorting1 s = new Sorting1();
		s.sorting(arr, iValue);
		
		System.out.println("After Array Sorting :");
		ds.dis(arr, iValue);
		
		
	}

}
