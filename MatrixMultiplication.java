import java.util.Scanner;

class DisplayArray
{
	public void Dis(int arr[][])
	{
		for(int i = 0; i < 2; i++)
		{
			
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			  System.out.println();
		}
	}
}


public class MatrixMultiplication {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int [2][2];
		int [][] arr1 = new int[2][2];
		int [][] arr2 = new int[2][2];
		
		int i  = 0;
		int j = 0;
		System.out.println("Enter the First Matrix Element : ");
		for(i  = 0; i < 2; i++)
		{
			for(j = 0; j < 2; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int x  = 0;
		int y = 0;
		System.out.println("Enter the second Matrix Element : ");
		for(x  = 0; x < 2; x++)
		{
			for(y = 0; y < 2; y++)
			{
				arr1[x][y] = sc.nextInt();
			}
		}
		
		DisplayArray dsa = new DisplayArray();
		
		System.out.println("First matrix of : ");
		dsa.Dis(arr);
		
		System.out.println("Second matrix of : ");
		dsa.Dis(arr1);
		
		
		for(int m = 0; m < 2; m++)
		{
			for(int n = 0; n < 2; n++)
			{
				arr2[m][n] = arr[m][n] * arr1[m][n];
				
			}
		}
		System.out.println(" Addition of Two Matrix : ");
		dsa.Dis(arr2);
		
	}

}
